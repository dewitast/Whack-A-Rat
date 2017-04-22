package weapon;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class WeaponView {
  JPanel jp;
  JLabel imglabel;
  
  public WeaponView() {
    jp = new JPanel();
    imglabel = new JLabel();
  }
  
  public JPanel getPanel() {
    return jp;
  }
  
  public JLabel getLabel() {
    return imglabel;
  }
}
