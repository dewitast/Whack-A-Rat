import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

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
            	final WeaponView vi = new ToxicGasSprayView();
            	jf.add(vi, BorderLayout.CENTER);
            	jf.pack();
            	WeaponController co = new WeaponController(we, vi);
            	Hamster ha1 = new Hamster();
            	final AnimalView avi1 = new HamsterView();
            	AnimalController aco1 = new AnimalController(ha1, avi1);
            	vi.add(avi1, BorderLayout.CENTER);
            	jf.pack();
            	jf.setVisible(true);
            	final JLabel jl = new HamsterView();
            	vi.add(jl);
            	Timer productionTimer = new Timer(3000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                  Hamster ha = new Hamster();
                  final AnimalView avi = new HamsterView();
                  AnimalController aco = new AnimalController(ha, avi);
                  vi.add(avi, BorderLayout.CENTER);
                  }
              });
            	productionTimer.start();
            }
        });
	}
}
