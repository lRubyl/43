package GuiTest;

import Plays.Ausfuhrungen;
import logic.Gameobjekt;
import logic.Verkaufer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Im Lager sieht der Spieler alle Items, die der Held gesammelt hat und
 * kann diese an ihm ausrüsten, oder zerstören falls er weiteren Platz benötigt,
 * da die Kapazität des Helden begrenzt ist.
 */

public class Lager implements ActionListener {


    JButton zuruckb = new JButton();
    JButton item1b = new JButton();
    JButton item2b = new JButton();
    JButton item3b = new JButton();
    JButton item4b = new JButton();
    JButton item5b = new JButton();
    JButton item6b = new JButton();
    JButton item7b = new JButton();
    JButton item8b = new JButton();

    JLabel wilkommen = new JLabel();
    JLabel hp = new JLabel();
    JLabel geld = new JLabel();
    JLabel item1 = new JLabel();
    JLabel item2 = new JLabel();
    JLabel item3 = new JLabel();
    JLabel item4 = new JLabel();
    JLabel item5 = new JLabel();
    JLabel item6 = new JLabel();
    JLabel item7 = new JLabel();


    public Lager() {
        addFrame();
        visible();
        buttons();
        labels();


    }

    public void buttons(){

        zuruckb.setBounds(100, 800, 350, 50);
        zuruckb.setText("Zurück zum Hauptmenü");
        zuruckb.setBackground(Color.BLACK);
        zuruckb.setForeground(Color.WHITE);
        zuruckb.setFont(Scenen.Texte.font);
        zuruckb.addActionListener(this);
        zuruckb.setFocusable(false);

        item1b.setBounds(100, 350, 250, 50);
        item1b.setText("Ausrüsten");
        item1b.setBackground(Color.BLACK);
        item1b.setForeground(Color.WHITE);
        item1b.setFont(Scenen.Texte.font);
        item1b.addActionListener(this);
        item1b.setFocusable(false);

        item2b.setBounds(400, 350, 250, 50);
        item2b.setText("Ausrüsten");
        item2b.setBackground(Color.BLACK);
        item2b.setForeground(Color.WHITE);
        item2b.setFont(Scenen.Texte.font);
        item2b.addActionListener(this);
        item2b.setFocusable(false);

        item3b.setBounds(700, 350, 250, 50);
        item3b.setText("Ausrüsten");
        item3b.setBackground(Color.BLACK);
        item3b.setForeground(Color.WHITE);
        item3b.setFont(Scenen.Texte.font);
        item3b.addActionListener(this);
        item3b.setFocusable(false);

        item4b.setBounds(100, 700, 250, 50);
        item4b.setText("Ausrüsten");
        item4b.setBackground(Color.BLACK);
        item4b.setForeground(Color.WHITE);
        item4b.setFont(Scenen.Texte.font);
        item4b.addActionListener(this);
        item4b.setFocusable(false);

        item5b.setBounds(400, 700, 250, 50);
        item5b.setText(" Ausrüsten ");
        item5b.setBackground(Color.BLACK);
        item5b.setForeground(Color.WHITE);
        item5b.setFont(Scenen.Texte.font);
        item5b.addActionListener(this);
        item5b.setFocusable(false);

        item6b.setBounds(700, 700, 250, 50);
        item6b.setText("Ausrüsten");
        item6b.setBackground(Color.BLACK);
        item6b.setForeground(Color.WHITE);
        item6b.setFont(Scenen.Texte.font);
        item6b.addActionListener(this);
        item6b.setFocusable(false);

        item7b.setBounds(1000, 350, 250, 50);
        item7b.setText("Ausrüsten");
        item7b.setBackground(Color.BLACK);
        item7b.setForeground(Color.WHITE);
        item7b.setFont(Scenen.Texte.font);
        item7b.addActionListener(this);
        item7b.setFocusable(false);

        item8b.setBounds(1000, 700, 250, 50);
        item8b.setText("Ausrüsten");
        item8b.setBackground(Color.BLACK);
        item8b.setForeground(Color.WHITE);
        item8b.setFont(Scenen.Texte.font);
        item8b.addActionListener(this);
        item8b.setFocusable(false);

    }

    public void labels(){

        wilkommen.setBounds(500, 50, 1000,200);
        wilkommen.setText("Willkommen zu deinem lager hier kannst du dich zu ruhe setzen?");
        wilkommen.setFont(Scenen.Texte.font);
        wilkommen.setForeground(Color.BLACK);

        hp.setBounds(100, 50, 200,200);
        hp.setText("Hp "+ Gameobjekt.held.hp);
        hp.setFont(Scenen.Texte.font);
        hp.setForeground(Color.BLACK);

        geld.setBounds(100, 150, 400,200);
        geld.setText("Geld "+ Gameobjekt.held.geld);
        geld.setFont(Scenen.Texte.font);
        geld.setForeground(Color.BLACK);

        item1.setBounds(1200, 50, 400,200);
        item1.setText(" "+ Gameobjekt.held.kleinerHeiltrank);
        item1.setFont(Scenen.Texte.font);
        item1.setForeground(Color.BLACK);

        item1.setBounds(1200, 100, 400,200);
        item1.setText("mittlerer Heiltrank "+ Gameobjekt.held.mittlererHeiltrank);
        item1.setFont(Scenen.Texte.font);
        item1.setForeground(Color.BLACK);

        item1.setBounds(1200, 150, 400,200);
        item1.setText("Großer Heiltrank "+ Gameobjekt.held.grosserHeiltrank);
        item1.setFont(Scenen.Texte.font);
        item1.setForeground(Color.BLACK);

        item1.setBounds(1200, 200, 400,200);
        item1.setText("Epischer Heiltrank "+ Gameobjekt.held.epischerHeiltrank);
        item1.setFont(Scenen.Texte.font);
        item1.setForeground(Color.BLACK);

    }



    public void addFrame(){
        //Buttons
        MainFrame.frame.add(item1b);
        MainFrame.frame.add(item2b);
        MainFrame.frame.add(item3b);
        MainFrame.frame.add(item4b);
        MainFrame.frame.add(item5b);
        MainFrame.frame.add(item6b);
        MainFrame.frame.add(item7b);
        MainFrame.frame.add(item8b);
        MainFrame.frame.add(zuruckb);

        //Labels
        MainFrame.frame.add(wilkommen);
        MainFrame.frame.add(hp);
        MainFrame.frame.add(geld);
        MainFrame.frame.add(item1);
        MainFrame.frame.add(item1);
        MainFrame.frame.add(item1);
        MainFrame.frame.add(item1);
    }

    public void visible(){
        //Buttons
        item1b.setVisible(true);
        item2b.setVisible(true);
        item3b.setVisible(true);
        item4b.setVisible(true);
        item5b.setVisible(true);
        item6b.setVisible(true);
        item7b.setVisible(true);
        item8b.setVisible(true);
        zuruckb.setVisible(true);
        //Labels
        wilkommen.setVisible(true);
        hp.setVisible(true);
        geld.setVisible(true);
        item1.setVisible(true);
        item1.setVisible(true);
        item1.setVisible(true);
        item1.setVisible(true);
    }

    public void inVisible(){
        //Buttons
        item1b.setVisible(false);
        item2b.setVisible(false);
        item3b.setVisible(false);
        item4b.setVisible(false);
        item5b.setVisible(false);
        item6b.setVisible(false);
        item7b.setVisible(false);
        item8b.setVisible(false);
        zuruckb.setVisible(false);

        //Labels
        wilkommen.setVisible(false);
        hp.setVisible(false);
        geld.setVisible(false);
        item1.setVisible(false);
        item1.setVisible(false);
        item1.setVisible(false);
        item1.setVisible(false);
    }

    public void update() {
        hp.setText("Hp "+ Gameobjekt.held.hp);
        geld.setText("Geld "+ Gameobjekt.held.geld);
        item1.setText("kleiner Heiltrank "+ Gameobjekt.held.kleinerHeiltrank);
        item1.setText("mittlerer Heiltrank "+ Gameobjekt.held.mittlererHeiltrank);
        item1.setText("Großer Heiltrank "+ Gameobjekt.held.grosserHeiltrank);
        item1.setText("Epischer Heiltrank "+ Gameobjekt.held.epischerHeiltrank);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==zuruckb){
            inVisible();
            Ausfuhrungen.menu();
        }
        // Shop buttons
        if (e.getSource()== item1b){Verkaufer.kleinerHeiltrankKaufen(); update();}
        if (e.getSource()== item2b){Verkaufer.mittlererHeiltrankKaufen(); update();}
        if (e.getSource()== item3b){Verkaufer.grosserHeiltrankKaufen(); update();}
        if (e.getSource()== item4b){Verkaufer.epischerHeiltrankKaufen(); update();}
        if (e.getSource()== item5b){Verkaufer.reperaturkidKaufen(); update();}
        if (e.getSource()== item6b){Verkaufer.kraftingSteinKaufen(); update();}
        if (e.getSource()== item7b){Verkaufer.kraftingBrockenKaufen(); update();}
        if (e.getSource()== item8b){Verkaufer.reperaturkidKaufen(); update();}

    }
}
