package weapon;

import java.awt.event.ActionListener;
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
    MouseMotionListener al = new MouseMotionListener() {
      public void mouseMoved(MouseEvent mouse) {
    	  int abs = mouse.getX();
          int ord = mouse.getY();
          
          move(abs, ord);
      }
      public void mouseDragged(MouseEvent mouse) {
      }
    };
    view.getPanel().addMouseMotionListener(al);
  }
  
  public void move(int abs, int ord) {
	  
  }
  
}
