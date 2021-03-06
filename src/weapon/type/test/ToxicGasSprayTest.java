/**
 * 
 */
package weapon.type.test;

import static org.junit.Assert.*;

import org.junit.Test;

import point.Point;
import weapon.type.ToxicGasSpray;

/**
 * @author suzaneringoringo
 *
 */
public class ToxicGasSprayTest {
  private ToxicGasSpray h = new ToxicGasSpray();
  /**
   * Test method for {@link weapon.type.ToxicGasSpray#ToxicGasSpray()}.
   */
  @Test
  public void testToxicGasSpray() {
    assertEquals("Constructor: Power Error!", 0, h.getPower());
    assertEquals("Constructor: Position Error!", 0, h.getPosition().getAbsis());
    assertEquals("Constructor: Position Error!", 0, h.getPosition().getOrdinat());
  }

  /**
   * Test method for {@link weapon.type.ToxicGasSpray#ToxicGasSpray(point.Point, int)}.
   */
  @Test
  public void testToxicGasSprayPointInt() {
    Point p = new Point(1,1);
    h = new ToxicGasSpray(p, 1);
    assertEquals("Constructor: Power Error!", 1, h.getPower());
    assertEquals("Constructor: Position Error!", 1, h.getPosition().getAbsis());
    assertEquals("Constructor: Position Error!", 1, h.getPosition().getOrdinat());
  }

  /**
   * Test method for {@link weapon.Weapon#getPosition()}.
   */
  @Test
  public void testGetPosition() {
    assertEquals("Position Error!", 0, h.getPosition().getAbsis());
    assertEquals("Position Error!", 0, h.getPosition().getOrdinat());
  }

  /**
   * Test method for {@link weapon.Weapon#getPower()}.
   */
  @Test
  public void testGetPower() {
    assertEquals("Power Error!", 0, h.getPower());
  }

  /**
   * Test method for {@link weapon.Weapon#setPower(int)}.
   */
  @Test
  public void testSetPower() {
    h.setPower(2);
    assertEquals("Power Error!", 2, h.getPower());
  }

  /**
   * Test method for {@link weapon.Weapon#setPosition(point.Point)}.
   */
  @Test
  public void testSetPositionPoint() {
    Point p = new Point(3,3);
    h.setPosition(p);
    assertEquals("Position Error!", 3, h.getPosition().getAbsis());
    assertEquals("Position Error!", 3, h.getPosition().getOrdinat());
  }

  /**
   * Test method for {@link weapon.Weapon#setPosition(int, int)}.
   */
  @Test
  public void testSetPositionIntInt() {
    h.setPosition(2,2);
    assertEquals("Position Error!", 2, h.getPosition().getAbsis());
    assertEquals("Position Error!", 2, h.getPosition().getOrdinat());
  }

}
