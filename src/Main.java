import java.awt.BorderLayout;
import java.awt.Canvas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import weapon.Weapon;
import weapon.WeaponController;
import weapon.WeaponView;
import weapon.type.Hammer;


public class Main {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {                                           
            	JFrame jf = new JFrame("aaaa");
            	Weapon we = new Hammer();
            	WeaponView vi = new WeaponView("b.png");
            	jf.add(vi);
            	WeaponController co = new WeaponController(we, vi);
        		jf.setSize(300, 300);
        		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        		jf.setVisible(true);
            }
        });
	}
}
