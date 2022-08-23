package GuiTest;

import javax.swing.*;
import java.awt.*;


/**
 * Diese Klasse ist für das Fenster in dem die Buttons und Labels rauf kommen zuständig
 */

public class MainFrame {




    public static JFrame frame = new JFrame();
    Toolkit tk = Toolkit.getDefaultToolkit();

    static Font font = new Font("Times New Roman", Font.PLAIN, 28);
    static Font titel = new Font("Times New Roman", Font.PLAIN, 90);

    ImageIcon logo = new ImageIcon("Bilder/icon3.jpg");
//    ImageIcon hintergrund1 = new ImageIcon("Bilder/prolog1.png");
//    ImageIcon hintergrund2 = new ImageIcon("Bilder/hauptmenub.png");
//    ImageIcon hintergrund3 = new ImageIcon("Bilder/bild2.jpg");
//    ImageIcon hintergrund4 = new ImageIcon("Bilder/bild3.jpg");


    public static JLabel bild1 = new JLabel();
    public static JLabel bild2 = new JLabel();
    public static JLabel bild3 = new JLabel();
    public static JLabel bild4 = new JLabel();



    public void mainFrame(){

        frame.setSize(1920, 1080);
        frame.setTitle("Das vergessene Märchenbuch");
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setIconImage(logo.getImage());

//        bilder(bild1,hintergrund1);
//        bilder(bild2,hintergrund2);
//        bilder(bild3,hintergrund3);
//        bilder(bild4,hintergrund4);

       // frame.add(bild1);


        frame.setUndecorated(true);
        frame.setAlwaysOnTop(true);
        frame.setResizable(false);
        int x = (int) tk.getScreenSize().getWidth();
        int y = (int) tk.getScreenSize().getHeight();

        frame.setVisible(true);

        adBilder(bild2);
        adBilder(bild1);

    }

    public void bilder(JLabel bild, ImageIcon hintergrund){
        bild.setBounds(0,0,1920,1080);
        bild.setIcon(hintergrund);
    }

    public static void adBilder(JLabel bild){frame.add(bild);}
    public static void visibleBilder(JLabel bild, boolean visible){bild.setVisible(visible);}




}
