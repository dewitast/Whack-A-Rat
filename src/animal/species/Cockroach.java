package animal.species;

import animal.Animal;
import point.Point;

/**
 * @author suzaneringoringo
 *
 */
public final class Cockroach extends Animal {

  /**
   * Konstuktor.
   */
  public Cockroach() {
    super(5, defaultPosition, 1, 1, null);
  }
  
  /**
   * Konstruktor dengan parameter.
   * @param parScore skor yang didapat jika membunuh hewan
   * @param parPosition lokasi hewan
   * @param parHP health point hewan
   * @param parSpeed kecepatan hewan
   * @param parFile string berisi nama file yang menunjukkan nama hewan.
   */
  public Cockroach(int parScore, Point parPoint, int parDefaultHP, int parSpeed, String parFile) {
    super(parScore, parPoint, parDefaultHP, parSpeed, parFile);
  }

}
