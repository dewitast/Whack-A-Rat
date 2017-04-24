/**
 * 
 */
package score;

/**
 * @author suzaneringoringo
 *
 */
public final class Score {
  /**
   * Properti nilai Score
   */
  private int currentScore;
  
  /**
   * Konstruktor
   */
  public Score() {
    currentScore = 0; 
  }
  
  /**
   * Konstruktor dengan parameter
   * @param parScore currentScore dari Score yang akan dibangun
   */
  public Score(int parScore) {
    currentScore = parScore;
  }
  
  /**
   * Mengubah nilai currentScore
   * @param parScore nilai currentScore yang baru 
   */
  public void setScore(int parScore) {
    currentScore = parScore;
  }
  
  /**
   * Menambah nilai currentScore
   * @param increaser penambah nilai currentScore;
   */
  public void increaseScoreBy(int increaser) {
    currentScore = currentScore + increaser;
  }
  
  /**
   * Mengembalikan nilai currentScore
   * @return nilai currentScore
   */
  public int getScore() {
    return currentScore;
  }
}