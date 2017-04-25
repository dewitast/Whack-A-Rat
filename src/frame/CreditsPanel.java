package frame;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class CreditsPanel extends JPanel {
  String[] url = {"img/credits1.png","img/credits2.png", "img/credits3.png"};
  JLabel l1; 
  
  public CreditsPanel() {  
    super();
    setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
    setOpaque(false);
    l1 = new JLabel(new ImageIcon("img/credits.png"));
    
    try {
      TimerImageSwapper tHeader = new TimerImageSwapper(url,400);
      add(tHeader);  
      add(l1);
            
      for (int i = 0; i < getComponents().length; ++i) {
        if (getComponent(i) instanceof JLabel) {
          JLabel label = (JLabel)getComponent(i);
          label.setForeground(Color.black);
          Font font = new Font(Font.SANS_SERIF, Font.BOLD, 22);
          label.setFont(font);
          label.setAlignmentX(Component.CENTER_ALIGNMENT);
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void addLabel(JLabel jl) {
    add(jl);
    jl.setAlignmentX(Component.CENTER_ALIGNMENT);
  }  
}