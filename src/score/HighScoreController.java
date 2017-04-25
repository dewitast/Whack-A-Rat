package score;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

import javax.swing.JFrame;

/**
 * Kelas HighScoreController (HighScoreController.java)
 * @author NIM/Nama: 13515087/Audry Nyonata
 */
public class HighScoreController {
  /**
   * Atribut HighScoreView yang dikontrol oleh HighScoreController.
   */
  private HighScoreView hView;
  /**
   * Atribut daftar nama.
   */
  private final String[] name = new String[5];
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
      while (i<5 && in.hasNext()) {
        name[i] = in.next();
        score[i] = in.nextInt();
        nHighScore++;
        i++;
      }
      in.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
    
    hView.l1.setText(name[0] +" " + score[0]);
    hView.l2.setText(name[1] +" " + score[1]);
    hView.l3.setText(name[2] +" " + score[2]);
    hView.l4.setText(name[3] +" " + score[3]);
    hView.l5.setText(name[4] +" " + score[4]);
    
  }
  
  /**
   * Mengadakan high score baru.
   * @param parName nama pada high score baru.
   * @param parScore skor pada high score baru.
   */
  public void add(final String parName, final int parScore) {
    int i = 0;
    if (nHighScore == 5) {
      while (score[i] >= parScore && i<5) {
        i++;
      }
      if (i<5){
        int j = 4;
        while (j>i) {
          name[j] = name[j-1];
          score[j] = score [j-1];
          j--;
        }
        name[i] = parName;
        score[i] = parScore;
      }
    } else {
      int x = nHighScore-1;
      while (score[i] >= parScore && i<x) {
        i++;
      }
      nHighScore++;
      int j = nHighScore-1;
      while (j>i) {
        name[j] = name[j-1];
        score[j] = score [j-1];
        j--;
      }
      if (score[i] >parScore){
        i++;
      }
      name[i] = parName;
      score[i] = parScore;
    }
    try {
      BufferedWriter bw = new BufferedWriter(new FileWriter("highscore.txt"));
      for (int y = 0;y<5;y++) {
        bw.write(name[y]);
        bw.write(" ");
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
