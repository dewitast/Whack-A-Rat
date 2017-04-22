 package weapon;

import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.JFrame;

/**
 * This class demonstrates how to load an Image from an external file
 */
public class WeaponView {
  JFrame jf;
  private BufferedImage img;
  
  /*
   * Konstruktor dengan parameter.
   * @param namaFile string yang berisi nama file.
   */
  public WeaponView(JFrame jfr, String namaFile) {
	jf = jfr;
	try {
	  img = ImageIO.read(new File(namaFile));
	} catch(IOException ex) {
	}
  }
  
  public Cursor getCursor() {
	Toolkit tk = Toolkit.getDefaultToolkit();
	Image im = img.getScaledInstance(64, 64, 1); 
	img = new BufferedImage(im.getWidth(null), im.getHeight(null), BufferedImage.TYPE_INT_ARGB);
	Graphics2D gr = img.createGraphics();
	gr.drawImage(im, 0, 0, null);
	gr.dispose();
	Point hotspot = new Point(0, 0);
	Cursor cursor = tk.createCustomCursor((Image)img, hotspot, "palu");
	return cursor;
  }
  
  public void rotate(double angle) {
    double sin = Math.abs(Math.sin(angle));
    double cos = Math.abs(Math.cos(angle));
    int width = img.getWidth();
    int height = img.getHeight();
    int newwidth = (int)Math.floor(width * cos + height * sin);
    int newheight = (int)Math.floor(height * cos + width * sin);
    GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
    GraphicsDevice gd = ge.getDefaultScreenDevice();
    GraphicsConfiguration gc = gd.getDefaultConfiguration();
    img = gc.createCompatibleImage(newwidth, newheight, Transparency.TRANSLUCENT);
    Graphics2D gr = img.createGraphics();
    gr.translate((newwidth - width) / 2, (newheight - height) / 2);
    gr.rotate(angle, width / 2, height / 2);
    gr.drawRenderedImage(img, null);
    jf.setCursor(getCursor());
  }
}
