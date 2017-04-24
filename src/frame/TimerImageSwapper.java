package frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.*;

public class TimerImageSwapper extends JLabel{
  private int iconIndex = 0;

  public TimerImageSwapper(final String[] url, int delay) {
    super();
    final ImageIcon[] icons = new ImageIcon[url.length];
    for (int i = 0; i < icons.length; i++) {
        icons[i] = new ImageIcon(url[i]);
    }
    setIcon(icons[iconIndex ]);
    new Timer(delay, new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent arg0) {
        iconIndex++;
        iconIndex %= url.length;
        setIcon(icons[iconIndex]);
          }
    }).start();
  }
  
  public TimerImageSwapper(final String[] url, int delay, int width, int height) {
    super();
    final ImageIcon[] icons = new ImageIcon[url.length];
    for (int i = 0; i < icons.length; i++) {
        icons[i] = new ImageIcon(new ImageIcon(url[i]).getImage().getScaledInstance(width, height, 1));
    }
    setIcon(icons[iconIndex ]);
    new Timer(delay, new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent arg0) {
        iconIndex++;
        iconIndex %= url.length;
        setIcon(icons[iconIndex]);
          }
    }).start();
  }
}