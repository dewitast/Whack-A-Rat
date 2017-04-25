/**
 * 
 */
package frame.test;

import static org.junit.Assert.*;

import org.junit.Test;

import frame.GamePanel;
import score.ScoreController;
import score.ScoreView;
import weapon.Weapon;
import weapon.WeaponController;
import weapon.WeaponView;
import weapon.type.Hammer;

/**
 * @author suzaneringoringo
 *
 */
public class GamePanelTest {
  private WeaponView cursor = new WeaponView("img/hammer1.png", "img/hammer2.png", 20, 50);
  private Hammer weapon = new Hammer();
  private GamePanel gp = new GamePanel(cursor, weapon);
  /**
   * Test method for {@link frame.GamePanel
   * #GamePanel(weapon.WeaponView, weapon.Weapon)}.
   */
  @Test
  public void testGamePanel() {
    assertEquals("WeaponView Error!", true, gp.getWeaponView().equals(cursor));
  }

  /**
   * Test method for {@link frame.GamePanel#getWeaponView()}.
   */
  @Test
  public void testGetWeaponView() {
    assertEquals("WeaponView Error!", true, gp.getWeaponView().equals(cursor));
  }

  /**
   * Test method for {@link frame.GamePanel#getScoreView()}.
   */
  @Test
  public void testGetScoreView() {
    gp.getScoreView().setScore(2);
    assertEquals("ScoreView Error!", 2, gp.getScoreView().getScore());
  }

}
