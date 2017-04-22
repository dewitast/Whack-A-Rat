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
    // TODO Auto-generated constructor stub
    super(-5, defaultPosition, 1, 1);
  }
  
  public Chick(int parScore, Point parPoint, int parDefaultHP, int parSpeed) {
    super(parScore, parPoint, parDefaultHP, parSpeed);
  }
}
