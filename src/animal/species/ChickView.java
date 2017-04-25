package animal.species;

import animal.AnimalView;

/**
 * Kelas ChickView (ChickView.java)
 * @author 
 */
public class ChickView extends AnimalView {
  private static final long serialVersionUID = 1L;
  /**
   * Atribut default width dari gambar ayam.
   */
  private static final int chickWidth = 50;
  /**
   * Atribut default height dari gambar ayam.
   */
  private static final int chickHeight = 50;
  
  /**
   * Konstruktor.
   */
  public ChickView() {
    super("img/bebekkanan1.png", "img/bebekkanan2.png", chickWidth, chickHeight);
  }
}
