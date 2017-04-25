package frame;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

import animal.Animal;
import animal.AnimalController;
import animal.AnimalView;
import animal.species.Chick;
import animal.species.ChickView;
import animal.species.Cockroach;
import animal.species.CockroachView;
import animal.species.Hamster;
import animal.species.HamsterView;
import animal.species.Rat;
import animal.species.RatView;

import score.Score;
import score.ScoreController;
import score.ScoreView;

import weapon.Weapon;
import weapon.WeaponController;
import weapon.WeaponView;

/**
 * @author NIM / Nama  : 13515021 / Dewita Sonya Tarabunga
 */
public class GamePanel extends JPanel {
  private static final long serialVersionUID = 3086601523332143745L;
  private WeaponView cursor;
  private ScoreView score;
  private WeaponController wco;
  private ScoreController sco;
  private int cnt = 60;
  
  /**
   * Konstruktor dengan parameter.
   * @param vi Objek weaponview yang terdapat pada game panel.
   * @param we Objek weapon yang terdapat pada game panel.
   */
  public GamePanel(WeaponView vi, Weapon we) {
    super();
    setLayout(new BorderLayout());
    setOpaque(false);
    cursor = vi;
    add(cursor, BorderLayout.CENTER);
    score = new ScoreView(0);
    vi.setLayout(new BorderLayout());
    vi.add(score, BorderLayout.NORTH);
    final JLabel times = new JLabel("Times : 60");
    vi.add(times, BorderLayout.EAST);
    wco = new WeaponController(we, vi);
    sco = new ScoreController(new Score(0), score);
    final Random rand = new Random();
    Timer appearTimer = new Timer(1000, new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent arg0) {
        int y = rand.nextInt(cursor.getHeight());
        int animal = rand.nextInt(4);
        cursor.setLayout(null);
        AnimalView av;
        Animal an;
        if (animal == 0) {
          av = new HamsterView();
          an = new Hamster();
        } else if (animal == 1) {
          av = new ChickView();
          an = new Chick();
        } else if (animal == 2) {
          av = new CockroachView();
          an = new Cockroach();
        } else {
          av = new RatView();
          an = new Rat();
        }
        new AnimalController(an, av);
        av.setLocation(0, y);
        av.addMouseListener(wco.getListener());
        av.addMouseListener(sco.control(an.getScore()));
        cursor.add(av);
      }
    });
    Timer time = new Timer(1000, new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent arg0) {
        --cnt;
        times.setText(Integer.toString(cnt));
      }
    });
    appearTimer.start();
    time.start();
  }
  
  /**
   * Mengembalikan weapon view yang dikontrol game panel.
   * @return weapon view yang dikontrol game panel.
   */
  public WeaponView getWeaponView() {
    return cursor;
  }
  
  /**
   * Mengembalikan score view yang dikontrol game panel.
   * @return score view yang dikontrol game panel.
   */
  public ScoreView getScoreView() {
    return score;
  }
  
  /**
   * Menambah label di bagian selatan game panel.
   * @param jl label yang akan ditambahkan ke game panel.
   */
  public void addLabel(JLabel jl) {
    cursor.add(jl, BorderLayout.SOUTH);
  }
  
  /**
   * Override visibilitas dari game panel.
   * @param bo jika true maka panel muncul, jika false maka panel hilang.
   */
  public void setVisible(boolean bo) {
    super.setVisible(bo);
    cursor.setVisible(bo);
  }
}
