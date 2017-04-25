package animal.species;

import animal.Animal;

/**
 * Kelas Cockroach (Cockroach.java)
 * @author NIM/Nama: 13515032/Helena Suzane Graciella
 */
public final class Cockroach extends Animal {
  /**
   * Atribut skor kecoa.
   */
  private static final int cockroachScore = 5;
  /**
   * Atribut HP kecoa.
   */
  private static final int cockroachHP = 1;
  /**
   * Atribut kecepatan kecoa.
   */
  private static final int cockroachSpeed = 25;
  /**
   * Konstruktor.
   */
  public Cockroach() {
    super(cockroachScore, cockroachHP, cockroachSpeed);
  }
}