package animal.species;

import animal.Animal;
import point.Point;
/**
 * @author NIM / Nama : 13515144 / William
 * file : Hamster.java
 */
public class Hamster extends Animal {

  /**
   * Kosntruktor
   */
  public Hamster() {
    // TODO Auto-generated constructor stub
    super(-5, defaultPosition, 1, 1);
  }
  
  public Hamster(int parScore, Point parPoint, int parDefaultHP, int parSpeed) {
    super(parScore, parPoint, parDefaultHP, parSpeed);
  }
}
