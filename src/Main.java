import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import animal.AnimalView;

public class Main {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {                                           
            	JFrame jf = new JFrame();
        		JPanel jp = new JPanel();
        		AnimalView a = new AnimalView(jf, jp, "b.png");
        		jf.setSize(300, 300);
        		jf.getContentPane().add(jp);
        		jf.pack();
        		jf.setVisible(true);
            }
        });
	}
}
