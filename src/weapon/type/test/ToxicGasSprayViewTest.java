/**
 * 
 */
package weapon.type.test;

import static org.junit.Assert.*;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.junit.Test;

import weapon.type.ToxicGasSprayView;

/**
 * @author suzaneringoringo
 *
 */
public class ToxicGasSprayViewTest {
  ToxicGasSprayView tcgv = new ToxicGasSprayView();
  /**
   * Test method for {@link weapon.type.ToxicGasSprayView#ToxicGasSprayView()}.
   */
  @Test
  public void testToxicGasSprayView() {
    Image image1;
    Image image2;
    try {
      Image originalImage1 = ImageIO.read(new File("img/spray1.png")); 
      originalImage1 = originalImage1.getScaledInstance(64, 64, 1);
      BufferedImage bufferedOriginalImage1 = new BufferedImage(64, 64, BufferedImage.TYPE_INT_ARGB);
      bufferedOriginalImage1.getGraphics().drawImage(originalImage1, 0, 0, null);
      BufferedImage viewImage1 = new BufferedImage(64, 64, BufferedImage.TYPE_INT_ARGB);
      viewImage1.getGraphics().drawImage(tcgv.getImage(), 0, 0, null);
      
      Image originalImage2 = ImageIO.read(new File("img/spray2.png")); 
      originalImage2 = originalImage2.getScaledInstance(64, 64, 1);
      BufferedImage bufferedOriginalImage2 = new BufferedImage(64, 64, BufferedImage.TYPE_INT_ARGB);
      bufferedOriginalImage2.getGraphics().drawImage(originalImage2, 0, 0, null);
      BufferedImage viewImage2 = new BufferedImage(64, 64, BufferedImage.TYPE_INT_ARGB);
      viewImage2.getGraphics().drawImage(tcgv.getImageClicked(), 0, 0, null);
      
      boolean imtrue1 = true;
      boolean imtrue2 = true;
      
      for (int y = 0; y < 64; y++) {
        for (int x = 0; x < 64; x++) {
          if (bufferedOriginalImage1.getRGB(x, y) != viewImage1.getRGB(x, y)) {
            imtrue1 = false;
            break;
          }
        }
      }
      
      for (int y = 0; y < 64; y++) {
        for (int x = 0; x < 64; x++) {
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
