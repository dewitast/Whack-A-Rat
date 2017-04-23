package animal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
//import java.util.Timer;
import javax.swing.Timer;

public class AnimalController {
  private static int num=1;
  private Animal animal;
  private AnimalView view;
  
  /*
   * Konstruktor dengan parameter.
   * @param an Objek animal.
   * @param vi Objek view.
   */
  public AnimalController(Animal an, AnimalView vi) {
    animal = an;
    view = vi;
    final Random rand = new Random();
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e1) {
      // TODO Auto-generated catch block
      e1.printStackTrace();
    }
    Timer timer1 = new Timer(2, new ActionListener() {
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
