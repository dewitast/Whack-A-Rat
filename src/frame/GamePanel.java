package frame;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

import score.Score;
import score.ScoreController;
import score.ScoreView;

import weapon.Weapon;
import weapon.WeaponController;
import weapon.WeaponView;

public class GamePanel extends JPanel {
  private static final long serialVersionUID = 3086601523332143745L;
  private WeaponView cursor;
  private ScoreView score;
  private WeaponController wco;
  private ScoreController sco;
  private Weapon weapon;
  
  public GamePanel(WeaponView vi, Weapon we) {
    super();
    setLayout(new BorderLayout());
    setOpaque(false);
    cursor = vi;
    add(cursor, BorderLayout.CENTER);
    score = new ScoreView(0);
    vi.setLayout(new BorderLayout());
    vi.add(score, BorderLayout.NORTH);
    weapon = we;
    wco = new WeaponController(we, vi);
    sco = new ScoreController(new Score(0), score);
  }
  
  public WeaponView getWeaponView() {
    return cursor;
  }
  
  public ScoreView getScoreView() {
    return score;
  }
  
  public void addLabel(JLabel jl) {
    cursor.add(jl, BorderLayout.SOUTH);
  }
}
