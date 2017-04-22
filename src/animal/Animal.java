package animal;
import point.Point;

/**
 * @author NIM / Nama  : 13515032,13515144 / Helena Suzane Graciella, William
 *  Nama file  : Animal.java
 */

public abstract class Animal {
  protected int score;
  protected Point position;
  protected int hp;
  protected final int defaultHP;
  protected int speed;
  protected final static Point defaultPosition = new Point(0,0);
  protected String file;
  
  /**
   * Konstruktor.
   */
  public Animal() {
    score = 0;
    position.setAbsis(0);
    position.setOrdinat(0);
    defaultHP = 1;
    hp = 100;
    speed = 0;
    file = "";
  }
  /**
   * Konstruktor dengan parameter.
   * @param parScore skor yang didapat jika membunuh hewan
   * @param parPosition lokasi hewan
   * @param parHP health point hewan
   * @param parSpeed kecepatan hewan
   * @param parFile string berisi nama file yang menunjukkan nama hewan.
   */
  public Animal(int parScore, Point parPosition, int parHP, int parSpeed, String parFile) {
    score = parScore;
    position = parPosition;
    defaultHP = parHP;
    hp = defaultHP;
    speed = parSpeed;
    file = parFile;
  }
  /**
   * Mengembalikan skor binatang
   * @return skor binatang
   */
  public int getScore() {
    return score;
  }
  /**
   * Mengembalikan posisi binatang
   * @return posisi binatang
   */
  public Point getPosition() {
    return position;
  }
   /**
   * Mengembalikan health point
   * @return health point binatang
   */
  public int getHP() {
    return hp;
  }
   /**
   * Mengembalikan kecepatan binatang
   * @return kecepatan binatang
   */
  public int getSpeed() {
    return speed;
  }
  /**
   * Mengembalikan nama file yang merepresentasikan binatang.
   * @return nama file yang merepresentasikan binatang.
   */
  public String getNamaFile() {
	  return file;
  }
    /**
   * Mengatur skor binatang
   * @param skor binatang
   */
  public void setScore(int parScore) {
    score = parScore;
  }
  /**
   * Mengatur posisi binatang
   * @param posisi binatang
   */
  public void setPosition(Point parPosition) {
    position = parPosition;
  }
   /**
   * Mengatur health point
   * @param health point binatang
   */
  public void setHP(int parHP) {
    hp = parHP;
  }
   /**
   * Mengatur kecepatan binatang
   * @param kecepatan binatang
   */
  public void setSpeed(int parSpeed) {
    speed = parSpeed;
  }
  /**
   * Mengembalikan mati/hidup binatang
   * @return true jika mati, false jika hidup
   */
   public boolean isDead() {
     return (hp<=0);
   }
   /**
   * Mengurangi HP binatang
   * @param banyaknya pengurang HP
   */
   public void decreaseHP(int power) {
     hp -= power;
   }
    /**
   * Mengubah kecepatan binatang
   * @param besarnya perubahan
   */
   public void changeSpeed(int changeDifference) {
     speed += changeDifference; 
   }
}