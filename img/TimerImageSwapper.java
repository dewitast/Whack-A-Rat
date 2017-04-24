import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.*;

public class TimerImageSwapper {
  public static final String[] IMAGE_URLS = {
    "img/whack a rat1.png",
    "img/whack a rat2.png",
    "img/whack a rat3.png"
  };

  private static final int TIMER_DELAY = 1000;

  private ImageIcon[] icons = new ImageIcon[IMAGE_URLS.length];
  private JLabel mainLabel = new JLabel();

  private int iconIndex = 0;;

  public TimerImageSwapper() throws IOException {
    for (int i = 0; i < icons.length; i++) {
      String imgUrl = new String(IMAGE_URLS[i]);
      BufferedImage image = ImageIO.read(new File(imgUrl));
      icons[i] = new ImageIcon(image);
    }

    mainLabel.setIcon(icons[iconIndex ]);

    new Timer(TIMER_DELAY, new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent arg0) {
        iconIndex++;
        iconIndex %= IMAGE_URLS.length;
        mainLabel.setIcon(icons[iconIndex]);
      }
    }).start();
  }

  public Component getMainComponent() {
    return mainLabel;
  }

  private static void createAndShowGui() {
    TimerImageSwapper timerImageSwapper;
    try {
      timerImageSwapper = new TimerImageSwapper();
      JFrame frame = new JFrame("Timer Image Swapper");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.getContentPane().add(timerImageSwapper.getMainComponent());
      frame.pack();
      frame.setLocationByPlatform(true);
      frame.setVisible(true);

    } catch (IOException e) {
      e.printStackTrace();
      System.exit(-1);
    }

  }

  public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
        createAndShowGui();
      }
    });
  }
}