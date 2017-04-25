package animal.species.test;

import static org.junit.Assert.*;

import org.junit.Test;

import animal.species.Chick;

public class ChickTest {
  private Chick c = new Chick();
  
  @Test
  public void testChick() {
    assertEquals("Constructor: Score Error!", -5, c.getScore());
    assertEquals("Constructor: HP Error!", 1, c.getHP());
    assertEquals("Constructor: Speed Error!", 70, c.getSpeed());
    //assertEquals("Constructor: File Error!", "", c.getNamaFile());
  }

  @Test
  public void testGetScore() {
    assertEquals("getScore Error!", -5, c.getScore());
  }

  @Test
  public void testGetHP() {
    assertEquals("getHP Error!", 1, c.getHP());
  }

  @Test
  public void testGetSpeed() {
    assertEquals("getSpeed Error!", 70, c.getSpeed());
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
    c.decreaseHP(1);
    assertEquals("decreaseHP Error!", 0, c.getHP());
  }

  @Test
  public void testChangeSpeed() {
    c.changeSpeed(3);
    assertEquals("decreaseHP Error!", 73, c.getSpeed());
  }

}
