package weapon;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class WeaponController {
  private Weapon weapon;
  private WeaponView view;
  
  /*
   * Konstruktor dengan parameter.
   * @param we Objek weapon.
   * @param vi Objek view.
   */
  public WeaponController(Weapon we, WeaponView vi) {
    weapon = we;
    view = vi;
    MouseListener ml = new MouseListener() {
      public void mouseClicked(MouseEvent mo) {
      }
      public void mouseEntered(MouseEvent mo) {
      }
      public void mouseExited(MouseEvent mo) {
      }
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
    view.addMouseListener(ml);
    view.addMouseMotionListener(mml);
  }
  
  /*
   * Menggerakkan model senjata ke posisi tertentu.
   * @param nilai absis lokasi senjata bergerak.
   * @param nilai ordinat lokasi senjata bergerak.
   */
  public void move(int abs, int ord) {
    weapon.setPosition(abs, ord);
  }
}
