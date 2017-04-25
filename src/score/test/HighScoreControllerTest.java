/**
 * 
 */
package score.test;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JLabel;

import org.junit.Test;

import score.HighScoreController;
import score.HighScoreView;

/**
 * @author suzaneringoringo
 *
 */
public class HighScoreControllerTest {
  private HighScoreController hsc = new HighScoreController(); 
  private HighScoreView hView = new HighScoreView();
  private final String[] name = new String[5];
  private final int[] score = new int[5];

  /**
   * Test method for {@link score.HighScoreController#getView()}.
   */
  @Test
  public void testGetView() {
    assertEquals("View Error", hView.toString(), (hsc.getView().toString()));
  }

  /**
   * Test method for {@link score.HighScoreController#HighScoreController()}.
   */
  @Test
  public void testHighScoreController() {
    try {
      File fin = new File("highscore.txt");
      Scanner in = new Scanner (fin);
      
      int i = 0;
      while (i<5 && in.hasNext()) {
        name[i] = in.next();
        score[i] = in.nextInt();
        i++;
      }
      in.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
    hView.getL1().setText(name[0] +" " + score[0]);
    hView.getL2().setText(name[1] +" " + score[1]);
    hView.getL3().setText(name[2] +" " + score[2]);
    hView.getL4().setText(name[3] +" " + score[3]);
    hView.getL5().setText(name[4] +" " + score[4]);
    
    assertEquals("Label Error", hView.getL1().toString(), (hsc.getView().getL1()).toString());
    assertEquals("Label Error", hView.getL2().toString(), (hsc.getView().getL2()).toString());
    assertEquals("Label Error", hView.getL3().toString(), (hsc.getView().getL3()).toString());
    assertEquals("Label Error", hView.getL4().toString(), (hsc.getView().getL4()).toString());
    assertEquals("Label Error", hView.getL5().toString(), (hsc.getView().getL5()).toString());
  }

  /**
   * Test method for {@link score.HighScoreController#add(java.lang.String, int)}.
   */
  @Test
  public void testAdd() {
    hsc.add("Uy", 1200);
    JLabel l = new JLabel();
    l.setText("Uy 1200");
    //assertEquals("Label Error", l.toString(), (hsc.getView().getL1()).toString());
  }

}
