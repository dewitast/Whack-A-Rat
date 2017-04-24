package frame;

import score.ScoreView;
import weapon.WeaponView;

public class GamePanel{
  WeaponView cursor;
  ScoreView score;
  
  public void GamePanel(WeaponView vi) {
    assert(vi != null);
    cursor = vi;
    score = new ScoreView();
  }
  
  public WeaponView getView() {
    return cursor;
  }
  
  public ScoreView getScore() {
    return score;
  }
}
