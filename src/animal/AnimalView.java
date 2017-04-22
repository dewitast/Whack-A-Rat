package animal;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import point.Point;

public class AnimalView extends JPanel{
  Image image;
  Point position;
  
  /*
   * Konstruktor.
   */
  public AnimalView() {
	image = (new ImageIcon()).getImage();
	position = new Point();
  }
  
  /*
   * Konstruktor dengan parameter.
   * @param namaFile string yang berisi nama file;
   */
  public AnimalView(String namaFile) {
    try {
      image = ImageIO.read(new File(namaFile));
    } catch (IOException ex) {
    
    }
    position = new Point();
  }
}
