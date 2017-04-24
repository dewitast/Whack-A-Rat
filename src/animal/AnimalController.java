package animal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;
import javax.swing.ImageIcon;
//import java.util.Timer;
import javax.swing.Timer;

public class AnimalController {
  private static int num=1;
  private Animal animal;
  private AnimalView view;
  private Timer timer1;
  
  /*
   * Konstruktor dengan parameter.
   * @param an Objek animal.
   * @param vi Objek view.
   */
  public AnimalController(Animal an, AnimalView vi) {
    animal = an;
    view = vi;
    final Random rand = new Random();

    MouseAdapter ml = new MouseAdapter() {
      public void mousePressed(MouseEvent mo) {
        view.getShowedImage().setImage(view.getImage1());
        view.setIcon(view.getShowedImage());
        timer1.stop();
      }
    };
    view.addMouseListener(ml);
    timer1 = new Timer(2, new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        
        view.setLocation((int)view.getLocation().getX()+(rand.nextInt(7)-3),(int)view.getLocation().getY()+(rand.nextInt(7)-3));
        view.setShowedImage(num);
        num++;
        }
    });
    timer1.start();
  }
  
  
}
