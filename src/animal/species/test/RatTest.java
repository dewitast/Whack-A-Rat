package animal.species.test;

import static org.junit.Assert.*;

import org.junit.Test;

import animal.species.Rat;

public class RatTest {
  private Rat c = new Rat();
  
  @Test
  public void testRat() {
    assertEquals("Constructor: Score Error!", 10, c.getScore());
    assertEquals("Constructor: HP Error!", 2, c.getHP());
    assertEquals("Constructor: Speed Error!", 30, c.getSpeed());
    //assertEquals("Constructor: File Error!", "", c.getNamaFile());
  }

  @Test
  public void testGetScore() {
    assertEquals("getScore Error!", 10, c.getScore());
  }

  @Test
  public void testGetHP() {
    assertEquals("getHP Error!", 2, c.getHP());
  }

  @Test
  public void testGetSpeed() {
    assertEquals("getSpeed Error!", 30, c.getSpeed());
  }

  @Test
  public void testSetScore() {
    c.setScore(-1);
    assertEquals("setScore Error!", -1, c.getScore());
  }

  @Test
  public void testSetHP() {
    c.setHP(3);
    assertEquals("setHP Error!", 3, c.getHP());
  }

  @Test
  public void testSetSpeed() {
    c.setSpeed(3);
    assertEquals("setSpeed Error!", 3, c.getSpeed());
  }

  @Test
  public void testIsDead() {
    assertEquals("isDead Error!", false, c.isDead());
  }

  @Test
  public void testDecreaseHP() {
    c.decreaseHP(2);
    assertEquals("decreaseHP Error!", 0, c.getHP());
  }

  @Test
  public void testChangeSpeed() {
    c.changeSpeed(3);
    assertEquals("decreaseHP Error!", 33, c.getSpeed());
  }

}
