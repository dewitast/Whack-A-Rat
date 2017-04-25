package point;

/**
 * Kelas Point (Point.java)
 * @author NIM/Nama: 13515032, 13515144/Helena Suzane Graciella, William
 */

public class Point {
  /**
   * Atribut absis pada Point.
   */
  private int absis;
  /**
   * Atribut ordinat pada Point.
   */
  private int ordinat;
  
  /**
   * Konstruktor.
   */
  public Point() {
    absis = 0;
    ordinat = 0;
  }
  
  /**
   * Konstruktor dengan parameter.
   * @param parAbsis absis dari Point yang akan dibangun.
   * @param parOrdinat ordinat dari Point yang akan dibangun.
   */
  public Point(int parAbsis, int parOrdinat) {
    absis = parAbsis;
    ordinat = parOrdinat;
  }
  
  /**
   * Mengatur nilai absis pada Point.
   * @param parAbsis absis baru untuk Point.
   */
  public void setAbsis(int parAbsis) {
    absis = parAbsis;
  }
  
  /**
   * Mengembalikan nilai absis pada Point.
   * @return absis.
   */
  public int getAbsis() {
    return absis;
  }
  
  /**
   * Mengatur nilai ordinat pada Point.
   * @param parOrdinat ordinat baru untuk Point.
   */
  public void setOrdinat(int parOrdinat) {
    ordinat = parOrdinat;
  }
  
  /**
   * Mengembalikan nilai ordinat pada Point.
   * @return ardinat.
   */
  public int getOrdinat() {
    return ordinat;
  }
  
}
