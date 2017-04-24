/**
 * 
 */
package score.test;

import static org.junit.Assert.*;

import org.junit.Test;

import score.Score;

/**
 * @author suzaneringoringo
 *
 */
public class ScoreTest {
  private Score s = new Score();
  /**
   * Test method for {@link score.Score#Score()}.
   */
  @Test
  public void testScore() {
    assertEquals("Constructor: Score Error!", 0, s.getScore());
  }

  /**
   * Test method for {@link score.Score#Score(int)}.
   */
  @Test
  public void testScoreInt() {
    s = new Score(3);
    assertEquals("Constructor: Score Error!", 3, s.getScore());
  }

  /**
   * Test method for {@link score.Score#setScore(int)}.
   */
  @Test
  public void testSetScore() {
    s.setScore(3);
    assertEquals("Constructor: Score Error!", 3, s.getScore());
  }

  /**
   * Test method for {@link score.Score#increaseScoreBy(int)}.
   */
  @Test
  public void testIncreaseScoreBy() {
    s.increaseScoreBy(2);
    assertEquals("Constructor: Score Error!", 2, s.getScore());
  }

  /**
   * Test method for {@link score.Score#getScore()}.
   */
  @Test
  public void testGetScore() {
    assertEquals("Constructor: Score Error!", 0, s.getScore());
  }

}