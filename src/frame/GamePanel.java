package frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ImageIcon;
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
 * Kelas GamePanel (GamePanel.java)
 * @author NIM/Nama: 13515087/Audry Nyonata
 */
public class GamePanel extends JPanel {
  private static final long serialVersionUID = 3086601523332143745L;
  /**
   * Atribut WeaponView pada GamePanel.
   */
  private WeaponView cursor;
  /**
   * Atribut ScoreView pada GamePanel.
   */
  private ScoreView score;
  /**
   * Atribut Score pada GamePanel.
   */
  private Score skor;
  /**
   * Atribut WeaponController pada GamePanel.
   */
  private WeaponController wco;
  /**
   * Atribut ScoreController pada GamePanel.
   */
  private ScoreController sco;
  /**
   * Atribut counter pada GamePanel.
   */
  private int cnt = 60;
  
  /**
   * Konstruktor dengan parameter.
   * @param vi WeaponView pada GamePanel.
   * @param we Weapon pada GamePanel.
   */
  public GamePanel(WeaponView vi, Weapon we) {
    super();
    setLayout(new BorderLayout());
    setOpaque(false);
    cursor = vi;
    add(cursor, BorderLayout.CENTER);
    score = new ScoreView(0);
    skor = new Score(0);
    vi.setLayout(new BorderLayout());
    vi.add(score, BorderLayout.NORTH);
    final JLabel times = new JLabel();
    ImageIcon kayu = new ImageIcon("img/kayu.png");
    Image img = kayu.getImage();
    Image newimg = img.getScaledInstance(100, 50, java.awt.Image.SCALE_SMOOTH);
    kayu = new ImageIcon(newimg);
    times.setIcon(kayu);
    times.setText("01:00");
    times.setHorizontalTextPosition(JLabel.CENTER);
    times.setVerticalTextPosition(JLabel.CENTER);
    times.setFont(new Font("Purisa", Font.BOLD, 30));
    times.setOpaque(false);
    times.setForeground(Color.WHITE);
    vi.add(times, BorderLayout.SOUTH);
    wco = new WeaponController(we, vi);
    sco = new ScoreController(skor, score);
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
        times.setText("00:" + Integer.toString(cnt));
      }
    });
    appearTimer.start();
    time.start();
  }
  
  /**
   * Mengembalikan WeaponView pada GamePanel.
   * @return cursor. 
   */
  public WeaponView getWeaponView() {
    return cursor;
  }
  
  /**
   * Mengembalikan ScoreView pada GamePanel.
   * @return score.
   */
  public ScoreView getScoreView() {
    return score;
  }
  
  /**
   * Menambahkan label pada GamePanel.
   * @param jl label yang akan ditambahkan ke GamePanel.
   */
  public void addLabel(JLabel jl) {
    cursor.add(jl, BorderLayout.SOUTH);
  }
  
  /**
   * Membuat GamePanel terlihat.
   */
  public void setVisible(boolean bo) {
    super.setVisible(bo);
    cursor.setVisible(bo);
  }
  
}