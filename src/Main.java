import java.awt.BorderLayout;
import java.awt.Canvas;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import animal.AnimalController;
import animal.AnimalView;
import animal.species.Hamster;
import animal.species.HamsterView;

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
            	GameFrame jf = new GameFrame();
            	jf.setLayout(new BorderLayout());
            	Weapon we = new ToxicGasSpray();
            	WeaponView vi = new ToxicGasSprayView();
            	jf.add(vi, BorderLayout.CENTER);
            	jf.pack();
            	WeaponController co = new WeaponController(we, vi);
            	Hamster ha1 = new Hamster();
            	AnimalView avi1 = new HamsterView();
            	AnimalController aco1 = new AnimalController(ha1, avi1);
            	jf.add(avi1, BorderLayout.CENTER);
            	jf.pack();
            	jf.setVisible(true);
            	
            }
        });
	}
}
