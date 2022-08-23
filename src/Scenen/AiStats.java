package Scenen;

import GuiTest.MainFrame;
import Plays.ScenenCounter;
import Plays.ScenenCounterClass;
import logic.Gameobjekt;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static logic.Gameobjekt.held;

// diese klasse ist nur dafür da die ia herzustellen damit man immer einen überblick über seine stats hat
public class AiStats implements ActionListener {


    static JLabel maxHp = new JLabel();
    static JLabel hp = new JLabel();
    static JLabel damage = new JLabel();
    static  JLabel verteidigunt = new JLabel();
    static JLabel level = new JLabel();
    static JLabel exp = new JLabel();
    static JLabel gold = new JLabel();
    static JLabel heiltranke = new JLabel();

    static JButton zuruckZumHaptmenu = new JButton();


    public static int trankeTotal = Gameobjekt.held.kleinerHeiltrank +
            Gameobjekt.held.mittlererHeiltrank+
            Gameobjekt.held.grosserHeiltrank+
            Gameobjekt.held.epischerHeiltrank;

    public AiStats() {
        aiAddFrame();
        aiVisible(true);
        ai();
    }

    public static void baueStats(JLabel stats, String text, int statName){
        stats.setText(text+statName);
        stats.setFont(Texte.font);
        stats.setForeground(Color.BLACK);
    }

    public static void ai(){

//        maxHp.setBounds(250, 10, 400,100);
//        hp.setBounds(550, 10, 400,100);
//        damage.setBounds(750, 10, 400,100);
//        verteidigunt.setBounds(1050, 10, 400,100);
//        level.setBounds(250, 50, 400,100);
//        exp.setBounds(550, 50, 400,100);
//        gold.setBounds(750, 50, 400,100);
//        heiltranke.setBounds(1050, 50, 400,100);


        maxHp.setBounds(100, 250, 400,100);
        hp.setBounds(100, 300, 400,100);
        damage.setBounds(100, 400, 400,100);
        verteidigunt.setBounds(100, 450, 400,100);
        level.setBounds(100, 500, 400,100);
        exp.setBounds(100, 550, 400,100);
        gold.setBounds(100, 600, 400,100);
        heiltranke.setBounds(100, 650, 400,100);

        zuruckZumHaptmenu.setBounds(1400, 900, 500,100);

        baueStats(maxHp,"MaxHp ", Gameobjekt.held.maxHp);
        baueStats(hp,"Hp ", Gameobjekt.held.hp);
        baueStats(damage,"Damage ", Gameobjekt.held.atacke);
        baueStats(verteidigunt,"Rüstung ", Gameobjekt.held.verteidigung);
        baueStats(level,"level ", Gameobjekt.held.lv);
        baueStats(exp,"Exp ", Gameobjekt.held.exp);
        baueStats(gold,"Gold ", Gameobjekt.held.geld);
        baueStats(heiltranke,"Heiltränke ",trankeTotal);

    }

    public void aiUpdate(){
        maxHp.setText("MaxHp "+ Gameobjekt.held.maxHp);

    }

    public static void aiVisible(boolean visible){
        maxHp.setVisible(visible);
        hp.setVisible(visible);
        damage.setVisible(visible);
        verteidigunt.setVisible(visible);
        level.setVisible(visible);
        exp.setVisible(visible);
        gold.setVisible(visible);
        heiltranke.setVisible(visible);
      //  zuruckZumHaptmenu.setVisible(visible);
    }

    public void aiAddFrame(){
        MainFrame.frame.add(maxHp);
        MainFrame.frame.add(hp);
        MainFrame.frame.add(damage);
        MainFrame.frame.add(verteidigunt);
        MainFrame.frame.add(level);
        MainFrame.frame.add(exp);
        MainFrame.frame.add(gold);
        MainFrame.frame.add(heiltranke);
      //  MainFrame.frame.add(zuruckZumHaptmenu);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == zuruckZumHaptmenu){
            aiVisible(false);
            ScenenCounterClass.sceneSwitchen(ScenenCounter.HAUPTMENU);
            System.out.println("Wilkommen im hauptmenü");
        }
    }
}
