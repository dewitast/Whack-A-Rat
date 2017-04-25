/**
 * 
 */
package score.test;

import static org.junit.Assert.*;

import org.junit.Test;

import score.ScoreView;

/**
 * @author suzaneringoringo
 *
 */
public class ScoreViewTest {
  ScoreView sv = new ScoreView(3);
  
  /**
   * Test method for {@link score.ScoreView#ScoreView(int)}.
   */
  @Test
  public void testScoreView() {
    assertEquals("Score Error", 3, sv.getScore());
  }

  /**
   * Test method for {@link score.ScoreView#setScore(int)}.
   */
  @Test
  public void testSetScore() {
    sv.setScore(7);
    assertEquals("Score Error", 7, sv.getScore());
  }

  /**
   * Test method for {@link score.ScoreView#getScore()}.
   */
  @Test
  public void testGetScore() {
    assertEquals("Score Error", 3, sv.getScore());
  }

}
