import java.awt.BorderLayout;
import java.awt.Canvas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import frame.GameFrame;

import weapon.Weapon;
import weapon.WeaponController;
import weapon.WeaponView;
import weapon.type.Hammer;
import weapon.type.HammerView;
import weapon.type.ToxicGasSpray;
import weapon.type.ToxicGasSprayView;


public class Main {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {                                           
            	JFrame jf = new GameFrame();
            	jf.setLayout(new BorderLayout());
            	Weapon we = new ToxicGasSpray();
            	WeaponView vi = new ToxicGasSprayView();
            	jf.add(vi, BorderLayout.CENTER);
            	WeaponController co = new WeaponController(we, vi);
            }
        });
	}
}
