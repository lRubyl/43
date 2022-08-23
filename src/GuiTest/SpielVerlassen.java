package GuiTest;

import Plays.ScenenCounter;
import Plays.ScenenCounterClass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SpielVerlassen implements ActionListener {


    JLabel text = new JLabel();
    JButton ja = new JButton();
    JButton nein = new JButton();

    public SpielVerlassen(){

        addFrame();
        visible(true);
        spielVerlassen();
    }

    public void spielVerlassen(){
        text.setBounds(400,250,1600,300);
        ja.setBounds(500, 550, 400, 100);
        nein.setBounds(1000, 550, 400, 100);


        text.setText("MÖCHTEN SIE DAS SPIEL VERLASSEN?");
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
            System.exit(0);
        }
        if(e.getSource() == nein){
            visible(false);
            ScenenCounterClass.sceneSwitchen(ScenenCounter.MENU);
        }
    }
}
