/**
 * 
 */
package frame.test;

import static org.junit.Assert.*;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import org.junit.Test;

import frame.GameFrame;
import frame.GamePanel;

/**
 * @author suzaneringoringo
 *
 */
public class GameFrameTest {
  private JPanel mainPanel;
  private JPanel creditsPanel;
  private JPanel helpPanel;
  private JPanel highScorePanel;
  private GamePanel gamePanel;
  private GameFrame gf = new GameFrame();

  /**
   * Test method for {@link frame.GameFrame#getBackLabel()}.
   */
  @Test
  public void testGetBackLabel() {
    final JLabel back = new JLabel(new ImageIcon("img/back1.png"));
    back.addMouseListener(new MouseAdapter() {
      public void mouseEntered(MouseEvent mo) {
        back.setIcon(new ImageIcon("img/back2.png"));
      }
      public void mouseClicked(MouseEvent mo) {
        back.setIcon(new ImageIcon("img/back3.png"));
        mainPanel.setVisible(true);
        creditsPanel.setVisible(false);
        helpPanel.setVisible(false);
        highScorePanel.setVisible(false);
        if (gamePanel != null) gamePanel.setVisible(false);
      }
      public void mouseExited(MouseEvent mo) {
        back.setIcon(new ImageIcon("img/back1.png"));
      }
    });
    assertEquals("Back Label Error!", back.toString(), gf.getBackLabel().toString());
  }

}
