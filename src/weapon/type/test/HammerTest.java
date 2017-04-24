/**
 * 
 */
package weapon.type.test;

import static org.junit.Assert.*;

import org.junit.Test;

import point.Point;
import weapon.type.Hammer;

/**
 * @author suzaneringoringo
 *
 */
public class HammerTest {
  private Hammer h = new Hammer();
  /**
   * Test method for {@link weapon.type.Hammer#Hammer()}.
   */
  @Test
  public void testHammer() {
    assertEquals("Constructor: Power Error!", 0, h.getPower());
    assertEquals("Constructor: Position Error!", 0, h.getPosition().getAbsis());
    assertEquals("Constructor: Position Error!", 0, h.getPosition().getOrdinat());
  }

  /**
   * Test method for {@link weapon.type.Hammer#Hammer(point.Point, int)}.
   */
  @Test
  public void testHammerPointInt() {
    Point p = new Point(1,1);
    h = new Hammer(p, 1);
    assertEquals("Constructor: Power Error!", 1, h.getPower());
    assertEquals("Constructor: Position Error!", 1, h.getPosition().getAbsis());
    assertEquals("Constructor: Position Error!", 1, h.getPosition().getOrdinat());
  }

  /**
   * Test method for {@link weapon.Weapon#getPosition()}.
   */
  @Test
  public void testGetPosition() {
    assertEquals("Constructor: Position Error!", 0, h.getPosition().getAbsis());
    assertEquals("Constructor: Position Error!", 0, h.getPosition().getOrdinat());
  }

  /**
   * Test method for {@link weapon.Weapon#getPower()}.
   */
  @Test
  public void testGetPower() {
    assertEquals("Constructor: Power Error!", 0, h.getPower());
  }

  /**
   * Test method for {@link weapon.Weapon#setPower(int)}.
   */
  @Test
  public void testSetPower() {
    h.setPower(2);
    assertEquals("Constructor: Power Error!", 2, h.getPower());
  }

  /**
   * Test method for {@link weapon.Weapon#setPosition(point.Point)}.
   */
  @Test
  public void testSetPositionPoint() {
    Point p = new Point(3,3);
    h.setPosition(p);
    assertEquals("Constructor: Position Error!", 3, h.getPosition().getAbsis());
    assertEquals("Constructor: Position Error!", 3, h.getPosition().getOrdinat());
  }

  /**
   * Test method for {@link weapon.Weapon#setPosition(int, int)}.
   */
  @Test
  public void testSetPositionIntInt() {
    h.setPosition(2,2);
    assertEquals("Constructor: Position Error!", 2, h.getPosition().getAbsis());
    assertEquals("Constructor: Position Error!", 2, h.getPosition().getOrdinat());
  }

}
