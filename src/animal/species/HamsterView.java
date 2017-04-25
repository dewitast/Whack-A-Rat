package animal.species;

import animal.AnimalView;

/**
 * Kelas HamsterView (HamsterView.java)
 * @author
 */
public class HamsterView extends AnimalView {
  private static final long serialVersionUID = -8833045726606513903L;
  /**
   * Atribut default width dari gambar hamster.
   */
  private static final int hamsterWidth = 50;
  /**
   * Atribut default height dari gambar hamster.
   */
  private static final int hamsterHeight = 50;
  
  /**
   * Konstruktor.
   */
  public HamsterView() {
    super("img/hamsterkanan1.png", "img/hamsterkanan2.png", hamsterWidth, hamsterHeight);
  }
}

  