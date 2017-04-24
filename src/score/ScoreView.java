package score;

import java.awt.Font;

import javax.swing.JLabel;

public class ScoreView extends JLabel {
  private static final long serialVersionUID = -4451877747129218432L;

  /*
   * Konstruktor.
   */
  public ScoreView() {
    setText("Score : 0");
    Font font = new Font(Font.SANS_SERIF, Font.BOLD, 22);
    setFont(font);
  }
  
  /*
   * Mengatur skor yang terlihat di layar.
   * @param score nilai skor yang akan ditampilkan.
   * I.S. sembarang.
   * F.S. nilai score tampak di layar
   */
  public void setScore(int score) {
    setText("Score : " + score);
  }
}
