/**
 * 
 */
package score;

import java.awt.event.ActionListener;

/**
 * @author suzaneringoringo
 *
 */
public class ScoreController {
  /**
   * Score (model) yang dikendalikan
   */
  private Score myScore;
  /**
   * ScoreView (view) yang dikendalikan
   */
  private ScoreView myScoreView;
  /**
   * Penerima aksi
   */
  private ActionListener actionListener;
  
  /**
   * Konstruktor
   * @param parScore model yang dikendalikan
   * @param parScoreView view yang dikendalikan
   */
  public ScoreController(Score parScore, ScoreView parScoreView) {
    myScore = parScore;
    myScoreView = parScoreView;
  }
  
  /**
   * Prosedur kontrol
   */
  public void control() {
    
  }
  
  /**
   * Menambah nilai skor pada model
   * @param parScore penambah nilai skor pada model
   */
  public void increaseScoreBy(int parScore) {
    myScore.increaseScoreBy(parScore);
    myScoreView.setScore(myScore.getScore());
  }
}