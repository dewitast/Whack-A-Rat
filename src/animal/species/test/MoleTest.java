package animal.species.test;

import static org.junit.Assert.*;

import org.junit.Test;

import animal.species.Mole;
import point.Point;

public class MoleTest {
  private Mole c = new Mole();
  
  @Test
  public void testMole() {
    assertEquals("Constructor: Score Error!", 5, c.getScore());
    assertEquals("Constructor: Position Error!", 0, c.getPosition().getAbsis());
    assertEquals("Constructor: Position Error!", 0, c.getPosition().getOrdinat());
    assertEquals("Constructor: HP Error!", 1, c.getHP());
    assertEquals("Constructor: Speed Error!", 1, c.getSpeed());
    //assertEquals("Constructor: File Error!", "", c.getNamaFile());
  }

  @Test
  public void testMoleIntPointIntIntString() {
    Point p = new Point(1,1);
    c = new Mole(1, p, 2, 2, "as.txt");
    assertEquals("Constructor: Score Error!", 1, c.getScore());
    assertEquals("Constructor: Position Error!", 1, c.getPosition().getAbsis());
    assertEquals("Constructor: Position Error!", 1, c.getPosition().getOrdinat());
    assertEquals("Constructor: HP Error!", 2, c.getHP());
    assertEquals("Constructor: Speed Error!", 2, c.getSpeed());
    assertEquals("Constructor: File Error!", "as.txt", c.getNamaFile());
  }

  @Test
  public void testGetScore() {
    Point p = new Point(1,1);
    c = new Mole(1, p, 2, 2, "as.txt");
    assertEquals("getScore Error!", 1, c.getScore());
  }

  @Test
  public void testGetPosition() {
    Point p = new Point(1,1);
    c = new Mole(1, p, 2, 2, "as.txt");
    assertEquals("getPosition Error!", 1, c.getPosition().getAbsis());
    assertEquals("getPosition Error!", 1, c.getPosition().getOrdinat());
  }

  @Test
  public void testGetHP() {
    assertEquals("getHP Error!", 1, c.getHP());
  }

  @Test
  public void testGetSpeed() {
    assertEquals("getSpeed Error!", 1, c.getSpeed());
  }

  @Test
  public void testGetNamaFile() {
    Point p = new Point(1,1);
    c = new Mole(1, p, 2, 2, "as.txt");
    assertEquals("getNamaFile Error!", "as.txt", c.getNamaFile());
  }

  @Test
  public void testSetScore() {
    c.setScore(-1);
    assertEquals("setScore Error!", -1, c.getScore());
  }

  @Test
  public void testSetPosition() {
    Point p = new Point(1,2);
    c.setPosition(p);
    assertEquals("setPosition Error!", 1, c.getPosition().getAbsis());
    assertEquals("setPosition Error!", 2, c.getPosition().getOrdinat());
  }

  @Test
  public void testSetHP() {
    c.setHP(3);
    assertEquals("setHP Error!", 3, c.getHP());
  }

  @Test
  public void testSetSpeed() {
    c.setHP(3);
    assertEquals("setHP Error!", 3, c.getHP());
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
    c.changeSpeed(2);
    assertEquals("decreaseHP Error!", 3, c.getSpeed());
  }

}
