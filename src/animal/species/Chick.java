package animal.species;

import animal.Animal;

/**
 * @author NIM / Nama : 13515144 / William
 * file : Chick.java
 */
public class Chick extends Animal {
  private static final int chickScore = -5;
  private static final int chickHP = 1;
  private static final int chickSpeed = 70;
  /**
   * Kosntruktor
   */
  public Chick() {
    super(chickScore, chickHP, chickSpeed);
  }
}