package weapon;

import java.awt.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.JPanel;

/**
 * @author NIM / Nama  : 13515021 / Dewita Sonya Tarabunga
 *  Nama file  : WeaponView.java
 */
public abstract class WeaponView extends JPanel {
  private static final long serialVersionUID = 3660825063037349659L;
  protected Image imgclicked;
  protected Image img;
  protected Point hotspot;
  
  /*
   * Konstruktor dengan parameter.
   * @param file string yang berisi nama file.
   * @param fileClicked string yang berisi nama file ketika diklik.
   * @param hotspotX nilai absis dari posisi hotspot.
   * @param hotspotY nilai ordinat dari posisi hotspot.
   */
  public WeaponView(String file, String fileClicked, int hotspotX, int hotspotY) {
	  try {
	    img = ImageIO.read(new File(file));
	    img = img.getScaledInstance(64, 64, 1);
	    imgclicked = ImageIO.read(new File(fileClicked));
	    imgclicked = imgclicked.getScaledInstance(64, 64, 1);
	    hotspot = new Point(hotspotX, hotspotY);
	    resetCursor();
	  } catch(IOException ex) {
	  }
	  setOpaque(false);
  }
  
  /*
   * Mengembalikan image untuk kursor.
   * @return image untuk kursor.
   */
  public Image getImage() {
    assert(img != null);
    return img;
  }
  
  /*
   * Mengembalikan image untuk kursor ketika diklik.
   * @return image untuk kursor ketika diklik.
   */
  public Image getImageClicked() {
    assert(imgclicked != null);
    return imgclicked;
  }
  
  /*
   * Mengatur kursor dalam keadaan biasa.
   * I.S. image terdefinisi
   * F.S. kursor untuk tampilan senjata berubah menjadi sesuai image.
   */
  public void resetCursor() {
    assert(img != null);
	  Toolkit tk = Toolkit.getDefaultToolkit();
	  Cursor cursor = tk.createCustomCursor(img, hotspot, "palu1");
	  setCursor(cursor);
  }
  
  /*
   * Mengatur kursor dalam ketika diklik.
   * I.S. imageclicked terdefinisi
   * F.S. kursor untuk tampilan senjata berubah menjadi sesuai image.
   */
  public void resetCursorClicked() {
    assert(imgclicked != null);
    Toolkit tk = Toolkit.getDefaultToolkit();
    Cursor cursor = tk.createCustomCursor(imgclicked, hotspot, "palu2");
    setCursor(cursor);
  }
}
