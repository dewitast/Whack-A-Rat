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
  /**
   * Atribut gambar-gambar judul menu High Score.
   */
  String[] url = {"img/highscore1.png","img/highscore2.png"};
  /**
   * Atribut label untuk peringkat pertama.
   */
  JLabel l1 = new JLabel();
  /**
   * Atribut label untuk peringkat kedua.
   */
  JLabel l2 = new JLabel();
  /**
   * Atribut label untuk peringkat ketiga.
   */
  JLabel l3 = new JLabel();
  /**
   * Atribut label untuk peringkat keempat.
   */
  JLabel l4 = new JLabel();
  /**
   * Atribut label untuk peringkat kelima.
   */
  JLabel l5 = new JLabel();
  
  /**
   * Konstruktor.
   */
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
  
  /**
  * Menambahkan label (peringkat) baru.
  * @param jl label yang baru.
  */
  public void addLabel(JLabel jl) {
    add(jl);
    jl.setAlignmentX(Component.CENTER_ALIGNMENT);
  }
  
  /**
   * Mengembalikan label peringkat pertama.
   * @return l1.
   */
  public JLabel getL1() {
    return l1;
  }
  
  /**
   * Mengembalikan label peringkat kedua.
   * @return l2.
   */
  public JLabel getL2() {
    return l2;
  }
  
  /**
   * Mengembalikan label peringkat ketiga.
   * @return l3.
   */
  public JLabel getL3() {
    return l3;
  }
  
  /**
   * Mengembalikan label peringkat keempat.
   * @return l4.
   */
  public JLabel getL4() {
    return l4;
  }
  
  /**
   * Mengembalikan label peringkat kelima.
   * @return l5.
   */
  public JLabel getL5() {
    return l5 ;
  }
  
}
