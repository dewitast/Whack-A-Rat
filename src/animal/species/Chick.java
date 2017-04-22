package animal.species;

import animal.Animal;
import point.Point;

/**
 * @author NIM / Nama : 13515144 / William
 * file : Chick.java
 */
public class Chick extends Animal {
	
  /**
   * Kosntruktor
   */
  public Chick() {
    super(-5, defaultPosition, 1, 1, null);
  }
  
  /**
   * Konstruktor dengan parameter.
   * @param parScore skor yang didapat jika membunuh hewan
   * @param parPosition lokasi hewan
   * @param parHP health point hewan
   * @param parSpeed kecepatan hewan
   */
  public Chick(int parScore, Point parPoint, int parDefaultHP, int parSpeed, String parFile) {
    super(parScore, parPoint, parDefaultHP, parSpeed, parFile);
  }
}
