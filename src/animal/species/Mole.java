package animal.species;

import animal.Animal;
import point.Point;

/**
 * @author suzaneringoringo
 *
 */
public class Mole extends Animal {

  /**
   * 
   */
  public Mole() {
    // TODO Auto-generated constructor stub
    super(5, defaultPosition, 1, 1);
  }
  
  public Mole(int parScore, Point parPoint, int parDefaultHP, int parSpeed) {
    super(parScore, parPoint, parDefaultHP, parSpeed);
  }

}
