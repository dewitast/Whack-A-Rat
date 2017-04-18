package point;

/**
 * @author NIM / Nama  : xxxxxxxxxxxxxxx
 *  Nama file  : Point.java
 */

public class Point {
  private int absis;
  private int ordinat;
  
  public Point() {
    absis = 0;
    ordinat = 0;
  }
  
  public Point(int parAbsis, int parOrdinat) {
    absis = parAbsis;
    ordinat = parOrdinat;
  }
  
  public void setAbsis(int parAbsis) {
    absis = parAbsis;
  }
  
  public int getAbsis() {
    return absis;
  }
  
  public void setOrdinat(int parOrdinat) {
    ordinat = parOrdinat;
  }
  
  public int getOrdinat() {
    return ordinat;
  }
  
}
