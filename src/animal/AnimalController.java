package animal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.util.Timer;
import javax.swing.Timer;

public class AnimalController {
  private static int deltaX=1;
  private static int deltaY=1;
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
    Timer timer1 = new Timer(100, new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        view.setLocation((int)view.getLocation().getX()+deltaX,(int)view.getLocation().getY()+deltaY);
        view.setShowedImage(num);
        num++;
        }
    });
    timer1.start();
  }
  
  
}
