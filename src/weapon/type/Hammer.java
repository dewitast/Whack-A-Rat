package weapon.type;

import point.Point;
import weapon.Weapon;

/**
 * Kelas Hammer (Hammer.java)
 * @author NIM/Nama: 13515021/Dewita Sonya Tarabunga
 */
public class Hammer extends Weapon {
  /**
   * Konstruktor.
   */
  public Hammer() {
    super();
  }

  /**
   * Konstruktor dengan parameter.
   * @param pos Objek point yang menyatakan posisi palu.
   * @param pow Nilai yang menyatakan kekuatan dari palu.
   */
  public Hammer(Point pos, int pow) {
    super(pos, pow);
  }
}
