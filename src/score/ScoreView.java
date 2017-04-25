package score;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 * Kelas ScoreView (ScoreView.java)
 * @author NIM/Nama: 13515032/Helena Suzane Graciella
 *
 */
public class ScoreView extends JLabel {
  private static final long serialVersionUID = 8196302564804509690L;
  /**
   * Atribut nilai skor pada ScoreView.
   */
  private int score;
  /**
   * Konstruktor dengan parameter.
   * @param parScore nilai skor yang akan ditampilkan.
   */
  public ScoreView(int parScore) {
    ImageIcon kayu = new ImageIcon("img/kayu.png");
    Image img = kayu.getImage();
    Image newimg = img.getScaledInstance(200, 100, java.awt.Image.SCALE_SMOOTH);
    kayu = new ImageIcon(newimg);
    setIcon(kayu);
    
    score = parScore;
    setText(Integer.toString(score));
    setFont(new Font("Purisa", Font.BOLD, 70));
    setOpaque(false);
    setForeground(Color.WHITE);
    setHorizontalTextPosition(JLabel.CENTER);
    setVerticalTextPosition(JLabel.CENTER);
    
  }
  
  /**
   * Mengubah nilai score.
   * @param parScore nilai skor pada view yang baru. 
   */
  public void setScore(int parScore) {
    //text.setText(Integer.toString(parScore));
    score = parScore;
    setText(Integer.toString(score));
  }
  
  /**
   * Mengembalikan nilai score pada ScoreView.
   * @return score.
   */
  public int getScore() {
    return score;
  }
  
}
