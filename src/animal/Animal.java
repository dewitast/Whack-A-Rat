package animal;

/** 
 * Kelas Animal (Animal.java)
 * @author NIM/Nama: 13515032, 13515144/Helena Suzane Graciella, William
 */
public abstract class Animal {
  /**
   * Atribut skor hewan.
   */
  protected int score;
  /**
   * Atribut HP hewan.
   */
  protected int hp;
  /**
   * Atribut kecepatan hewan.
   */
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
   * Konstruktor dengan parameter.
   * @param parScore skor yang didapat jika membunuh binatang.
   * @param parHP HP binatang.
   * @param parSpeed kecepatan binatang. 
   */
  public Animal(int parScore, int parHP, int parSpeed) {
    score = parScore;
    hp = parHP;
    speed = parSpeed;
  }
  /**
   * Mengembalikan skor binatang.
   * @return skor binatang.
   */
  public int getScore() {
    return score;
  }
   /**
   * Mengembalikan health point.
   * @return health point binatang.
   */
  public int getHP() {
    return hp;
  }
   /**
   * Mengembalikan kecepatan binatang.
   * @return kecepatan binatang.
   */
  public int getSpeed() {
    return speed;
  }
   /**
   * Mengatur skor binatang.
   * @param parScore skor binatang.
   */
  public void setScore(int parScore) {
    score = parScore;
  }
   /**
   * Mengatur health point.
   * @param parHP health point binatang.
   */
  public void setHP(int parHP) {
    hp = parHP;
  }
   /**
   * Mengatur kecepatan binatang.
   * @param parSpeed kecepatan binatang.
   */
  public void setSpeed(int parSpeed) {
    speed = parSpeed;
  }
  /**
   * Mengembalikan mati/hidup binatang.
   * @return isDead. 
   */
   public boolean isDead() {
     return (hp<=0);
   }
   /**
   * Mengurangi HP binatang.
   * @param power banyaknya pengurang HP.
   */
   public void decreaseHP(int power) {
     hp -= power;
   }
    /**
   * Mengubah kecepatan binatang.
   * @param changeDifference besarnya perubahan.
   */
   public void changeSpeed(int changeDifference) {
     speed += changeDifference; 
   }
}