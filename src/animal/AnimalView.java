package animal;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;


public abstract class AnimalView extends JLabel{
  private static final long serialVersionUID = 3660825063037349659L;
  private ImageIcon showedImage;
  private Image image1;
  private Image image2;
  private int width;
  private int height;
  
  /*
   * Konstruktor dengan parameter.
   * @param namaFile string yang berisi nama file;
   */

  public AnimalView(String namaFile1, String namaFile2, int width,
      int height) {
    this.width = width;
    this.height = height;
    showedImage = new ImageIcon("img/hammer1.png");
    try{
      image1 = ImageIO.read(new File (namaFile1));
      image1 = image1.getScaledInstance(width,height,1);
    } catch(IOException e) { 
    }
    try{
      image2= ImageIO.read(new File (namaFile2));
      image2 = image2.getScaledInstance(width,height,1);
    } catch(IOException e) { 
      }
    showedImage.setImage(image1);
    setIcon(showedImage);
    setSize(new Dimension (width,height));
    setOpaque(true);
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
  public ImageIcon getShowedImage() {
    return showedImage;
  }
  public void setShowedImage(int time) {
    if (time%2==0) {
      showedImage.setImage(image1);
     } else {
       showedImage.setImage(image2);
     }
  }
  public void setShowedImageStop() {
      showedImage.setImage(image1.getScaledInstance(width, height/3, 1));
      setSize(new Dimension(width,height/3));
  }
  public void resetIcon() {
    setIcon(showedImage);
    if (showedImage == null) {
      setSize(1, 1);
    }
  }
}
