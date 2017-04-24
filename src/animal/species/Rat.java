package animal.species;

import animal.Animal;

/**
 * @author suzaneringoringo
 *
 */
public class Rat extends Animal {
  private static final int ratScore = 10;
  private static final int ratHP = 2;
  private static final int ratSpeed = 30;
  /**
   * Kosntruktor
   */
  public Rat() {
    super(ratScore, ratHP, ratSpeed);
  }

}