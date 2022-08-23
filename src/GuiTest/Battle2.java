package GuiTest;

import Scenen.AiStats;
import Scenen.Texte;
import logic.AlleMobs;
import logic.Gameobjekt;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Battle2 implements ActionListener {

    JButton waffe1 = new JButton();
    JLabel gegnerStats = new JLabel();
    public static AlleMobs mob;


    public Battle2(){

        addFrame();
        setVisible(true);
        battleScreen();
        AiStats.ai();
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

        gegnerStats.setBounds(250, 150, 1500, 300);


        waffe1.setBounds(650, 650, 300, 200);


        baueButton(waffe1,"Attake");



        mobstats();

    }


    // HIER SIND ALLE GEGENER GEGEN DIE DER HELD KÄMPFT
    public void mobstats(){
        if (mob == AlleMobs.WOLF){
            // DIE STATS DES WOLFES
            gegnerStats.setText("Name: "+ Gameobjekt.wolf.getName()+ "      Art: "+ Gameobjekt.wolf.getArt()+ "      Lv : "+
                    Gameobjekt.wolf.getLv()+ "      Hp : "+ Gameobjekt.wolf.getHp()+ "      Damage : "+ Gameobjekt.wolf.getAttacke());

            // DER TEXT DER BEIM KAMPF AUSGEGEBEN WIRD
//            gameplaytext.setText("Du hast den Wolf stark verwundet und ihn "+ Gameobjekt.held.atacke+" schaden zugefügt ");
//            gameplaytext2.setText("Der Wolf schlägt zurück, du erleidest "+ Gameobjekt.wolf.getAttacke()+ " schaden ");
        }


        else if (mob == AlleMobs.BRAUNBEAR){
            gegnerStats.setText("Name: "+ Gameobjekt.braunbaer.getName()+ " Art: "+ Gameobjekt.braunbaer.getArt()+ " Lv : "+
                    Gameobjekt.braunbaer.getLv()+ " Hp : "+ Gameobjekt.braunbaer.getHp()+ " Damage : "+ Gameobjekt.braunbaer.getAttacke());
        }

    }

    public void addFrame(){
        MainFrame.frame.add(gegnerStats);
        MainFrame.frame.add(waffe1);

    }
    public void setVisible(boolean visible){
        gegnerStats.setVisible(visible);
        waffe1.setVisible(visible);

    }




    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource()== waffe1){

            waffe1.removeActionListener(this);
            System.out.println("einmal gedrückt");

        }


    }
}
