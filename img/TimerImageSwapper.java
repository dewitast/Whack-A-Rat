import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.*;

public class TimerImageSwapper extends JLabel{
  /*public static final String[] IMAGE_URLS = {
    "img/whack a rat1.png",
    "img/whack a rat2.png",
    "img/whack a rat3.png"
  };

  private static final int TIMER_DELAY = 500;
	
  private JLabel mainLabel = new JLabel();
  */
  private int iconIndex = 0;;

  public TimerImageSwapper(String[] url, int delay) throws IOException {
	  ImageIcon[] icons = new ImageIcon[url.length];
	  for (int i = 0; i < icons.length; i++) {
	      icons[i] = new ImageIcon(url[i]);
    }

    setIcon(icons[iconIndex ]);

    new Timer(TIMER_DELAY, new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent arg0) {
        iconIndex++;
        iconIndex %= IMAGE_URLS.length;
        setIcon(icons[iconIndex]);
      }
    }).start();
  }
}