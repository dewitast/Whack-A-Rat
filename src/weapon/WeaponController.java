package weapon;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

import weapon.type.HammerView;
import weapon.type.ToxicGasSprayView;

/**
 * Kelas WeaponController (WeaponController.java)
 * @author NIM/Nama: 13515021/Dewita Sonya Tarabunga
 */
public class WeaponController {
  /**
   * Atribut Weapon yang dikendalikan oleh WeaponController.
   */
  private Weapon weapon;
  /**
   * Atribut WeaponView yang dikendalikan oleh WeaponController.
   */
  private WeaponView view;
  /**
   * Atribut MouseListener pada WeaponController. 
   */
  private static MouseAdapter click;
  
  /**
   * Konstruktor dengan parameter.
   * @param we Objek weapon.
   * @param vi Objek view.
   */
  public WeaponController(Weapon we, WeaponView vi) {
    assert(we != null);
    assert(vi != null);
    weapon = we;
    view = vi;
    click = new MouseAdapter() {
      public void mousePressed(MouseEvent mo) {
        view.resetCursorClicked();
        if (view instanceof HammerView) {
          InputStream in;
          AudioStream audioStream = null;
          try {
            in = new FileInputStream("sound/hammer.wav");
            try {
              audioStream = new AudioStream(in);
            } catch (IOException e) {
              e.printStackTrace();
            }
          } catch (FileNotFoundException e1) {
            e1.printStackTrace();
          }
          AudioPlayer.player.start(audioStream);
        }
        else if (view instanceof ToxicGasSprayView) {
          InputStream in;
          AudioStream audioStream = null;
          try {
            in = new FileInputStream("sound/spray.wav");
            try {
              audioStream = new AudioStream(in);
            } catch (IOException e) {
              e.printStackTrace();
            }
          } catch (FileNotFoundException e1) {
            e1.printStackTrace();
          }
          AudioPlayer.player.start(audioStream);
        }
      }
      public void mouseReleased(MouseEvent mo) {
        view.resetCursor();
      }
    };
    MouseMotionListener mml = new MouseMotionListener() {
      public void mouseMoved(MouseEvent mo) {
        int abs = mo.getX();
        int ord = mo.getY();
        
        move(abs, ord);
      }
      public void mouseDragged(MouseEvent mo) {
      }
    };
    view.addMouseListener(click);
    view.addMouseMotionListener(mml);
}
  
  /**
   * Menggerakkan model senjata ke posisi tertentu.
   * I.S. abs < 0 dan ord < 0.
   * F.S senjata bergerak ke posisi tersebut.
   * @param abs nilai absis lokasi senjata bergerak.
   * @param ord nilai ordinat lokasi senjata bergerak.
   */
  public void move(int abs, int ord) {
    assert(abs >= 0);
    assert(ord >= 0);
    weapon.setPosition(abs, ord);
}
  
  /**
   * Mengembalikan MouseListener pada WeaponController.
   * @return click.
   */
  public MouseListener getListener() {
    return click;
  }
  
  /**
   * Mengembalikan Weapon yang dikendalikan oleh WeaponController.
   * @return weapon.
   */
  public Weapon getWeapon() {
    return weapon;
  }
  
  /**
   * Mengembalikan WeaponView yang dikendalikan oleh WeaponController.
   * @return view.
   */
  public WeaponView getWeaponView() {
    return view;
  }
}