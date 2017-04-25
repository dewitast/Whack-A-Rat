package animal.species;

import animal.AnimalView;

public class RatView extends AnimalView {
  private static final long serialVersionUID = 1L;
  private static final int ratWidth = 100;
  private static final int ratHeight = 35;

  public RatView() {
    super("img/tikuskanan1.png", "img/tikuskanan2.png", ratWidth, ratHeight);
  }
}
