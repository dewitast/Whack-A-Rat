package score;

import java.awt.FlowLayout;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JFrame;

public class HighScoreController {
  /**
   * Atribut HighScoreView yang dikontrol oleh HighScoreController
   */
  private HighScoreView hView;
  /**
   * Atribut daftar skor.
   */
  private final int[] score = new int[5];
  /**
   * Atribut jumlah high score yang tercatat.
   */
  private int nHighScore = 0;
  
  /**
   * Mengembalikan view yang dikendalikan oleh HighScoreController.
   * @return hView.
   */
  public HighScoreView getView() {
    return hView;
  }
  
  /**
   * Konstruktor.
   */
  public HighScoreController() {
    hView = new HighScoreView();
    try {
      File fin = new File("highscore.txt");
      Scanner in = new Scanner (fin);
      
      int i = 0;
      while (i<5) {
        score[i] = in.nextInt();
        nHighScore++;
        i++;
      }
      in.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
    
    hView.l1.setText(Integer.toString(score[0]));
    hView.l2.setText(Integer.toString(score[1]));
    hView.l3.setText(Integer.toString(score[2]));
    hView.l4.setText(Integer.toString(score[3]));
    hView.l5.setText(Integer.toString(score[4]));
    
  }
  
  /**
   * Mengadakan high score baru.
   * @param parName nama pada high score baru.
   * @param parScore skor pada high score baru.
   */
  public void add(final String parName, final int parScore) {
    int i = 0;
    while (i < 5 && score[i] >= parScore) {
      i++;
    }
    if (i<5){
      int j = 4;
      while (j>i) {
        score[j] = score [j-1];
        j--;
      }
      score[i] = parScore;
      
      hView.l1.setText(Integer.toString(score[0]));
      hView.l2.setText(Integer.toString(score[1]));
      hView.l3.setText(Integer.toString(score[2]));
      hView.l4.setText(Integer.toString(score[3]));
      hView.l5.setText(Integer.toString(score[4]));
    }
    try {
      BufferedWriter bw = new BufferedWriter(new FileWriter("highscore.txt"));
      for (int y = 0;y<5;y++) {
        Integer x = score[y];
        bw.write(x.toString());
        bw.write("\n");  
      }
      bw.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
