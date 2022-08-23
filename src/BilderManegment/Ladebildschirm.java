package BilderManegment;

import javax.swing.*;
import java.awt.*;

/**
 * Diese Klasse stellt den Lodingscreen her der beim Starten des Programmes zu sehen ist
 */

public class Ladebildschirm {

    public static int auflosung = 1;


    public static JFrame frame = new JFrame();
    Toolkit tk = Toolkit.getDefaultToolkit();

    static Font font = new Font("Times New Roman", Font.PLAIN, 28);
    static Font titel = new Font("Times New Roman", Font.PLAIN, 90);

    ImageIcon logo = new ImageIcon("Bilder/icon3.jpg");
    ImageIcon loading = new ImageIcon("Bilder/loading1.png");

    JLabel ladebildschirm = new JLabel();
    JPanel panel1 = new JPanel();


    public int width = 960;    // 3840
    public int height = 540;   // 2160

    public void mainFrame(){

        frame.setSize(width*auflosung, height*auflosung);
        frame.setTitle("Heavens Dream");
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setIconImage(logo.getImage());



        frame.setUndecorated(true);
        frame.setAlwaysOnTop(true);
        frame.setResizable(false);
        int x = (int) tk.getScreenSize().getWidth();
        int y = (int) tk.getScreenSize().getHeight();

        frame.setVisible(true);
        setLadebildschirm();
    }

    public void setLadebildschirm(){


        ladebildschirm.setBounds(0,0,width,height);
        ladebildschirm.setLayout(new GridLayout(1,1));
        ladebildschirm.setHorizontalAlignment(JLabel.CENTER);
        ladebildschirm.setIcon(loading);
        frame.add(ladebildschirm);
        ladebildschirm.setIcon(loading);
        ladebildschirm.setVisible(true);
    }

    public void schliessen(){
        frame.dispose();
        panel1.setVisible(false);
    }




}
