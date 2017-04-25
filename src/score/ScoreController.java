/**
 * 
 */
package score;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Kelas ScoreController (ScoreController.java)
 * @author NIM/Nama: 13515021/Dewita Sonya Tarabunga
 */
public class ScoreController {
  /**
   * Score (model) yang dikendalikan.
   */
  private Score myScore;
  /**
   * ScoreView (view) yang dikendalikan.
   */
  private ScoreView myScoreView;
  /**
   * Penerima aksi.
   */
  private static MouseAdapter score;
  
  /**
   * Konstruktor.
   * @param parScore model yang dikendalikan.
   * @param parScoreView view yang dikendalikan.
   */
  public ScoreController(Score parScore, ScoreView parScoreView) {
    myScore = parScore;
    myScoreView = parScoreView;
  }
  
  /**
   * Prosedur kontrol.
   */
  public MouseAdapter control(final int sc) {
    score = new MouseAdapter() {
      public void mouseReleased(MouseEvent mo) {
        increaseScoreBy(sc);
      }
    };
    return score;
  }
  
  /**
   * Menambah nilai skor pada model.
   * @param parScore penambah nilai skor pada model.
   */
  public void increaseScoreBy(int parScore) {
    myScore.increaseScoreBy(parScore);
    myScoreView.setScore(myScore.getScore());
  }
  
  public int getScore() {
    return myScore.getScore();
  }
}
