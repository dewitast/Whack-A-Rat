/**
 * 
 */
package animal.test;

import static org.junit.Assert.*;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import org.junit.Test;

import animal.AnimalView;

/**
 * @author suzaneringoringo
 *
 */
public class AnimalViewTest {
  AnimalView av = new AnimalView("img/kecoakanan1.png", "img/kecoakanan2.png", 50, 50);
  
  /**
   * Test method for {@link animal.AnimalView#AnimalView(java.lang.String, java.lang.String)}.
   */
  @Test
  public void testAnimalView() {
      try {
        Image originalImage1 = ImageIO.read(new File("img/kecoakanan1.png")); 
        originalImage1 = originalImage1.getScaledInstance(50, 50, 1);
        BufferedImage bufferedOriginalImage1 = new BufferedImage(50, 50, BufferedImage.TYPE_INT_ARGB);
        bufferedOriginalImage1.getGraphics().drawImage(originalImage1, 0, 0, null);
        BufferedImage viewImage1 = new BufferedImage(50, 50, BufferedImage.TYPE_INT_ARGB);
        viewImage1.getGraphics().drawImage(av.getImage1(), 0, 0, null);
        
        Image originalImage2 = ImageIO.read(new File("img/kecoakanan2.png")); 
        originalImage2 = originalImage2.getScaledInstance(50, 50, 1);
        BufferedImage bufferedOriginalImage2 = new BufferedImage(50, 50, BufferedImage.TYPE_INT_ARGB);
        bufferedOriginalImage2.getGraphics().drawImage(originalImage2, 0, 0, null);
        BufferedImage viewImage2 = new BufferedImage(50, 50, BufferedImage.TYPE_INT_ARGB);
        viewImage2.getGraphics().drawImage(av.getImage2(), 0, 0, null);
        
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

  /**
   * Test method for {@link animal.AnimalView#getImage1()}.
   */
  @Test
  public void testGetImage1() {
    try {
      Image originalImage = ImageIO.read(new File("img/kecoakanan1.png")); 
      originalImage = originalImage.getScaledInstance(50, 50, 1);
      BufferedImage bufferedOriginalImage = new BufferedImage(50, 50, BufferedImage.TYPE_INT_ARGB);
      bufferedOriginalImage.getGraphics().drawImage(originalImage, 0, 0, null);
      BufferedImage viewImage = new BufferedImage(50, 50, BufferedImage.TYPE_INT_ARGB);
      viewImage.getGraphics().drawImage(av.getImage1(), 0, 0, null);
      boolean imtrue = true;
      for (int y = 0; y < 50; y++) {
        for (int x = 0; x < 50; x++) {
          if (bufferedOriginalImage.getRGB(x, y) != viewImage.getRGB(x, y)) {
            imtrue = false;
            break;
          }
        }
      }
      assertEquals("Image1 Error!", true, imtrue);
    } catch (IOException e1) {
      // TODO Auto-generated catch block
      e1.printStackTrace();
    }
  }

  /**
   * Test method for {@link animal.AnimalView#getImage2()}.
   */
  @Test
  public void testGetImage2() {
    try {
      Image originalImage = ImageIO.read(new File("img/kecoakanan2.png")); 
      originalImage = originalImage.getScaledInstance(50, 50, 1);
      BufferedImage bufferedOriginalImage = new BufferedImage(50, 50, BufferedImage.TYPE_INT_ARGB);
      bufferedOriginalImage.getGraphics().drawImage(originalImage, 0, 0, null);
      BufferedImage viewImage = new BufferedImage(50, 50, BufferedImage.TYPE_INT_ARGB);
      viewImage.getGraphics().drawImage(av.getImage2(), 0, 0, null);
      boolean imtrue = true;
      for (int y = 0; y < 50; y++) {
        for (int x = 0; x < 50; x++) {
          if (bufferedOriginalImage.getRGB(x, y) != viewImage.getRGB(x, y)) {
            imtrue = false;
            break;
          }
        }
      }
      assertEquals("Image2 Error!", true, imtrue);
    } catch (IOException e1) {
      // TODO Auto-generated catch block
      e1.printStackTrace();
    }
  }

  /**
   * Test method for {@link animal.AnimalView#getShowedImage()}.
   */
  @Test
  public void testGetShowedImage() {
    Image originalImage;
    Image showedImage;
    try {
      originalImage = ImageIO.read(new File("img/kecoakanan1.png"));
      originalImage = originalImage.getScaledInstance(50, 50, 1);
      BufferedImage bufferedOriginalImage = new BufferedImage(50, 50, BufferedImage.TYPE_INT_ARGB);
      bufferedOriginalImage.getGraphics().drawImage(originalImage, 0, 0, null);
      
      ImageIcon view = av.getShowedImage();
      showedImage = view.getImage();
      BufferedImage bufferedShowedImage = new BufferedImage(50, 50, BufferedImage.TYPE_INT_ARGB);
      bufferedShowedImage.getGraphics().drawImage(showedImage, 0, 0, null);
      
      boolean imtrue = true;
      for (int y = 0; y < 50; y++) {
        for (int x = 0; x < 50; x++) {
          if (bufferedOriginalImage.getRGB(x, y) != bufferedShowedImage.getRGB(x, y)) {
            imtrue = false;
            break;
          }
        }
      }
      assertEquals("showedImage Error!", true, imtrue);
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  /**
   * Test method for {@link animal.AnimalView#setShowedImage(int)}.
   */
  @Test
  public void testSetShowedImage() {
    av.setShowedImage(3);
    Image originalImage;
    Image showedImage;
    try {
      originalImage = ImageIO.read(new File("img/kecoakanan2.png"));
      originalImage = originalImage.getScaledInstance(50, 50, 1);
      BufferedImage bufferedOriginalImage = new BufferedImage(50, 50, BufferedImage.TYPE_INT_ARGB);
      bufferedOriginalImage.getGraphics().drawImage(originalImage, 0, 0, null);
      
      ImageIcon view = av.getShowedImage();
      showedImage = view.getImage();
      BufferedImage bufferedShowedImage = new BufferedImage(50, 50, BufferedImage.TYPE_INT_ARGB);
      bufferedShowedImage.getGraphics().drawImage(showedImage, 0, 0, null);
      
      boolean imtrue = true;
      for (int y = 0; y < 50; y++) {
        for (int x = 0; x < 50; x++) {
          if (bufferedOriginalImage.getRGB(x, y) != bufferedShowedImage.getRGB(x, y)) {
            imtrue = false;
            break;
          }
        }
      }
      assertEquals("showedImage Error!", true, imtrue);
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

  /**
   * Test method for {@link animal.AnimalView#setShowedImageStop()}.
   */
  @Test
  public void testSetShowedImageStop() {
    av.setShowedImageStop();
    assertEquals("showedImage Error!", av.getShowedImage(), null);
  }

}
