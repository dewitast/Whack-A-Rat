package animal.species;

import animal.Animal;
/**
 * @author NIM / Nama : 13515144 / William
 * file : Hamster.java
 */
public class Hamster extends Animal {
  private static final int hamsterScore = -5;
  private static final int hamsterHP = 1;
  private static final int hamsterSpeed = 50;
  /**
   * Kosntruktor
   */
  public Hamster() {
    super(hamsterScore, hamsterHP, hamsterSpeed);
  }

}
