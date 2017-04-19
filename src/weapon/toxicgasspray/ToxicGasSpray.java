package weapon.ToxicGasSpray;

import point.Point;
import weapon.Weapon;

/**
 * @author NIM / Nama  : 13515021 / Dewita Sonya Tarabunga
 *  Nama file  : ToxicGasSpray.java
 */

public class ToxicGasSpray extends Weapon {
  /**
   * Konstruktor
   */
  public ToxicGasSpray() {
    super();
  }

  /**
   * Konstruktor dengan parameter.
   * @param pos Objek point yang menyatakan posisi racun.
   * @param pow Nilai yang menyatakan kekuatan dari racun.
   */
  public Weapon(Point pos, int pow) {
    super(pos, pow);
  }
}
