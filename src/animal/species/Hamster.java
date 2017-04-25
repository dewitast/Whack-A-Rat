package animal.species;

import animal.Animal;
/**
 * Kelas Hamster (Hamster.java)
 * @author NIM/Nama: 13515144/William
 */
public class Hamster extends Animal {
  private static final int hamsterScore = -5;
  private static final int hamsterHP = 1;
  private static final int hamsterSpeed = 50;
  /**
   * Konstruktor.
   */
  public Hamster() {
    super(hamsterScore, hamsterHP, hamsterSpeed);
  }

}
