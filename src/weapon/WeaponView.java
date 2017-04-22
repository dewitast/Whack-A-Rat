package weapon;

import java.awt.Canvas;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class WeaponView extends Component {
  Image image;
  int abs;
  int ord;
  
  /*
   * Konstruktor tanpa parameter.
   */
  public WeaponView() {
    image = (new ImageIcon()).getImage();
    abs = 0;
    ord = 0;
    adjust();
  }
  
  /*
   * Konstruktor dengan parameter.
   * @param jf Objek frame.
   * @param jp Objek panel.
   * @param namaFile String yang berisi nama file.
   */
  public WeaponView(String namaFile) {
	abs = 0;
	ord = 0;
    image = (new ImageIcon(namaFile)).getImage();
    image = image.getScaledInstance(100, 100, 1);
    adjust();
  }
  
  /**
   * Mengembalikan image dari view.
   * @return label.
   */
  public Image getImage() {
    return image;
  }
  
  /**
   * Menggambar .
   * @return label.
   */
  public void paint(Graphics g) {
	g.drawImage(image, 0, 0, null);  
  }
  
  public void adjust() {
	setSize(image.getWidth(null)/2, image.getWidth(null)/2);  
  }
}
