package animal.species;

import animal.Animal;
import point.Point;

/**
 * @author suzaneringoringo
 *
 */
public final class Cockroach extends Animal {

  /**
   * 
   */
  public Cockroach() {
    // TODO Auto-generated constructor stub
    super(5, defaultPosition, 1, 1);
  }
  
  public Cockroach(int parScore, Point parPoint, int parDefaultHP, int parSpeed) {
    super(parScore, parPoint, parDefaultHP, parSpeed);
  }

}
