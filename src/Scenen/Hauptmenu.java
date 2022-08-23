package Scenen;

import Audio.AudioGeschichte;
import GuiTest.DeineGeschichte;
import GuiTest.MainFrame;
import GuiTest.NeuesSpiel;
import Plays.Ausfuhrungen;
import Plays.ScenenCounter;
import Plays.ScenenCounterClass;
import Scenen.Geschichte1.Chapter2;
import logic.AlleSchlussel;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Hauptmenu implements ActionListener, MouseListener {


    JLabel text = new JLabel();

    JButton neuesSpiel = new JButton();
    JButton spielLaden = new JButton();
    JButton spielVerlassen = new JButton();




    public Hauptmenu(){


        addAll();
        visible(true);
        frame1Setzen();


    }



    // ---------- HAUPTMENÜ -------------------------
    public void frame1Setzen() {

        text.setBounds(600,50,1500,400);
        neuesSpiel.setBounds(650, 400, 550, 150);
        spielLaden.setBounds(650, 600, 550, 150);
        spielVerlassen.setBounds(650, 800, 550, 150);

        text.setText("Heavens Dream");
        text.setFont(Texte.hauptmenu);
        text.setForeground(Color.BLACK);

        neuesSpiel.setText("Neues Spiel");
        neuesSpiel.setBackground(Color.BLACK);
        neuesSpiel.setForeground(Color.WHITE);
        neuesSpiel.setFont(Texte.font);
        neuesSpiel.addActionListener(this);
        neuesSpiel.addMouseListener(this);
        neuesSpiel.setFocusable(false);
        neuesSpiel.setOpaque(true);
//        neuesSpiel.setContentAreaFilled(false);
//        neuesSpiel.setBorderPainted(false);

        spielLaden.setText("Spiel Laden");
        spielLaden.setBackground(Color.BLACK);
        spielLaden.setForeground(Color.WHITE);
        spielLaden.setFont(Texte.font);
        spielLaden.addActionListener(this);
        spielLaden.addMouseListener(this);
        spielLaden.setFocusable(false);
        spielLaden.setOpaque(true);
//        spielLaden.setContentAreaFilled(false);
//        spielLaden.setBorderPainted(false);


        spielVerlassen.setText("Spiel Verlassen");
        spielVerlassen.setBackground(Color.BLACK);
        spielVerlassen.setForeground(Color.WHITE);
        spielVerlassen.setFont(Texte.font);
        spielVerlassen.addActionListener(this);
        spielVerlassen.addMouseListener(this);
        spielVerlassen.setFocusable(false);
        spielVerlassen.setOpaque(true);
//        spielVerlassen.setBorderPainted(false);


    }

    public void visible(boolean sichtbar){

        text.setVisible(sichtbar);
        neuesSpiel.setVisible(sichtbar);
        spielLaden.setVisible(sichtbar);
        spielVerlassen.setVisible(sichtbar);
    }

    public void addAll(){
        MainFrame.frame.add(text);
        MainFrame.frame.add(neuesSpiel);
        MainFrame.frame.add(spielLaden);
        MainFrame.frame.add(spielVerlassen);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == neuesSpiel){
            visible(false);

            DeineGeschichte deineGeschichte = new DeineGeschichte();
            System.out.println("Du stürtzt dich wieder zurück ins abenteuer");
        }

        if(e.getSource() == spielLaden){
            visible(false);
            Chapter2 chapter2 = new Chapter2();
            chapter2.scene();
            System.out.println("das sind deine skillpunkte");
        }

        if(e.getSource() == spielVerlassen){

            visible(false);
            Ausfuhrungen.spieleBeenden();

        }

    }


    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {


    }

    @Override
    public void mouseEntered(MouseEvent e) {

        if(e.getSource()==neuesSpiel){
            System.out.println("du hast über den button neues spiel gehovert");
        }
        if(e.getSource()==spielLaden){
            System.out.println("du hast über den button spiel laden gehovert");
        }
        if(e.getSource()==spielVerlassen){
            System.out.println("du hast über den button spiel verlassen gehovert");
        }



    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
