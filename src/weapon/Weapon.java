package weapon;

import point.Point;

/**
 * Kelas Weapon (Weapon.java)
 * @author NIM/Nama: 13515021/Dewita Sonya Tarabunga
 */

public abstract class Weapon {
  /**
   * Atribut posisi Weapon.
   */
  private Point position;
  /**
   * Atribut kekuatan Weapon.
   */
  private int power;

  /**
   * Konstruktor.
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
   * @param pow kekuatan senjata.
   */
  public void setPower(int pow) {
  	power = pow;
  }

  /**
   * Mengatur posisi senjata.
   * @param pos posisi senjata.
   */
  public void setPosition(Point pos) {
  	position.setAbsis(pos.getAbsis());
  	position.setOrdinat(pos.getOrdinat());
  }
  
  /**
   * Mengatur posisi senjata.
   * @param abs nilai absis posisi senjata.
   * @param ord nilai ordinat posisi senjata.
   */
  public void setPosition(int abs, int ord) {
    position.setAbsis(abs);
    position.setOrdinat(ord);
  }
}
