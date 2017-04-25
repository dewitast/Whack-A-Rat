/**
 * 
 */
package weapon.test;

import static org.junit.Assert.*;

import org.junit.Test;

import weapon.Weapon;
import weapon.WeaponController;
import weapon.WeaponView;
import weapon.type.Hammer;
import weapon.type.HammerView;

/**
 * @author suzaneringoringo
 *
 */
public class WeaponControllerTest {
  private Hammer h = new Hammer();
  private HammerView v = new HammerView();
  private WeaponController wc = new WeaponController(h, v);
  /**
   * Test method for {@link weapon.WeaponController#WeaponController(weapon.Weapon, weapon.WeaponView)}.
   */
  @Test
  public void testWeaponController() {
    assertEquals("Weapon Error", true, h.equals(wc.getWeapon()));
    assertEquals("WeaponView Error", true, v.equals(wc.getWeaponView()));
  }

  /**
   * Test method for {@link weapon.WeaponController#move(int, int)}.
   */
  @Test
  public void testMove() {
    wc.move(12, 12);
    assertEquals("Move Error", 12, wc.getWeapon().getPosition().getAbsis());
    assertEquals("Move Error", 12, wc.getWeapon().getPosition().getOrdinat());
  }

}
