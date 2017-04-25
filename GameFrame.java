package frame;

import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

import weapon.type.Hammer;
import weapon.type.HammerView;
import weapon.type.ToxicGasSpray;
import weapon.type.ToxicGasSprayView;
import score.HighScoreController;

/**
 * Kelas GameFrame (GameFrame.java)
 * @author NIM/Nama: 13515021, 13515087/Dewita Sonya Tarabunga, Audry Nyonata
 */
public class GameFrame extends JFrame {
  private static final long serialVersionUID = 4153332469558642589L;
  /**
   * Atribut panel utama pada Frame.
   */
  private JPanel mainPanel;
  /**
   * Atribut panel credits pada GameFrame.
   */
  private CreditsPanel creditsPanel;
  /**
   * Atribut panel help pada GameFrame.
   */
  private HelpPanel helpPanel;
  /**
   * Atribut panel game pada GameFrame.
   */
  private GamePanel gamePanel;
  /**
   * Atribut HighScoreController untuk menampilkan high score
   */
  private HighScoreController highScoreController;
  /**
   * Atribut pilihan default weapon. 
   */
  private String selectedWeapon = "hammer";
  
  /**
   * Konstruktor.
   */
  public GameFrame() {
    initMainPanel();
    setTitle("Whack A Rat");
    setSize(800, 600);
    setContentPane(new JLabel(new ImageIcon("img/grass2.jpeg")));
    setLayout(new GridBagLayout());
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    add(mainPanel);
    setVisible(true);
  }
  
  /**
   * Menginisialisasi main panel.
   */
  public void initMainPanel() {
    mainPanel = new JPanel();
    mainPanel.setLayout(new GridBagLayout());
    mainPanel.setOpaque(false);
    
    String[] url = {"img/whack a rat1.png","img/whack a rat2.png","img/whack a rat3.png"};
    try {
      TimerImageSwapper tHeader = new TimerImageSwapper(url,600);
    
      JPanel control = initControl();
      JPanel weapon = initWeapon();
      
      GridBagConstraints gbc = new GridBagConstraints();
      gbc.gridx = 0;
      gbc.gridy = 0;
      mainPanel.add(tHeader,gbc);
      gbc.gridx = 0;
      gbc.gridy = 1;
      mainPanel.add(control,gbc);
      gbc.gridx = 0;
      gbc.gridy = 2;
      mainPanel.add(weapon,gbc);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  
  /**
   * Mengembalikan label yang berfungsi untuk kembali ke main panel.
   * @return label back.
   */
  public JLabel getBackLabel() {
    final JLabel back = new JLabel(new ImageIcon("img/back1.png"));
    back.addMouseListener(new MouseAdapter() {
      public void mouseEntered(MouseEvent mo) {
        back.setIcon(new ImageIcon("img/back2.png"));
      }
      public void mouseClicked(MouseEvent mo) {
        back.setIcon(new ImageIcon("img/back3.png"));
        mainPanel.setVisible(true);
        if (creditsPanel!=null){
          creditsPanel.setVisible(false);
        }
        if (helpPanel!=null){
          helpPanel.setVisible(false);
        }
        if (highScoreController!=null){
          highScoreController.getView().setVisible(false);
        }
        if (gamePanel!=null){
          gamePanel.setVisible(false);
        }
        setLayout(new GridBagLayout());
      }
      public void mouseExited(MouseEvent mo) {
        back.setIcon(new ImageIcon("img/back1.png"));
      }
    });   
    return back;
  }
  
  /**
   * Menginisialisasi control untuk pergi ke panel lain.
   * @return JPanel Control.
   */
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
        if (selectedWeapon == "hammer") {
          gamePanel = new GamePanel(new HammerView(), new Hammer());
        } else {
          gamePanel = new GamePanel(new ToxicGasSprayView(), new ToxicGasSpray());
        }
        setLayout(new BorderLayout());
        add(gamePanel);
        gamePanel.setVisible(true);
        Timer done = new Timer(60000, new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent arg0) {
            gamePanel.setVisible(false);
            final JLabel up = new JLabel(new ImageIcon("img/up.png"));
            setLayout(new GridBagLayout());
            add(up);
            Timer ups = new Timer(2000, new ActionListener() {
              public void actionPerformed(ActionEvent arg0) {
                up.setVisible(false);
                mainPanel.setVisible(true);
              }
            });
            ups.setRepeats(false);
            ups.start();
          }
        });
        done.setRepeats(false);
        done.start();
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
          highScoreController = new HighScoreController();
          add(highScoreController.getView());
          highScoreController.getView().addLabel(getBackLabel());
          highScoreController.getView().setVisible(true);
        } else if (temp == help) {
          helpPanel = new HelpPanel();
          add(helpPanel);
          helpPanel.addLabel(getBackLabel());
          helpPanel.setVisible(true);
        } else if (temp == credits) {
          creditsPanel = new CreditsPanel();
          add(creditsPanel);
          creditsPanel.addLabel(getBackLabel());
          creditsPanel.setVisible(true);
        }
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
  
  /**
   * Menginisialisasi label untuk pemilihan senjata.
   * @return JPanel weapon.
   */
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
}