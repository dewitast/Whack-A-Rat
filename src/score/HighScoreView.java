package score;

import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import frame.TimerImageSwapper;

public class HighScoreView extends JPanel {
  String[] url = {"img/highscore1.png","img/highscore2.png"};
  JLabel l1 = new JLabel();
  JLabel l2 = new JLabel();
  JLabel l3 = new JLabel();
  JLabel l4 = new JLabel();
  JLabel l5 = new JLabel();
  
  public HighScoreView(){
    super();
    setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
    setOpaque(false);
    try {
      TimerImageSwapper tHeader = new TimerImageSwapper(url,400);
    
      add(tHeader);  
      add(l1);
      add(l2);
      add(l3);
      add(l4);
      add(l5);
      
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
}