package weapon;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/**
 * @author NIM / Nama  : 13515021 / Dewita Sonya Tarabunga
 *  Nama file  : WeaponController.java
 */
public class WeaponController {
  private Weapon weapon;
  private WeaponView view;
  private static MouseAdapter click;
  
  /*
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
  
  /*
   * Menggerakkan model senjata ke posisi tertentu.
   * I.S. abs < 0 dan ord < 0
   * F.S senjata bergerak ke posisi tersebut.
   * @param nilai absis lokasi senjata bergerak.
   * @param nilai ordinat lokasi senjata bergerak.
   */
  public void move(int abs, int ord) {
    assert(abs >= 0);
    assert(ord >= 0);
    weapon.setPosition(abs, ord);
  }
  
  public MouseListener getListener() {
    return click;
  }
}
