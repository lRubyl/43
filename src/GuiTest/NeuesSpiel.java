package GuiTest;

import Plays.ScenenCounter;
import Plays.ScenenCounterClass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Diese klasse benutzt man um das neue Spiel zu starten .. man wird gefragt ob man das wirklich machen möchte
 */

public class NeuesSpiel implements ActionListener {

    JTextPane text = new JTextPane();
    JButton ja = new JButton();
    JButton nein = new JButton();

    public NeuesSpiel(){

        addFrame();
        visible(true);
        neuesSpiel();
    }

    public void neuesSpiel(){
        text.setBounds(200,250,1600,300);
        ja.setBounds(500, 550, 400, 100);
        nein.setBounds(1000, 550, 400, 100);


        text.setText("Möchten sie wirklich ein neues spiel starten, ungespeicherte spielstände können vermutlich verloren gehen ?");
        text.setFont(Scenen.Texte.uberschrift);
        text.setForeground(Color.BLACK);
        text.setBackground(null);
        text.setEditable(false);
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
            visible(false);
           // ScenenCounterClass.sceneSwitchen(ScenenCounter.AI);
            ScenenCounterClass.sceneSwitchen(ScenenCounter.PROLOG1);
        }
        if(e.getSource() == nein){
            visible(false);
            ScenenCounterClass.sceneSwitchen(ScenenCounter.HAUPTMENU);
        }
    }



}
