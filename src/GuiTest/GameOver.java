package GuiTest;

import Plays.ScenenCounter;
import Plays.ScenenCounterClass;
import Scenen.Geschichte1.Chapter1;
import Scenen.Geschichte1.Chapter2;
import Scenen.Prolog.Prolog1;
import Scenen.Texte;
import logic.Speichern;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Hier wird das "Game Over" Fenster definiert
 * Kommt zum Einsatz, wenn der Spieler stirbt
 */

public class GameOver implements ActionListener {


    JLabel text = new JLabel();
    JButton ja = new JButton();
    JButton nein = new JButton();

    public GameOver(){

        addFrame();
        visible(true);
        spielVerlassen();
    }

    public void spielVerlassen(){
        text.setBounds(400,250,1600,300);
        ja.setBounds(500, 550, 400, 100);
        nein.setBounds(1000, 550, 400, 100);


        text.setText("Du bist Gestorben! Erneut versuchen?");
        text.setFont(Scenen.Texte.uberschrift);
        text.setForeground(Color.BLACK);
        text.setOpaque(true);

        ja.setText("JA");
        ja.setBackground(Color.BLACK);
        ja.setForeground(Color.WHITE);
        ja.setFont(Scenen.Texte.font);
        ja.addActionListener(this);
        ja.setFocusable(false);

        nein.setText("NEIN");
        nein.setBackground(Color.BLACK);
        nein.setForeground(Color.WHITE);
        nein.setFont(Scenen.Texte.font);
        nein.addActionListener(this);
        nein.setFocusable(false);

    }
    public void visible(boolean state){
        text.setVisible(state);
        ja.setVisible(state);
        nein.setVisible(state);

    }
    public void addFrame(){
        MainFrame.frame.add(text);
        MainFrame.frame.add(ja);
        MainFrame.frame.add(nein);
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == ja){
            if (Speichern.speichern == 0){
                Prolog1 prolog1 = new Prolog1();
                Texte.weiterCounterProlog=0;
                visible(false);
            }
            if(Speichern.speichern == 1){
                Chapter2 chapter2 = new Chapter2();
            }

        }
        if(e.getSource() == nein){
            visible(false);
            ScenenCounterClass.sceneSwitchen(ScenenCounter.MENU);
        }
    }



}
