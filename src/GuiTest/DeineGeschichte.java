package GuiTest;

import Plays.ScenenCounter;
import Plays.ScenenCounterClass;
import Scenen.Texte;
import logic.AlleSchlussel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Hier wird das Fenster für die Auswahl der jeweiligen Geschichte gebaut
 */

public class DeineGeschichte implements ActionListener {

    JLabel text = new JLabel();
    JButton jesaja = new JButton();
    JButton alex = new JButton();

    public DeineGeschichte(){

        addFrame();
        visible(true);
        spielVerlassen();
    }

    public void spielVerlassen(){
        text.setBounds(550,150,1600,300);
        jesaja.setBounds(600, 450, 700, 150);
        alex.setBounds(600, 650, 700, 150);


        text.setText("Wähle dein Abenteuer");
        text.setFont(Texte.titel);
        text.setForeground(Color.BLACK);
        text.setOpaque(true);

        jesaja.setText("Heavens Dream");
        jesaja.setBackground(Color.BLACK);
        jesaja.setForeground(Color.WHITE);
        jesaja.setFont(Texte.font);
        jesaja.addActionListener(this);
        jesaja.setFocusable(false);

        alex.setText("Alex");
        alex.setBackground(Color.BLACK);
        alex.setForeground(Color.WHITE);
        alex.setFont(Texte.font);
        alex.addActionListener(this);
        alex.setFocusable(false);

    }
    public void visible(boolean state){
        text.setVisible(state);
        jesaja.setVisible(state);
        alex.setVisible(state);

    }
    public void addFrame(){
        MainFrame.frame.add(text);
        MainFrame.frame.add(jesaja);
        MainFrame.frame.add(alex);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()== jesaja){
            visible(false);
            ScenenCounterClass.sceneSwitchen(ScenenCounter.NEUESSPIEL);
            Texte.weiterCounterProlog = 0;
            new AlleSchlussel();
        }
    }
}
