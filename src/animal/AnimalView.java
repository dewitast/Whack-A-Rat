package animal;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;


public class AnimalView extends JPanel{
  private static final long serialVersionUID = 3660825063037349659L;
  private Image showedImage;
  private Image image1;
  private Image image2;
  private int size = 50;
  
  /*
   * Konstruktor dengan parameter.
   * @param namaFile string yang berisi nama file;
   */
  public AnimalView(String namaFile1, String namaFile2) {
    try {
      image1 = ImageIO.read(new File(namaFile1));
      image1 = image1.getScaledInstance(size,size,1);
      image2 = ImageIO.read(new File(namaFile2));
      image2 = image2.getScaledInstance(size,size,1);
    } catch (IOException ex) {
    
    }
    setSize(size,size);
    try {
    showedImage = ImageIO.read(new File("img/hammer1.png"));
    showedImage = showedImage.getScaledInstance(size,size,1);
    } catch (IOException ex) {
      
    }
    setOpaque(false);
  }
  
  /*
   * Mengembalikan image1.
   * @return image1.
   */
  public Image getImage1() {
    assert(image1 != null);
    return image1;
  }
  /*
   * Mengembalikan image2
   * @return image2
   */
  public Image getImage2() {
    assert(image2 != null);
    return image2;
  }
  public void paint(Graphics g) {
    g.drawImage(showedImage, 50, 50, null);
  }
  public void setShowedImage(int time) {
    if (time%2==0) {
      showedImage = image1;
     } else {
      showedImage = image2;
     }
  }
}
