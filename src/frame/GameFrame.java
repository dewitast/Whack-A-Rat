package frame;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GameFrame extends JFrame {
  private static final long serialVersionUID = 4153332469558642589L;

  /*
   * Konstruktor.
   */
  public GameFrame() {
    setTitle("Whack A Rat");
    setSize(400, 400);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setVisible(true);
    setLayout(new BorderLayout());
    setContentPane(new JLabel(new ImageIcon("img/grass2.jpeg")));
    setLayout(new FlowLayout());
  }
}
