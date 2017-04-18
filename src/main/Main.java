/**
 * 
 */
package main;

import animal.mole.Mole;
import animal.cockroach.Cockroach;
import point.Point;

/**
 * @author suzaneringoringo
 *
 */
public class Main {

  /**
   * @param args
   */
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Mole mole1 = new Mole();
    Cockroach cockroach1 = new Cockroach();
    System.out.println("Skor mole: " + mole1.getScore());
    System.out.println("Skor cockroach: " + cockroach1.getScore());
    System.out.println(mole1.getPosition().getAbsis() + "," + mole1.getPosition().getOrdinat());
  }

}
