package animal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.Timer;
import sun.audio.*;

import frame.TimerImageSwapper;

public class AnimalController {
  private static int num=1;
  private Animal animal;
  private AnimalView view;
  private Timer moveTimer;
  private Timer dissapearTimer;
  private int score = 0;
  
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
      public void mouseClicked(MouseEvent mo) {
        /*
        InputStream in;
        AudioStream audioStream = null;
        try {
          in = new FileInputStream("sound/hammer.wav");
          try {
            audioStream = new AudioStream(in);
          } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
          }
        } catch (FileNotFoundException e1) {
          e1.printStackTrace();
        }
        AudioPlayer.player.start(audioStream);
        */
        animal.decreaseHP();
        if (animal.isDead()) {
          view.setShowedImageStop();
          moveTimer.stop();
          dissapearTimer = new Timer(750,  new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
              view.setVisible(false);
              }
          });
          dissapearTimer.setRepeats(false);
          dissapearTimer.start();
        }
        
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
  }
  
  public void resetScore() {
    score = 0;
  }
  
  public int getScore() {
    return score;
  }
}
