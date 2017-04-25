package animal.species;

import animal.AnimalView;

/**
 * Kelas RatView (RatView.java)
 * @author
 */
public class RatView extends AnimalView {
  private static final long serialVersionUID = 1L;
  /**
   * Atribut default width dari gambar tikus.
   */
  private static final int ratWidth = 100;
  /**
   * Atribut default height dari gambar tikus.
   */
  private static final int ratHeight = 35;
  
  /**
   * Konstruktor.
   */
  public RatView() {
    super("img/tikuskanan1.png", "img/tikuskanan2.png", ratWidth, ratHeight);
  }
}
