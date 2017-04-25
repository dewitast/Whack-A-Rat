package frame;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
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

public class GamePanel extends JPanel {
  private static final long serialVersionUID = 3086601523332143745L;
  private WeaponView cursor;
  private ScoreView score;
  private WeaponController wco;
  private ScoreController sco;
  private Weapon weapon;
  private int cnt = 0;
  
  public GamePanel(WeaponView vi, Weapon we) {
    super();
    setLayout(new BorderLayout());
    setOpaque(false);
    cursor = vi;
    add(cursor, BorderLayout.CENTER);
    score = new ScoreView(0);
    vi.setLayout(new BorderLayout());
    vi.add(score, BorderLayout.NORTH);
    /*final JPanel times = new JPanel();
    final JLabel timesl = new JLabel("Times : 0");
    times.add(timesl);
    vi.add(times, BorderLayout.EAST);*/
    weapon = we;
    wco = new WeaponController(we, vi);
    sco = new ScoreController(new Score(0), score);
    final Random rand = new Random();
    Timer appearTimer = new Timer(3000, new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent arg0) {
        int x = rand.nextInt(cursor.getWidth());
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
        add(av);
      }
    });
    /*Timer time = new Timer(1000, new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent arg0) {
        //++cnt;
        timesl.setText(Integer.toString(cnt));
      }
    });*/
    appearTimer.start();
    //time.start();
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
