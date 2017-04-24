package frame;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

import score.ScoreView;

import weapon.WeaponView;

public class GamePanel extends JPanel {
  private static final long serialVersionUID = 3086601523332143745L;
  private WeaponView cursor;
  private ScoreView score;
  
  public GamePanel(WeaponView vi) {
    super();
    setLayout(new BorderLayout());
    //add(new JLabel("audry"));
    setOpaque(false);
    cursor = vi;
    add(cursor, BorderLayout.CENTER);
    /*score = new ScoreView(0);
    vi.setLayout(new BorderLayout());
    vi.add(score, BorderLayout.SOUTH);*/
  }
  
  public WeaponView getWeaponView() {
    return cursor;
  }
  
  public ScoreView getScoreView() {
    return score;
  }
}
