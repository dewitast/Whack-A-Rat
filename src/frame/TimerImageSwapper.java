package frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.Timer;

/**
 * Kelas TimerImageSwapper (TimerImageSwapper.java)
 * @author NIM/Nama: 13515087/Audry Nyonata
 */
public class TimerImageSwapper extends JLabel{
  private static final long serialVersionUID = 4978187277656439360L;
  private int iconIndex = 0;

  /**
   * Konstruktor dengan parameter.
   * @param url array of string yang akan saling berganti.
   * @param delay nilai waktu delay.
   */
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
  
  /**
   * Konstruktor dengan parameter.
   * @param url array of string yang akan saling berganti.
   * @param delay nilai waktu delay.
   * @param width nilai lebar dari image.
   * @param height nilai panjang dari image.
   */
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