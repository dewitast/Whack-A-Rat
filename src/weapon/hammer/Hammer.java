package weapon.hammer;

import point.Point;
import weapon.Weapon;

/**
 * @author NIM / Nama  : 13515021 / Dewita Sonya Tarabunga
 *  Nama file  : Hammer.java
 */

public class Hammer extends Weapon {
  /**
   * Konstruktor
   */
  public Hammer() {
    super();
  }

  /**
   * Konstruktor dengan parameter.
   * @param pos Objek point yang menyatakan posisi palu.
   * @param pow Nilai yang menyatakan kekuatan dari palu.
   */
  public Weapon(Point pos, int pow) {
    super(pos, pow);
  }
}
