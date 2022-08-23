package GuiTest;

import Scenen.AiStats;
import Scenen.Geschichte1.Chapter2;
import Scenen.Texte;
import Scenen.TexteKapitel2;
import logic.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Battle implements ActionListener {

    JButton waffe1 = new JButton();
    JButton waffe2 = new JButton();

    JLabel gameplaytext = new JLabel();
    JLabel gameplaytext2 = new JLabel();
    JLabel gegnerStats = new JLabel();
    JLabel cooldown = new JLabel();


    public static AlleMobs mob;
    public boolean hatCooldown = true;
    public int aktion;

    public Battle(){
        addFrame();
        setVisible(true);
        battleScreen();
        new AiStats();
        battleScreen();
    }

    public void baueButton(JButton button, String text){
        button.setText(text);
        button.setBackground(Color.BLACK);
        button.setForeground(Color.WHITE);
        button.setFont(Texte.font);
        button.addActionListener(this);
        button.setFocusable(false);
    }

    public void battleScreen(){

        // HAUPT STATS
        gegnerStats.setBounds(500, 250, 1500, 300);
        gameplaytext.setBounds(500,300,1500,400);
        gameplaytext2.setBounds(500,400,1500,400);
        //KAMPF INFO / DEBUFF / BUFF
        cooldown.setBounds(1500,250,500,400);

        waffe1.setBounds(950, 750, 300, 150);
        waffe2.setBounds(550, 750, 300, 150);

        baueButton(waffe1,"Attacke");
        baueButton(waffe2,"Regenerieren");
        gegnerStats.setFont(Texte.font2);
        gameplaytext.setFont(Texte.font2);
        gameplaytext2.setFont(Texte.font2);
        cooldown.setFont(Texte.font2);

        mobstats();
    }


    // HIER SIND ALLE GEGENER GEGEN DIE DER HELD KÄMPFT
    public void mobstats(){
        //SCHADENSBERECHNUNG FÜR DEN WOLF UND DEN HELDEN
        int schadenVsWolf = Gameobjekt.held.atacke - Gameobjekt.wolf.getVerteidigung();
        int wolfSchaden = Gameobjekt.wolf.getAttacke() - Gameobjekt.held.getVerteidigung();

        if (mob == AlleMobs.WOLF){
            // DIE STATS DES WOLFES
            gegnerStats.setText("Name: "+ Gameobjekt.wolf.getName()+ "      Art: "+ Gameobjekt.wolf.getArt()+ "      Lv : "+
                    Gameobjekt.wolf.getLv()+ "      Hp : "+ Gameobjekt.wolf.getHp()+ "      Damage : "+ Gameobjekt.wolf.getAttacke());

            // DER TEXT DER BEIM KAMPF AUSGEGEBEN WIRD
            gameplaytext.setText("Du hast den Wolf stark verwundet und ihn "+ schadenVsWolf +" schaden zugefügt ");
            gameplaytext2.setText("Der Wolf schlägt zurück, du erleidest "+ wolfSchaden + " schaden ");
        }

        else if (mob == AlleMobs.BRAUNBEAR){
            gegnerStats.setText("Name: "+ Gameobjekt.braunbaer.getName()+ " Art: "+ Gameobjekt.braunbaer.getArt()+ " Lv : "+
                    Gameobjekt.braunbaer.getLv()+ " Hp : "+ Gameobjekt.braunbaer.getHp()+ " Damage : "+ Gameobjekt.braunbaer.getAttacke());
        }
    }

    public void checkCooldown(){
        if(hatCooldown){
            cooldown.setText("Fähigkeit auf Cooldown");
            cooldown.setVisible(true);
            System.out.println(hatCooldown);
        }
        else {
            cooldown.setVisible(false);
            System.out.println(hatCooldown);
        }
    }

    public void addFrame(){
        MainFrame.frame.add(gegnerStats);
        MainFrame.frame.add(gameplaytext);
        MainFrame.frame.add(gameplaytext2);
        MainFrame.frame.add(cooldown);
        MainFrame.frame.add(waffe1);
        MainFrame.frame.add(waffe2);
    }
    public void setVisible(boolean visible){
        gegnerStats.setVisible(visible);
        gameplaytext.setVisible(visible);
        gameplaytext2.setVisible(visible);
        waffe1.setVisible(visible);
        waffe2.setVisible(visible);
    }




    public void gegnerSpownen(AlleMobs gegner, int aktion ){

        if(gegner== AlleMobs.WOLF&& !Gameobjekt.wolf.isAmLeben()){
            setVisible(false);
            cooldown.setVisible(false);
            hatCooldown=false;
            System.out.println("DER WOLF LEBT NICHT MEHR ");

            if (Gameobjekt.held.hp>=50){
                Chapter2.weiterCount = 5;
            }
            else{
                Chapter2.weiterCount = 4;
            }

            Gameobjekt.held.exp = Gameobjekt.wolf.getExpDrop();
            Gameobjekt.held.geld = Gameobjekt.wolf.getGeldDrop();
            System.out.println(Gameobjekt.held.exp);
            System.out.println(Gameobjekt.held.geld);

            Chapter2.weiter.setVisible(true);
            Chapter2 chapter2 = new Chapter2();
            chapter2.scene2(AlleMobs.WOLF);
            AiStats.ai();

            System.out.println(Chapter2.weiterCount+" das ist der weiter counter");
        }


        // NORMALER ANGRIFF
        if (gegner == AlleMobs.WOLF&& aktion==1){
            // NUR DER WOLF WIRD ANGESPROCHEN && OB ER AM LEBEN IST
            if (AlleMobs.WOLF==mob && Gameobjekt.wolf.isAmLeben()){
                hatCooldown=false;
                Mobs.lebtMobNoch(AlleMobs.WOLF);
                Gameplay.normalAngriffHeld(AlleMobs.WOLF);
                Gameplay.normalAngriffGegner(AlleMobs.WOLF);
                AiStats.ai();
                mobstats();
                System.out.println("angriff durchgeführt");

            }
        }
        // SELFCARE REGENERATION
        else if(gegner == AlleMobs.WOLF&& aktion==2){
            if (AlleMobs.WOLF == mob && Gameobjekt.wolf.isAmLeben()&& !hatCooldown) {
                checkCooldown();
                Mobs.lebtMobNoch(AlleMobs.WOLF);
                Held.regeneration();
                Gameplay.normalAngriffGegner(AlleMobs.WOLF);
                AiStats.ai();
                hatCooldown=true;
                System.out.println("Regeneration");
            }
        }






    }




    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == waffe1){
            System.out.println("das erste ");
            checkCooldown();
            gegnerSpownen(mob,1);
        }



        if (e.getSource() == waffe2) {
            gegnerSpownen(mob,2);
            checkCooldown();



        }







    }
}
