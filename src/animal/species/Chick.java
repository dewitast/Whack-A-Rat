package animal.species;

import animal.Animal;

/**
 * Kelas Chick (Chick.java)
 * @author NIM/Nama: 13515144/William
 */
public class Chick extends Animal {
  /**
   * Atribut skor ayam.
   */
  private static final int chickScore = -5;
  /**
   * Atribut HP ayam.
   */
  private static final int chickHP = 1;
  /**
   * Atribut kecepatan ayam.
   */
  private static final int chickSpeed = 70;
  /**
   * Konstruktor.
   */
  public Chick() {
    super(chickScore, chickHP, chickSpeed);
  }
}