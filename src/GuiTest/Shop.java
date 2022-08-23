package GuiTest;

import Plays.ScenenCounter;
import Plays.ScenenCounterClass;
import Scenen.AiStats;
import logic.Gameobjekt;
import logic.Verkaufer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Der Laden bietet verschiedene Items an die der Spieler im Kampf oder zum Verbessern der Ausrüstung benutzen kann.
 */

public class Shop implements ActionListener {


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
    JLabel kleinerHeiltrank = new JLabel();
    JLabel mittlererHeiltrank = new JLabel();
    JLabel großerHeiltrank = new JLabel();
    JLabel epischerHeiltrank = new JLabel();
    JLabel kraftingstein = new JLabel();
    JLabel kraftingBroken = new JLabel();
    JLabel reperaturkit = new JLabel();

    JLabel preis1 = new JLabel();
    JLabel preis2 = new JLabel();
    JLabel preis3 = new JLabel();
    JLabel preis4 = new JLabel();
    JLabel preis5 = new JLabel();
    JLabel preis6 = new JLabel();
    JLabel preis7 = new JLabel();
    JLabel preis8 = new JLabel();


    public Shop() {
        addFrame();
        visible(true);
        buttons();
        labels();
        MainFrame.frame.getContentPane().repaint();


    }

    public void buttons(){

        zuruckb.setBounds(150, 1000, 350, 50);
        zuruckb.setText("Zurück zum Hauptmenü");
        zuruckb.setBackground(Color.BLACK);
        zuruckb.setForeground(Color.WHITE);
        zuruckb.setFont(Scenen.Texte.font);
        zuruckb.addActionListener(this);
        zuruckb.setFocusable(false);

        item1b.setBounds(200, 500, 250, 50);
        item1b.setText("Kaufen");
        item1b.setBackground(Color.BLACK);
        item1b.setForeground(Color.WHITE);
        item1b.setFont(Scenen.Texte.font);
        item1b.addActionListener(this);
        item1b.setFocusable(false);

        item2b.setBounds(500, 500, 250, 50);
        item2b.setText("Kaufen");
        item2b.setBackground(Color.BLACK);
        item2b.setForeground(Color.WHITE);
        item2b.setFont(Scenen.Texte.font);
        item2b.addActionListener(this);
        item2b.setFocusable(false);

        item3b.setBounds(800, 500, 250, 50);
        item3b.setText("Kaufen");
        item3b.setBackground(Color.BLACK);
        item3b.setForeground(Color.WHITE);
        item3b.setFont(Scenen.Texte.font);
        item3b.addActionListener(this);
        item3b.setFocusable(false);

        item4b.setBounds(200, 800, 250, 50);
        item4b.setText("Kaufen");
        item4b.setBackground(Color.BLACK);
        item4b.setForeground(Color.WHITE);
        item4b.setFont(Scenen.Texte.font);
        item4b.addActionListener(this);
        item4b.setFocusable(false);

        item5b.setBounds(500, 800, 250, 50);
        item5b.setText("Kaufen");
        item5b.setBackground(Color.BLACK);
        item5b.setForeground(Color.WHITE);
        item5b.setFont(Scenen.Texte.font);
        item5b.addActionListener(this);
        item5b.setFocusable(false);

        item6b.setBounds(800, 800, 250, 50);
        item6b.setText("Kaufen");
        item6b.setBackground(Color.BLACK);
        item6b.setForeground(Color.WHITE);
        item6b.setFont(Scenen.Texte.font);
        item6b.addActionListener(this);
        item6b.setFocusable(false);

        item7b.setBounds(1200, 500, 250, 50);
        item7b.setText("Kaufen");
        item7b.setBackground(Color.BLACK);
        item7b.setForeground(Color.WHITE);
        item7b.setFont(Scenen.Texte.font);
        item7b.addActionListener(this);
        item7b.setFocusable(false);

        item8b.setBounds(1200, 800, 250, 50);
        item8b.setText("Kaufen");
        item8b.setBackground(Color.BLACK);
        item8b.setForeground(Color.WHITE);
        item8b.setFont(Scenen.Texte.font);
        item8b.addActionListener(this);
        item8b.setFocusable(false);

    }

    public void labels(){

        wilkommen.setBounds(250, 50, 1200,200);
        wilkommen.setText("Willkommen zum shop was wollen sie kaufen?");
        wilkommen.setFont(Scenen.Texte.uberschrift);
        wilkommen.setForeground(Color.BLACK);

        hp.setBounds(600, 150, 200,200);
        hp.setText("Hp "+ Gameobjekt.held.hp);
        hp.setFont(Scenen.Texte.font);
        hp.setForeground(Color.BLACK);

        geld.setBounds(800, 150, 400,200);
        geld.setText("Geld "+ Gameobjekt.held.geld);
        geld.setFont(Scenen.Texte.font);
        geld.setForeground(Color.BLACK);

        kleinerHeiltrank.setBounds(1500, 50, 400,200);
        kleinerHeiltrank.setText("kleiner Heiltrank "+ Gameobjekt.held.kleinerHeiltrank);
        kleinerHeiltrank.setFont(Scenen.Texte.font);
        kleinerHeiltrank.setForeground(Color.BLACK);

        mittlererHeiltrank.setBounds(1500, 100, 400,200);
        mittlererHeiltrank.setText("mittlerer Heiltrank "+ Gameobjekt.held.mittlererHeiltrank);
        mittlererHeiltrank.setFont(Scenen.Texte.font);
        mittlererHeiltrank.setForeground(Color.BLACK);

        großerHeiltrank.setBounds(1500, 150, 400,200);
        großerHeiltrank.setText("Großer Heiltrank "+ Gameobjekt.held.grosserHeiltrank);
        großerHeiltrank.setFont(Scenen.Texte.font);
        großerHeiltrank.setForeground(Color.BLACK);

        epischerHeiltrank.setBounds(1500, 200, 400,200);
        epischerHeiltrank.setText("Epischer Heiltrank "+ Gameobjekt.held.epischerHeiltrank);
        epischerHeiltrank.setFont(Scenen.Texte.font);
        epischerHeiltrank.setForeground(Color.BLACK);


        // Die preise für die items

        preis1.setBounds(200, 500, 400,200);
        preis1.setText("Kleiner Heiltrank "+ Verkaufer.kleinerHeiltrankPreis);
        preis1.setFont(Scenen.Texte.font);
        preis1.setForeground(Color.BLACK);

        preis2.setBounds(500, 500, 400,200);
        preis2.setText("Mittlerer Heiltrank "+ Verkaufer.mittlererHeiltrankPreis);
        preis2.setFont(Scenen.Texte.font);
        preis2.setForeground(Color.BLACK);

        preis3.setBounds(800, 500, 400,200);
        preis3.setText("Großer Heiltrank "+ Verkaufer.grosserHeiltrankPreis);
        preis3.setFont(Scenen.Texte.font);
        preis3.setForeground(Color.BLACK);

        preis4.setBounds(200, 800, 400,200);
        preis4.setText("Epischer Heiltrank "+ Verkaufer.epischerHeiltrankPreis);
        preis4.setFont(Scenen.Texte.font);
        preis4.setForeground(Color.BLACK);

        preis5.setBounds(500, 800, 400,200);
        preis5.setText(" Craftingstein "+ Verkaufer.kraftingSteinPreis);
        preis5.setFont(Scenen.Texte.font);
        preis5.setForeground(Color.BLACK);

        preis6.setBounds(800, 800, 400,200);
        preis6.setText("Reperaturkid "+ Verkaufer.reperaturkidPreis);
        preis6.setFont(Scenen.Texte.font);
        preis6.setForeground(Color.BLACK);

        preis7.setBounds(1200, 500, 400,200);
        preis7.setText(" Crafting brocken "+ Verkaufer.kraftingBrockenPreis);
        preis7.setFont(Scenen.Texte.font);
        preis7.setForeground(Color.BLACK);



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
        MainFrame.frame.add(kleinerHeiltrank);
        MainFrame.frame.add(mittlererHeiltrank);
        MainFrame.frame.add(großerHeiltrank);
        MainFrame.frame.add(epischerHeiltrank);
        //preis Labels
        MainFrame.frame.add(preis1);
        MainFrame.frame.add(preis2);
        MainFrame.frame.add(preis3);
        MainFrame.frame.add(preis4);
        MainFrame.frame.add(preis5);
        MainFrame.frame.add(preis6);
        MainFrame.frame.add(preis7);
        MainFrame.frame.add(preis8);
    }

    public void visible(boolean visible){
        //Buttons
        item1b.setVisible(visible);
        item2b.setVisible(visible);
        item3b.setVisible(visible);
        item4b.setVisible(visible);
        item5b.setVisible(visible);
        item6b.setVisible(visible);
        item7b.setVisible(visible);
        item8b.setVisible(visible);
        zuruckb.setVisible(visible);

        //Labels
        wilkommen.setVisible(visible);
        hp.setVisible(visible);
        geld.setVisible(visible);
        kleinerHeiltrank.setVisible(visible);
        mittlererHeiltrank.setVisible(visible);
        großerHeiltrank.setVisible(visible);
        epischerHeiltrank.setVisible(visible);
        preis1.setVisible(visible);
        preis2.setVisible(visible);
        preis3.setVisible(visible);
        preis4.setVisible(visible);
        preis5.setVisible(visible);
        preis6.setVisible(visible);
        preis7.setVisible(visible);
        preis8.setVisible(visible);
    }


    public void update() {
        //labels
        hp.setText("Hp "+ Gameobjekt.held.hp);
        geld.setText("Geld "+ Gameobjekt.held.geld);
        kleinerHeiltrank.setText("kleiner Heiltrank "+ Gameobjekt.held.kleinerHeiltrank);
        mittlererHeiltrank.setText("mittlerer Heiltrank "+ Gameobjekt.held.mittlererHeiltrank);
        großerHeiltrank.setText("Großer Heiltrank "+ Gameobjekt.held.grosserHeiltrank);
        epischerHeiltrank.setText("Epischer Heiltrank "+ Gameobjekt.held.epischerHeiltrank);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==zuruckb){
            visible(false);
            ScenenCounterClass.sceneSwitchen(ScenenCounter.MENU);
           // menu.visible();
        }
        // Shop buttons
        if (e.getSource()== item1b){Verkaufer.kleinerHeiltrankKaufen(); update();AiStats.ai();}
        if (e.getSource()== item2b){Verkaufer.mittlererHeiltrankKaufen(); update();AiStats.ai();}
        if (e.getSource()== item3b){Verkaufer.grosserHeiltrankKaufen(); update();AiStats.ai();}
        if (e.getSource()== item4b){Verkaufer.epischerHeiltrankKaufen(); update();AiStats.ai();}
        if (e.getSource()== item5b){Verkaufer.reperaturkidKaufen(); update();AiStats.ai();}
        if (e.getSource()== item6b){Verkaufer.kraftingSteinKaufen(); update();AiStats.ai();}
        if (e.getSource()== item7b){Verkaufer.kraftingBrockenKaufen(); update();AiStats.ai();}
        if (e.getSource()== item8b){Verkaufer.reperaturkidKaufen(); update();AiStats.ai();}

    }
}
