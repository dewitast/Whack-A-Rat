package frame;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Kelas CreditsPanel (CreditsPanel.java)
 * @author NIM/Nama: 13515087/Audry Nyonata
 */
public class CreditsPanel extends JPanel {
  private static final long serialVersionUID = 1L;
  /**
   * Atribut gambar-gambar yang dipakai pada menu credits.
   */
  String[] url = {"img/credits1.png","img/credits2.png", "img/credits3.png"};
  /**
   * Atribut label pada CreditsPanel.
   */
  JLabel l1; 
  
  /**
   * Konstruktor.
   */
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

  /**
   * Menambahkan label baru pada CreditsPanel.
   * @param jl label baru yang akan ditambahkan ke CreditsPanel.
   */
  public void addLabel(JLabel jl) {
    add(jl);
    jl.setAlignmentX(Component.CENTER_ALIGNMENT);
  }  
}