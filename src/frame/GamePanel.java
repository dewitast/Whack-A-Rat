package frame;

import java.awt.BorderLayout;

import javax.swing.JPanel;

import weapon.WeaponView;

public class GamePanel extends JPanel {
  WeaponView cursor;
  //ScoreView score;
  
  public GamePanel(WeaponView vi) {
    super();
    setLayout(new BorderLayout());
    cursor = vi;
    add(cursor, BorderLayout.CENTER);
    //score = new ScoreView();
    //add(score, BorderLayout.SOUTH);
  }
  
  public WeaponView getWeaponView() {
    return cursor;
  }
  
  /*public ScoreView getScoreView() {
    return score;
  }*/
}
