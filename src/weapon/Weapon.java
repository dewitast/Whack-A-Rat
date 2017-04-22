package weapon;

import point.Point;

/**
 * @author NIM / Nama  : 13515021 / Dewita Sonya Tarabunga
 *  Nama file  : Weapon.java
 */

public abstract class Weapon {
  private Point position;
  private int power;

  /**
   * Konstruktor
   */
  public Weapon() {
    position = new Point(0, 0);
    power = 0;
  }

  /**
   * Konstruktor dengan parameter.
   * @param pos Objek point yang menyatakan posisi senjata.
   * @param pow Nilai yang menyatakan kekuatan dari senjata.
   */
  public Weapon(Point pos, int pow) {
    position.setAbsis(pos.getAbsis());
    position.setOrdinat(pos.getOrdinat());
    power = pow;
  }

  /**
   * Mengembalikan posisi senjata.
   * @return posisi binatang.
   */
  public Point getPosition() {
  	return position;
  }

  /**
   * Mengembalikan nilai kekuatan senjata.
   * @return power senjata.
   */
  public int getPower() {
  	return power;
  }

  /**
   * Mengatur kekuatan senjata.
   * @param kekuatan senjata.
   */
  public void setPower(int pow) {
  	power = pow;
  }

  /**
   * Mengatur posisi senjata.
   * @param posisi senjata.
   */
  public void setPosition(Point pos) {
  	position.setAbsis(pos.getAbsis());
  	position.setOrdinat(pos.getOrdinat());
  }
}
