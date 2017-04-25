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
import javax.swing.JTextArea;
import javax.swing.Timer;

import weapon.type.Hammer;
import weapon.type.HammerView;
import weapon.type.ToxicGasSpray;
import weapon.type.ToxicGasSprayView;
import score.HighScoreController;

/**
 * @author NIM / Nama  : 13515021,13515087 / Dewita Sonya Tarabunga, Audry Nyonata
 */
public class GameFrame extends JFrame {
  private static final long serialVersionUID = 4153332469558642589L;
  private JPanel mainPanel;
  private JPanel creditsPanel;
  private JPanel helpPanel;
  private GamePanel gamePanel;
  private HighScoreController highScoreController;
  private String selectedWeapon = "hammer";

  /**
   * Konstruktor.
   */
  public GameFrame() {
    initMainPanel();
    initHelpPanel();
    initCreditsPanel();
    setTitle("Whack A Rat");
    setSize(800, 600);
    setContentPane(new JLabel(new ImageIcon("img/grass2.jpeg")));
    setLayout(new GridBagLayout());
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    add(mainPanel);
    add(helpPanel);
    add(creditsPanel);
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
        creditsPanel.setVisible(false);
        helpPanel.setVisible(false);
        if (highScoreController!=null){
          highScoreController.getView().setVisible(false);
        }
        if (gamePanel!=null){
          gamePanel.setVisible(false);
        }
      }
      public void mouseExited(MouseEvent mo) {
        back.setIcon(new ImageIcon("img/back1.png"));
      }
    });
    return back;
  }
  
  /**
   * Menginisialisasi control untuk pergi ke panel lain.
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
        gamePanel.addLabel(getBackLabel());
        add(gamePanel);
        gamePanel.setVisible(true);
        Timer done = new Timer(60000, new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent arg0) {
            gamePanel.setVisible(false);
            mainPanel.setVisible(true);
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
          helpPanel.setVisible(true);
        } else if (temp == credits) {
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
  
  /**
   * Menginisialisasi help panel.
   */
  public void initHelpPanel() {
    helpPanel = new JPanel();
    helpPanel.setLayout((new BoxLayout(helpPanel,BoxLayout.Y_AXIS)));
    helpPanel.setOpaque(false);
    
    String[] url = {"img/help1.png","img/help2.png", "img/help3.png"};
    try {
      TimerImageSwapper tHeader = new TimerImageSwapper(url,400);
    
      JPanel subPanel = new JPanel(new GridLayout(3,4));
      subPanel.setOpaque(false);
      
      String[] url1 = {"img/tikuskanan1.png", "img/tikuskanan2.png"};
      TimerImageSwapper tikus = new TimerImageSwapper(url1,300,150,50);
      String[] url2 = {"img/bebekkanan1.png", "img/bebekkanan2.png"};
      TimerImageSwapper ayam = new TimerImageSwapper(url2,300,70,120);
      String[] url3 = {"img/kecoakanan1.png", "img/kecoakanan2.png"};
      TimerImageSwapper kecoa = new TimerImageSwapper(url3,300,100,100);
      String[] url4 = {"img/hamsterkanan1.png", "img/hamsterkanan2.png"};
      TimerImageSwapper hamster = new TimerImageSwapper(url4,300,100,80);
      String[] url5 = {"img/hammer1.png", "img/hammer2.png"};
      TimerImageSwapper palu = new TimerImageSwapper(url5,300,80,80);
      String[] url6 = {"img/spray1.png","img/spray2.png"};
      TimerImageSwapper gas = new TimerImageSwapper(url6,300,80,80);
      
      JTextArea descTikus = new JTextArea("Tikus got yang hidup dibawah kerlap-kerlip kota metropolitan");
      JTextArea descAyam = new JTextArea("Ayam jangan dibunuh. Dia masih belum mengerti arti kehidupan");
      JTextArea descKecoa = new JTextArea("Kecoa yang menggelikan. Cepat basmi sebelum beranak pinak!");
      JTextArea descHamster = new JTextArea("Hamster yang polos dan imut suka tidur dimana saja. Apakah yang ia senangi? Biji bunga matahari");
      JTextArea descPalu = new JTextArea("Palu andalan yang handal dan bisa diandalkan digunakan oleh orang-orang andal");
      JTextArea descGas = new JTextArea("Gas beracun yang sangat ampuh membunuh makhluk hidup apapun");
      
      subPanel.add(tikus);
      subPanel.add(descTikus);
      subPanel.add(ayam);
      subPanel.add(descAyam);
      subPanel.add(kecoa);
      subPanel.add(descKecoa);
      subPanel.add(hamster);
      subPanel.add(descHamster);
      subPanel.add(palu);
      subPanel.add(descPalu);
      subPanel.add(gas);
      subPanel.add(descGas);
      
      helpPanel.add(tHeader);
      helpPanel.add(subPanel);
      helpPanel.add(getBackLabel());
      
      for (int i = 0; i < helpPanel.getComponents().length; ++i) {
        if (helpPanel.getComponent(i) instanceof JLabel) {
          JLabel label = (JLabel)helpPanel.getComponent(i);
          label.setAlignmentX(Component.CENTER_ALIGNMENT);
          label.setOpaque(false);
        }
      }    
      
      for (int i = 0; i < subPanel.getComponents().length; ++i) {
        if (subPanel.getComponent(i) instanceof JTextArea) {
          JTextArea text = (JTextArea)subPanel.getComponent(i);
          text.setForeground(Color.black);
          Font font = new Font(Font.SANS_SERIF, Font.BOLD, 14);
          text.setFont(font);
          text.setLineWrap(true);
          text.setOpaque(false);
        }
      }
      helpPanel.setVisible(false);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
  
  /**
   * Menginisialisasi credits panel.
   */
  public void initCreditsPanel() {
    creditsPanel = new JPanel(new GridLayout(6, 1));
    creditsPanel.setOpaque(false);
    
    String[] url = {"img/credits1.png","img/credits2.png","img/credits3.png"};
    try {
      TimerImageSwapper tHeader = new TimerImageSwapper(url,400);
    
      JLabel dewita = new JLabel("Dewita Sonya Tarabunga - 13515021");
      JLabel helena = new JLabel("Helena Suzane Graciella - 13515032");
      JLabel audry = new JLabel("Audry Nyonata - 13515087");
      JLabel william = new JLabel("William - 13515144");
      
      creditsPanel.add(tHeader);
      creditsPanel.add(dewita);
      creditsPanel.add(helena);
      creditsPanel.add(audry);
      creditsPanel.add(william);
      creditsPanel.add(getBackLabel());
      
      for (int i = 0; i < creditsPanel.getComponents().length; ++i) {
        if (creditsPanel.getComponent(i) instanceof JLabel) {
          JLabel label = (JLabel)creditsPanel.getComponent(i);
          label.setForeground(Color.orange);
          Font font = new Font(Font.SANS_SERIF, Font.BOLD, 22);
          label.setFont(font);
          label.setHorizontalAlignment(JLabel.CENTER);
        }
      }
      creditsPanel.setVisible(false);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
