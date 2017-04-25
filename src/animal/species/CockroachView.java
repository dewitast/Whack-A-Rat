package animal.species;

import animal.AnimalView;

/**
 * Kelas CockroachView (CokcroachView.java)
 * @author
 */
public class CockroachView extends AnimalView {
  private static final long serialVersionUID = 1L;
  /**
   * Atribut default width dari gambar kecoa.
   */
  private static final int cockroachWidth = 50;
  /**
   * Atribut default height dari gambar kecoa.
   */
  private static final int cockroachHeight = 50;
  
  
  /**
   * Konstruktor.
   */
  public CockroachView() {
    super("img/kecoakanan1.png", "img/kecoakanan2.png", cockroachWidth, cockroachHeight);
  }
}
