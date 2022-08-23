package Scenen.Geschichte1;

import GuiTest.Battle;
import GuiTest.MainFrame;
import Scenen.AiStats;
import Scenen.Texte;
import Scenen.TexteKapitel2;
import logic.AlleMobs;
import logic.Gameobjekt;
import logic.ItemObjekt;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Chapter2 implements ActionListener {


    public static int weiterCount = 0;

    public JTextPane chapter2 = new JTextPane();
    JLabel titel = new JLabel();

    public static JButton weiter = new JButton();
    JButton weiterSpielen = new JButton();
    JButton e1 = new JButton();
    JButton e2 = new JButton();
    JButton e3 = new JButton();
    JButton menu = new JButton();



    public Chapter2() {
        addFrame();
        visible(true);
        titel.setVisible(true);
        e3.setVisible(false);
        visibleSwitch(false);

    }



    public void derText(String text){
        chapter2.setText(text);
    }

    public void baueScene(JTextPane prolog, String text){
        prolog.setText(text);
        prolog.setBackground(null);
        prolog.setForeground(Color.BLACK);
        prolog.setFont(Texte.font2);
        prolog.setEditable(false);
    }
    public void baueButton(JButton button, String text){
        button.setText(text);
        button.setBackground(Color.BLACK);
        button.setForeground(Color.WHITE);
        button.setFont(Texte.font);
        button.addActionListener(this);
        button.setFocusable(false);
    }

    public void bounds(){
        titel.setBounds(400,70,1700,200);
        weiter.setBounds(700, 850, 300, 100);
        weiterSpielen.setBounds(450, 800, 300, 100);
        e1.setBounds(450, 850, 300, 100);
        e2.setBounds(850, 850, 300, 100);
        e3.setBounds(1250, 850, 300, 100);
        // menu.setBounds(1400, 850, 400, 100);
        chapter2.setBounds(250, 300, 1350, 550);

        titel.setText("Kapitel 2: Gefangen im der Erdenreich");
        titel.setFont(Texte.titel);
    }

    public void scene(){

        bounds();
        baueScene(chapter2,TexteKapitel2.zweitesKapitel1);

        baueButton(weiter,"Weiter");
        baueButton(e1,"entscheidung 1");
        baueButton(e2,"entscheidung 2");
        baueButton(e3,"entscheidung 3");

    }

    public void scene2( AlleMobs gegner){

        bounds();
        alleGegnerDrops(gegner);
        baueButton(weiter,"Weiter");
        baueButton(weiterSpielen,"Weiter Spielen");
        // baueButton(menu,"Zum Menü");

        baueButton(e1,"entscheidung 1");
        baueButton(e2,"entscheidung 2");
        baueButton(e3,"entscheidung 3");

    }


    public void alleGegnerDrops(AlleMobs gegnerName){
        if (gegnerName == AlleMobs.WOLF){
            baueScene(chapter2,gegnerDrops(AlleMobs.WOLF, Gameobjekt.wolf.getGeldDrop(), Gameobjekt.wolf.getExpDrop(), null));
            chapter2.setBounds(450,400,1200,400);
        }
    }

    public static String gegnerDrops(AlleMobs gegner, int gold, int exp, ItemObjekt item){
        String drops;
        drops = "Eine Harte Schlacht verdient eine gute belohnung, hier ist deine Belohnung \n \n"+"Gegner : "+ gegner +"\n"+ "Gold : "+gold+ "\n"+ "Erfahrung : "+ exp +"\n"+ "Item Drop : "+ item;
        return drops;
    }


    public void visible(boolean visible){
        weiter.setVisible(visible);
        chapter2.setVisible(visible);
        //  menu.setVisible(visible);
    }

    public void titelVisible(boolean visible){
        titel.setVisible(visible);
    }

    public void visibleSwitch(boolean visible){
        e1.setVisible(visible);
        e2.setVisible(visible);
        weiter.setVisible(!visible);
        // menu.setVisible(!visible);
    }

    public void addFrame(){
        MainFrame.frame.add(weiter);
        MainFrame.frame.add(chapter2);
        MainFrame.frame.add(menu);
        MainFrame.frame.add(e1);
        MainFrame.frame.add(e2);
        MainFrame.frame.add(e3);
        MainFrame.frame.add(titel);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource()==weiter&& weiterCount==0){
            chapter2.setText(TexteKapitel2.zweitesKapitel2);
            weiterCount = 2;

        }
        else if (e.getSource()==weiter && weiterCount==2){
            chapter2.setText(TexteKapitel2.zweitesKapitel3);
            weiterCount = 3;
        }

        // Seraphine kämpft gegen den wolf
        else if (e.getSource()==weiter && weiterCount==3){
            visible(false);
            Battle battle = new Battle();

            Battle.mob = AlleMobs.WOLF;
            battle.mobstats();
        }

        else if (e.getSource()==weiter && weiterCount==4){
            chapter2.setText(TexteKapitel2.zweitesKapitel4a);
            bounds();

        }
        else if (e.getSource()==weiter && weiterCount==5){
            chapter2.setText(TexteKapitel2.zweitesKapitel4b);
            bounds();
        }





    }
}
