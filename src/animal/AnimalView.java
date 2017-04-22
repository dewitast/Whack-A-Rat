package animal;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AnimalView {
  private JFrame jf;
  private JPanel jp;
  private JLabel imglabel;
  
  /*
   * Konstruktor.
   */
  public AnimalView() {
	jf = new JFrame();
	jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	jp = new JPanel();
	jp.setLayout(null);
	imglabel = new JLabel();
	jp.add(imglabel);
	jf.setSize(300, 300);
	jf.getContentPane().add(jp);
	jf.pack();
	jf.setVisible(true);
  }
  
  /*
   * Konstruktor dengan parameter.
   * @param file string yang berisi nama file;
   */
  public AnimalView(JFrame jf, JPanel jp, String file) {
	this.jf = jf;
	this.jp = jp;
	imglabel = new JLabel();
	imglabel.setIcon(new ImageIcon(file));
	jp.add(imglabel);
  }
}
