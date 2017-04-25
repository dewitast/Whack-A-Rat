package animal;

/**
 * @author NIM / Nama  : 13515032,13515144 / Helena Suzane Graciella, William
 *  Nama file  : Animal.java
 */

public abstract class Animal {
  protected int score;
  protected int hp;
  protected int speed;
  
  /**
   * Konstruktor.
   */
  public Animal() {
    score = 0;
    hp = 0;
    speed = 0;
  }
  /**
   * Kostruktor dengan parameter.
   * @param parScore skor yang didapat jika membunuh binatang
   * @param parHP HP binatang
   * @param parSpeed kecepatan binatang 
   */
  public Animal(int parScore, int parHP, int parSpeed) {
    score = parScore;
    hp = parHP;
    speed = parSpeed;
  }
  /**
   * Mengembalikan skor binatang
   * @return skor binatang
   */
  public int getScore() {
    return score;
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
   * Mengatur skor binatang
   * @param skor binatang
   */
  public void setScore(int parScore) {
    score = parScore;
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
   public void decreaseHP() {
     hp -= 1;
   }
    /**
   * Mengubah kecepatan binatang
   * @param besarnya perubahan
   */
   public void changeSpeed(int changeDifference) {
     speed += changeDifference; 
   }
}