/**
 * 
 */
package score.test;

import static org.junit.Assert.*;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

import org.junit.Test;

import score.HighScoreView;

/**
 * @author suzaneringoringo
 *
 */
public class HighScoreViewTest {
  JPanel jp = new JPanel();
  JLabel l1 = new JLabel();
  JLabel l2 = new JLabel();
  JLabel l3 = new JLabel();
  JLabel l4 = new JLabel();
  JLabel l5 = new JLabel();
  JLabel l6 = new JLabel();
  HighScoreView hsv = new HighScoreView();
  
  /**
   * Test method for {@link score.HighScoreView#HighScoreView()}.
   */
  @Test
  public void testHighScoreView() {
    jp.add(l1);
    jp.add(l2);
    jp.add(l3);
    jp.add(l4);
    jp.add(l5);
    
    for (int i = 0; i < jp.getComponents().length; ++i) {
      if (jp.getComponent(i) instanceof JLabel) {
        JLabel label = (JLabel) jp.getComponent(i);
        label.setForeground(Color.black);
        Font font = new Font(Font.SANS_SERIF, Font.BOLD, 22);
        label.setFont(font);
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
      }
    }
    
    assertEquals("Label Error", l1.toString(), (hsv.getL1()).toString());
    assertEquals("Label Error", l2.toString(), (hsv.getL2()).toString());
    assertEquals("Label Error", l3.toString(), (hsv.getL3()).toString());
    assertEquals("Label Error", l4.toString(), (hsv.getL4()).toString());
    assertEquals("Label Error", l5.toString(), (hsv.getL5()).toString());
    
  }

  /**
   * Test method for {@link score.HighScoreView#addLabel(javax.swing.JLabel)}.
   */
  @Test
  public void testAddLabel() {
    hsv.addLabel(l6);
    assertEquals("Label Error", l6.toString(), (hsv.getComponent(5)).toString());
  }

}

