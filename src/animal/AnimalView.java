package animal;

import java.awt.Dimension;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 * Kelas AnimalView (AnimalView.java)
 * @author 
 */
public class AnimalView extends JLabel{
  private static final long serialVersionUID = 3660825063037349659L;
  private ImageIcon showedImage;
  private Image image1;
  private Image image2;
  private int size = 50;
  
  /**
   * Konstruktor dengan parameter.
   * @param namaFile string yang berisi nama file.
   */
  public AnimalView(String namaFile1, String namaFile2, int width, int height) {
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
    setOpaque(false);
  }

  /**
   * Mengembalikan image1.
   * @return image1.
   */
  public Image getImage1() {
    assert(image1 != null);
    return image1;
  }

  /**
   * Mengembalikan image2.
   * @return image2.
   */
  public Image getImage2() {
    assert(image2 != null);
    return image2;
  }
  
  /**
   * Mengembalikan showedImage.
   * @return showedImage.
   */
  public ImageIcon getShowedImage() {
    return showedImage;
  }
  
  /**
   * Mengubah showedImage berdasarkan waktu.
   * @param time waktu yang menentukan showedImage.
   */
  public void setShowedImage(int time) {
    if (time%2==0) {
      showedImage.setImage(image1);
     } else {
       showedImage.setImage(image2);
     }
  }
  
  /**
   * Menghilangkan showedImage (null).
   */
  public void setShowedImageStop() {
      showedImage = null;
  }
  
  /**
   * Mengatur ulang icon dengan showedImage dan ukuran 1x1.
   */
  public void resetIcon() {
    setIcon(showedImage);
    if (showedImage == null) {
      setSize(1, 1);
    }
  }
}