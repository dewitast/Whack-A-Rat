package frame;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class HelpPanel extends JPanel {
  String[] url = {"img/help1.png","img/help2.png", "img/help3.png"};
  JPanel subPanel;
  
  public HelpPanel() {  
    super();
    setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
    setOpaque(false);
    try {
      TimerImageSwapper tHeader = new TimerImageSwapper(url,400);
    
      subPanel = new JPanel(new GridLayout(3,4));
      subPanel.setOpaque(false);
      
      String[] url1 = {"img/tikuskanan1.png", "img/tikuskanan2.png"};
      String[] url2 = {"img/bebekkanan1.png", "img/bebekkanan2.png"};
      String[] url3 = {"img/kecoakanan1.png", "img/kecoakanan2.png"};
      String[] url4 = {"img/hamsterkanan1.png", "img/hamsterkanan2.png"};
      String[] url5 = {"img/hammer1.png", "img/hammer2.png"};
      String[] url6 = {"img/spray1.png","img/spray2.png"};
      
      TimerImageSwapper tikus = new TimerImageSwapper(url1,300,150,50);
      TimerImageSwapper ayam = new TimerImageSwapper(url2,300,70,120);
      TimerImageSwapper kecoa = new TimerImageSwapper(url3,300,100,100);
      TimerImageSwapper hamster = new TimerImageSwapper(url4,300,100,80);
      TimerImageSwapper palu = new TimerImageSwapper(url5,300,80,80);
      TimerImageSwapper gas = new TimerImageSwapper(url6,300,80,80);
      
      JTextArea descTikus = new JTextArea("Tikus got yang hidup dibawah kerlap-kerlip kota metropolitan");
      JTextArea descAyam = new JTextArea("Ayam jangan dibunuh. Dia masih belum mengerti arti kehidupan");
      JTextArea descKecoa = new JTextArea("Kecoa yang menggelikan. Cepat basmi sebelum beranak pinak!");
      JTextArea descHamster = new JTextArea("Hamster yang polos dan imut suka tidur dimana saja. Apakah yang ia senangi? Biji bunga matahari");
      JTextArea descPalu = new JTextArea("Palu andalan yang handal dan bisa diandalkan digunakan oleh orang-orang andal");
      JTextArea descGas = new JTextArea("Gas beracun yang sangat ampuh membunuh makhluk hidup apapun");
      
      subPanel.add(tikus);
      subPanel.add(descTikus);
      subPanel.add(ayam);
      subPanel.add(descAyam);
      subPanel.add(kecoa);
      subPanel.add(descKecoa);
      subPanel.add(hamster);
      subPanel.add(descHamster);
      subPanel.add(palu);
      subPanel.add(descPalu);
      subPanel.add(gas);
      subPanel.add(descGas);
      
      add(tHeader);
      add(subPanel);
      
      for (int i = 0; i < getComponents().length; ++i) {
        if (getComponent(i) instanceof JLabel) {
          JLabel label = (JLabel)getComponent(i);
          label.setAlignmentX(Component.CENTER_ALIGNMENT);
          label.setOpaque(false);
        }
      }    
      
      for (int i = 0; i < subPanel.getComponents().length; ++i) {
        if (subPanel.getComponent(i) instanceof JTextArea) {
          JTextArea text = (JTextArea)subPanel.getComponent(i);
          text.setForeground(Color.black);
          Font font = new Font(Font.SANS_SERIF, Font.BOLD, 14);
          text.setFont(font);
          text.setLineWrap(true);
          text.setOpaque(false);
        }
      }
      setVisible(false);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  
  public void addLabel(JLabel jl) {
    add(jl);
    jl.setAlignmentX(Component.CENTER_ALIGNMENT);
  }  
}