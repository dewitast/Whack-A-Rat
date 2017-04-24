package score;

public class ScoreController {
  private ScoreView view;
  private int score;
  
  /*
   * Konstruktor.
   */
  public ScoreController(ScoreView vi) {
    view = vi;
    score = 0;
  }
  
  /*
   * Menambah nilai sebanyak skor.
   * @param skor nilai perubahan skor.
   * I.S. sembarang.
   * F.S. skor berubah sesuai masukan.
   */
  public void addScore(int skor) {
    score += skor;
    view.setScore(score);
  }
}
