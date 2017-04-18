/**
 * 
 */
package animal;

/**
 * @author suzaneringoringo
 *
 */
public abstract class Animal {
  int score;
  int hp;
  final int defaultHP;
  int speed;
  
  protected Animal(int _score, int _defaultHP, int _speed) {
    score = _score;
    defaultHP = _defaultHP;
    hp = defaultHP;
    speed = _speed;
  }
  
  public int getScore() {
    return score;
  }
  
  public void setScore(int _score) {
    score = _score;
  }
  
  public int getHP() {
    return hp;
  }
  
  public void setHP(int _HP) {
    hp = _HP;
  }
  
  public void reduceHP(int reducer) {
    hp = hp - reducer;
  }
  
  public int getDefaultHP() {
    return defaultHP;
  }
  
  public int getSpeed() {
    return speed;
  }
  
  public void setSpeed(int _speed) {
    speed = _speed;
  }
  
  public void increaseSpeed(int increaser) {
    speed = speed + increaser;
  }
}
