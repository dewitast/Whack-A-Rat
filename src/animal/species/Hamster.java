package animal.species;

import animal.Animal;
/**
 * Kelas Hamster (Hamster.java)
 * @author NIM/Nama: 13515144/William
 */
public class Hamster extends Animal {
  /**
   * Atribut skor hamster.
   */
  private static final int hamsterScore = -5;
  /**
   * Atribut HP hamster.
   */
  private static final int hamsterHP = 1;
  /**
   * Atribut kecepatan hamster.
   */
  private static final int hamsterSpeed = 50;
  /**
   * Konstruktor.
   */
  public Hamster() {
    super(hamsterScore, hamsterHP, hamsterSpeed);
  }

}
