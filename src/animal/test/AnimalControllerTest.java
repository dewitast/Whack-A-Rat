/**
 * 
 */
package animal.test;

import static org.junit.Assert.*;

import org.junit.Test;

import animal.Animal;
import animal.AnimalController;
import animal.AnimalView;
import animal.species.Hamster;
import animal.species.HamsterView;

/**
 * @author suzaneringoringo
 *
 */
public class AnimalControllerTest {
  private Hamster h = new Hamster(); 
  private HamsterView hv = new HamsterView();
  AnimalController ac = new AnimalController(h, hv);
  
  /**
   * Test method for {@link animal.AnimalController#AnimalController(animal.Animal, animal.AnimalView)}.
   */
  @Test
  public void testAnimalController() {
    fail("Not yet implemented");
  }

  /**
   * Test method for {@link animal.AnimalController#resetScore()}.
   */
  @Test
  public void testResetScore() {
    assertEquals("Reset Score Error!", 0, ac.getScore());
  }

  /**
   * Test method for {@link animal.AnimalController#getScore()}.
   */
  @Test
  public void testGetScore() {
    assertEquals("Reset Score Error!", 0, ac.getScore());
  }

}
