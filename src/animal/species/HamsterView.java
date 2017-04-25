package animal.species;

import animal.AnimalView;

public class HamsterView extends AnimalView {
  private static final long serialVersionUID = -8833045726606513903L;
  private static final int hamsterWidth = 50;
  private static final int hamsterHeight = 50;
  
  public HamsterView() {
    super("img/hamsterkanan1.png", "img/hamsterkanan2.png", hamsterWidth, hamsterHeight);
  }
}

  