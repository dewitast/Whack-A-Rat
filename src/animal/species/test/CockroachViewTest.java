/**
 * 
 */
package animal.species.test;

import static org.junit.Assert.*;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.junit.Test;

import animal.species.CockroachView;

/**
 * @author suzaneringoringo
 *
 */
public class CockroachViewTest {
  CockroachView cv = new CockroachView();
  /**
   * Test method for {@link animal.species.CockroachView#CockroachView()}.
   */
  @Test
  public void testCockroachView() {
    Image image1;
    Image image2;
    try {
      Image originalImage1 = ImageIO.read(new File("img/kecoakanan1.png")); 
      originalImage1 = originalImage1.getScaledInstance(50, 50, 1);
      BufferedImage bufferedOriginalImage1 = new BufferedImage(50, 50, BufferedImage.TYPE_INT_ARGB);
      bufferedOriginalImage1.getGraphics().drawImage(originalImage1, 0, 0, null);
      BufferedImage viewImage1 = new BufferedImage(50, 50, BufferedImage.TYPE_INT_ARGB);
      viewImage1.getGraphics().drawImage(cv.getImage1(), 0, 0, null);
      
      Image originalImage2 = ImageIO.read(new File("img/kecoakanan2.png")); 
      originalImage2 = originalImage2.getScaledInstance(50, 50, 1);
      BufferedImage bufferedOriginalImage2 = new BufferedImage(50, 50, BufferedImage.TYPE_INT_ARGB);
      bufferedOriginalImage2.getGraphics().drawImage(originalImage2, 0, 0, null);
      BufferedImage viewImage2 = new BufferedImage(50, 50, BufferedImage.TYPE_INT_ARGB);
      viewImage2.getGraphics().drawImage(cv.getImage2(), 0, 0, null);
      
      boolean imtrue1 = true;
      boolean imtrue2 = true;
      
      for (int y = 0; y < 50; y++) {
        for (int x = 0; x < 50; x++) {
          if (bufferedOriginalImage1.getRGB(x, y) != viewImage1.getRGB(x, y)) {
            imtrue1 = false;
            break;
          }
        }
      }
      
      for (int y = 0; y < 50; y++) {
        for (int x = 0; x < 50; x++) {
          if (bufferedOriginalImage2.getRGB(x, y) != viewImage2.getRGB(x, y)) {
            imtrue2 = false;
            break;
          }
        }
      }
      
      assertEquals(true, imtrue1);
      assertEquals(true, imtrue2);
    } catch (IOException e1) {
      // TODO Auto-generated catch block
      e1.printStackTrace();
    }
  }

}
