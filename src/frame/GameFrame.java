package frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GameFrame extends JFrame implements Runnable {
  private static final long serialVersionUID = 4153332469558642589L;
  private JPanel mainPanel;
  private JPanel creditsPanel;
  private String selectedWeapon;
  private boolean startGame = false;

  /*
   * Konstruktor.
   */
  public GameFrame() {
    initMainPanel();
    initCreditsPanel();
    setTitle("Whack A Rat");
    setSize(400, 400);
    setContentPane(new JLabel(new ImageIcon("img/grass2.jpeg")));
    setLayout(new GridBagLayout());
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    add(mainPanel);
    add(creditsPanel);
    setVisible(true);
  }
  
  public void initMainPanel() {
    mainPanel = new JPanel();
    mainPanel.setLayout(new GridBagLayout());
    mainPanel.setOpaque(false);
    
    JLabel header = initHeader("img/whack a rat1.png");
    JPanel control = initControl();
    JPanel weapon = initWeapon();
    
    GridBagConstraints gbc = new GridBagConstraints();
    gbc.gridx = 0;
    gbc.gridy = 0;
    mainPanel.add(header,gbc);
    gbc.gridx = 0;
    gbc.gridy = 1;
    mainPanel.add(control,gbc);
    gbc.gridx = 0;
    gbc.gridy = 2;
    mainPanel.add(weapon,gbc);
  }
  
  public void initCreditsPanel() {
    creditsPanel = new JPanel(new GridLayout(6, 1));
    creditsPanel.setOpaque(false);
    
    JLabel header = initHeader("img/credits1.png");
    JLabel dewita = new JLabel("Dewita Sonya Tarabunga - 13515021");
    JLabel helena = new JLabel("Helena Suzane Graciella - 13515032");
    JLabel audry = new JLabel("Audry Nyonata - 13515087");
    JLabel william = new JLabel("William - 13515144");
    final JLabel back = new JLabel(new ImageIcon("img/back1.png"));
    
    creditsPanel.add(header);
    creditsPanel.add(dewita);
    creditsPanel.add(helena);
    creditsPanel.add(audry);
    creditsPanel.add(william);
    creditsPanel.add(back);
    
    for (int i = 0; i < creditsPanel.getComponents().length; ++i) {
      if (creditsPanel.getComponent(i) instanceof JLabel) {
        JLabel label = (JLabel)creditsPanel.getComponent(i);
        label.setForeground(Color.orange);
        Font font = new Font(Font.SANS_SERIF, Font.BOLD, 22);
        label.setFont(font);
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
      }
    }
    
    back.addMouseListener(new MouseAdapter() {
      public void mouseEntered(MouseEvent mo) {
        back.setIcon(new ImageIcon("img/back2.png"));
      }
      public void mouseClicked(MouseEvent mo) {
        back.setIcon(new ImageIcon("img/back3.png"));
        mainPanel.setVisible(true);
        creditsPanel.setVisible(false);
      }
      public void mouseExited(MouseEvent mo) {
        back.setIcon(new ImageIcon("img/back1.png"));
      }
    });
    
    
    creditsPanel.setVisible(false);
  }
  
  public JLabel initHeader(String namaFile) {
    JLabel header = new JLabel();
    header.setIcon(new ImageIcon(namaFile));
    return header;
  }
  
  public JPanel initControl() {
    JPanel control = new JPanel();
    control.setLayout(new BoxLayout(control, BoxLayout.Y_AXIS));
    control.setOpaque(false);
    
    final JLabel start = new JLabel(new ImageIcon("img/start1.png"));
    control.add(start);
    
    final JLabel highScore = new JLabel("High Score");
    control.add(highScore);
    final JLabel help = new JLabel("Help");
    control.add(help);
    final JLabel credits = new JLabel("Credits");
    control.add(credits);
    
    start.addMouseListener(new MouseAdapter() {
      public void mouseEntered(MouseEvent mo) {
        start.setIcon(new ImageIcon("img/start2.png"));
      }
      public void mouseClicked(MouseEvent mo) {
        start.setIcon(new ImageIcon("img/start3.png"));
        mainPanel.setVisible(false);
        startGame = true;
      }
      public void mouseExited(MouseEvent mo) {
        start.setIcon(new ImageIcon("img/start1.png"));
      }
    });
    
    MouseListener cl = new MouseAdapter() {
      public void mouseClicked(MouseEvent e) {
        JLabel temp= (JLabel)e.getSource();
        temp.setForeground(Color.black);
        mainPanel.setVisible(false);
        if (temp == highScore) {
          
        } else if (temp == help) {
          
        } else if (temp == credits) {
          creditsPanel.setVisible(true);
        }
        mainPanel.setVisible(false);
      }
      public void mouseEntered(MouseEvent e) {
        JLabel temp= (JLabel)e.getSource();
        temp.setForeground(Color.red);
      }
      public void mouseExited(MouseEvent e) {
        JLabel temp= (JLabel)e.getSource();
        temp.setForeground(Color.orange);
      }
    };
    for (int i = 0; i < control.getComponents().length; ++i) {
      if (control.getComponent(i) instanceof JLabel) {
        JLabel label = (JLabel)control.getComponent(i);
        label.setForeground(Color.orange);
        Font font = new Font(Font.SANS_SERIF, Font.BOLD, 22);
        label.setFont(font);
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        label.addMouseListener(cl);
      }
    }
    return control;
  }
  
  public JPanel initWeapon() {
    JPanel weapon = new JPanel(new GridLayout(1, 2));
    weapon.setOpaque(false);
    
    final JLabel hammer = new JLabel(new ImageIcon(new ImageIcon("img/hammer2.png").getImage().getScaledInstance(80, 80, 1)));
    weapon.add(hammer);
    
    final JLabel spray = new JLabel(new ImageIcon(new ImageIcon("img/spray2grey.png").getImage().getScaledInstance(80, 80, 1)));
    weapon.add(spray);
    
    MouseListener WeaponPanelListener = new MouseAdapter() {
      public void mouseClicked(MouseEvent e) {
        JLabel temp = (JLabel)e.getSource();
        if (temp == hammer) {
          hammer.setIcon(new ImageIcon(new ImageIcon("img/hammer2.png").getImage().getScaledInstance(80, 80,1)));        
          spray.setIcon(new ImageIcon(new ImageIcon("img/spray2grey.png").getImage().getScaledInstance(80, 80,1)));
          selectedWeapon = "hammer";
        } else {
          hammer.setIcon(new ImageIcon(new ImageIcon("img/hammer2grey.png").getImage().getScaledInstance(80, 80,1)));        
          spray.setIcon(new ImageIcon(new ImageIcon("img/spray2.png").getImage().getScaledInstance(80, 80,1)));
          selectedWeapon = "spray";
        }
      }
    };
    
    Component[] component = weapon.getComponents();
    for(int i =0; i<component.length; i++) {
      if (component[i] instanceof JLabel) {
        JLabel label = (JLabel)component[i];
        label.addMouseListener(WeaponPanelListener);
      }
    }
    return weapon;
  }
  
  public void run() {
    while (!startGame);
    if (selectedWeapon == "hammer") {
     
    } else {
      
    }
  }
}
