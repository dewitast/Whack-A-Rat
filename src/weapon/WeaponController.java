package weapon;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

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
  }
  
  public MouseListener getListener() {
	MouseListener al = new MouseListener() {
		public void mouseClicked(MouseEvent mo) {
		  view.rotate(90);
		}
		public void mouseEntered(MouseEvent mo) {
		}
		public void mouseExited(MouseEvent mo) {
		}
		public void mousePressed(MouseEvent mo) {
		}
		public void mouseReleased(MouseEvent mo) {
		}
	};
	return al;
  }
  
  public void move(int abs, int ord) {
    weapon.setPosition(abs, ord);
  }
}
