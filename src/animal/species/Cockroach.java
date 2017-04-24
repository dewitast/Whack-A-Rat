package animal.species;

import animal.Animal;

/**
 * @author suzaneringoringo
 *
 */
public final class Cockroach extends Animal {
  private static final int cockroachScore = 5;
  private static final int cockroachHP = 1;
  private static final int cockroachSpeed = 25;
  /**
   * Kosntruktor
   */
  public Cockroach() {
    super(cockroachScore, cockroachHP, cockroachSpeed);
  }
}