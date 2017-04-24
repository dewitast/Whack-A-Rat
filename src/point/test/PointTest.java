/**
 * 
 */
package point.test;

import static org.junit.Assert.*;

import org.junit.Test;

import point.Point;

/**
 * @author suzaneringoringo
 *
 */
public class PointTest {
  private Point p = new Point();
  
  /**
   * Test method for {@link point.Point#Point()}.
   */
  @Test
  public void testPoint() {
    assertEquals("Constructor: Absis Error!", 0, p.getAbsis());
    assertEquals("Constructor: Ordinat Error!", 0, p.getOrdinat());
  }

  /**
   * Test method for {@link point.Point#Point(int, int)}.
   */
  @Test
  public void testPointIntInt() {
    p = new Point(1,1);
    assertEquals("Constructor: Absis Error!", 1, p.getAbsis());
    assertEquals("Constructor: Ordinat Error!", 1, p.getOrdinat());
  }

  /**
   * Test method for {@link point.Point#setAbsis(int)}.
   */
  @Test
  public void testSetAbsis() {
    p.setAbsis(1);
    assertEquals("Constructor: Absis Error!", 1, p.getAbsis());
  }

  /**
   * Test method for {@link point.Point#getAbsis()}.
   */
  @Test
  public void testGetAbsis() {
    assertEquals("Constructor: Absis Error!", 0, p.getAbsis());
  }

  /**
   * Test method for {@link point.Point#setOrdinat(int)}.
   */
  @Test
  public void testSetOrdinat() {
    p.setOrdinat(1);
    assertEquals("Constructor: Ordinat Error!", 1, p.getOrdinat());
  }

  /**
   * Test method for {@link point.Point#getOrdinat()}.
   */
  @Test
  public void testGetOrdinat() {
    assertEquals("Constructor: Ordinat Error!", 0, p.getOrdinat());
  }

}
