package animal.species;

import animal.AnimalView;

public class ChickView extends AnimalView{
  private static final long serialVersionUID = 1L;
  private static final int chickWidth = 50;
  private static final int chickHeight = 50;

  public ChickView() {
    super("img/bebekkanan1.png", "img/bebekkanan2.png", chickWidth, chickHeight);
  }
}
