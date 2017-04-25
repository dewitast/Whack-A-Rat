package animal.species;

import animal.Animal;

/**
 * Kelas Rat (Rat.java)
 * @author NIM/Nama: 13515032/Helena Suzane Graciella
 */
public class Rat extends Animal {
  /**
   * Atribut skor tikus.
   */
  private static final int ratScore = 10;
  /**
   * Atribut HP tikus.
   */
  private static final int ratHP = 2;
  /**
   * Atribut kecepatan tikus.
   */
  private static final int ratSpeed = 30;
  /**
   * Konstruktor.
   */
  public Rat() {
    super(ratScore, ratHP, ratSpeed);
  }

}