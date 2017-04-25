package animal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.*;
import javax.swing.Timer;
import sun.audio.*;

/**
 * Kelas AnimalController (AnimalController.java)
 * @author
 */
public class AnimalController {
  /**
   * Penanda untuk default showImage.
   */
  private static int num=1;
  /**
   * Atribut Animal yang dikendalikan oleh AnimalController.
   */
  private Animal animal;
  /**
   * Atribut AnimalView yang dikendalikan oleh AnimalController.
   */
  private AnimalView view;
  /**
   * Atribut Timer yang mengatur pergerakan objek.
   */
  private Timer moveTimer;
  /**
   * Atribut skor dari Animal yang dikendalikan.
   */
  private int score = 0;
  
  /**
   * Konstruktor dengan parameter.
   * @param an Objek animal.
   * @param vi Objek view.
   */
  public AnimalController(Animal an, AnimalView vi) {
    animal = an;
    view = vi;
    MouseAdapter ml = new MouseAdapter() {
      public void mouseReleased(MouseEvent mo) {
        view.getShowedImage().setImage(view.getImage1());
        view.setVisible(false);
        moveTimer.stop();
        score = animal.getScore();
      }
    };
    view.addMouseListener(ml);
    moveTimer = new Timer(animal.getSpeed(), new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        view.setLocation((int)view.getLocation().getX()+2,(int)view.getLocation().getY());
        view.setShowedImage(num);
        num++;
        }
    });
    moveTimer.start();
    /*dissapearTimer = new Timer(5000, new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        moveTimer.stop();
        view.setVisible(false);
        }
    });
    dissapearTimer.setRepeats(false);
    dissapearTimer.start();*/
  }
  
  /**
   * Mengubah nilai score menjadi 0.
   */
  public void resetScore() {
    score = 0;
  }
  
  /**
   * Mengembalikan nilai score.
   */
  public int getScore() {
    return score;
  }
}
