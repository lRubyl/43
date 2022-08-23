package Scenen;

import logic.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AlteScene implements ActionListener {

    private Held held;

    JFrame frame = new JFrame();
    JLabel text = new JLabel();
    JLabel stats = new JLabel();
    JTextArea willstDuKampfen = new JTextArea();
    JTextArea geschichte = new JTextArea();

    JPanel textpanel = new JPanel();
    JButton neuesSpiel = new JButton();
    JButton exit = new JButton();
    JButton kampfen = new JButton();
    JButton weiter1 = new JButton();

    Texte text1 = new Texte();



    Font font = new Font("Times New Roman", Font.PLAIN, 28);
    Font titel = new Font("Times New Roman", Font.PLAIN, 90);


    // ---------- HAUPTMENÜ -------------------------
    public void frame1Setzen() {
        text.setText("ADVANTURE GAME");
        text.setFont(titel);
        text.setForeground(Color.WHITE);

        textpanel.setBounds(100, 150, 1000, 300);
        textpanel.setBackground(Color.BLACK);

        neuesSpiel.setBounds(465, 450, 250, 50);
        neuesSpiel.setText("NEUES SPIEL");
        neuesSpiel.setBackground(Color.BLACK);
        neuesSpiel.setForeground(Color.WHITE);
        neuesSpiel.setFont(font);
        neuesSpiel.addActionListener(this);
        neuesSpiel.setFocusable(false);

        exit.setBounds(465, 520, 250, 50);
        exit.setText("SPIEL VERLASSEN");
        exit.setBackground(Color.BLACK);
        exit.setForeground(Color.WHITE);
        exit.setFont(font);
        exit.addActionListener(this);
        exit.setFocusable(false);
    }

    public void frame1true() {
        neuesSpiel.setVisible(true);
        exit.setVisible(true);
        textpanel.setVisible(true);
        geschichte.setVisible(false);
        text.setVisible(true);


        frame.add(text);
        frame.add(exit);
        frame.add(textpanel);
        frame.add(neuesSpiel);
        textpanel.add(geschichte);
        textpanel.add(text);
        frame.setVisible(true);
    }

    public void frame1false() {

        neuesSpiel.setVisible(false);
        exit.setVisible(false);
        textpanel.setVisible(false);
        geschichte.setVisible(false);
        text.setVisible(false);
    }

    // ---------- SCENE 1 ---------------------------
    public void scene1() {
        // STORY
        geschichte.setBounds(50, 150, 900, 200);
        geschichte.setText(Texte.prolog1);
        geschichte.setBackground(Color.BLACK);
        geschichte.setForeground(Color.WHITE);
        geschichte.setFont(font);
        geschichte.setEditable(false);
        geschichte.setLineWrap(true);

        // WILLST DU KÄMPFEN STATS DU STATS GEGNER
        willstDuKampfen.setBounds(50, 50, 705, 300);
        willstDuKampfen.setText(heldenStats()+"                               " + wolfStats());
        willstDuKampfen.setBackground(Color.BLACK);
        willstDuKampfen.setForeground(Color.WHITE);
        willstDuKampfen.setFont(font);
        willstDuKampfen.setEditable(false);
        willstDuKampfen.setLineWrap(true);

        // BUTTON WEITER
        weiter1.setBounds(465, 450, 250, 50);
        weiter1.setText("Weiter");
        weiter1.setBackground(Color.BLACK);
        weiter1.setForeground(Color.WHITE);
        weiter1.setFont(font);
        weiter1.setFocusable(false);
        weiter1.addActionListener(this);


        // BUTTON KÄMPFEN
        kampfen.setBounds(465, 450, 250, 50);
        kampfen.setText("Wolf Angreifen");
        kampfen.setBackground(Color.BLACK);
        kampfen.setForeground(Color.WHITE);
        kampfen.setFont(font);
        kampfen.setFocusable(false);
        kampfen.addActionListener(this);


        stats.setBounds(50, 50, 1000, 200);
        stats.setText("Du hast: " + Gameobjekt.held.getHp() + "Hp " + " Dein gegner hat: " + Gameobjekt.wolf.getHp() + " Hp ");
        stats.setFont(font);
        stats.setForeground(Color.WHITE);

        kampfen.setVisible(true);
        frame.add(stats);
        frame.add(willstDuKampfen);
        frame.add(weiter1);
        frame.add(kampfen);


    }

    public void scene1Visible() {


        weiter1.setVisible(true);
        stats.setVisible(false);
        textpanel.setVisible(true);
        willstDuKampfen.setVisible(true);
        geschichte.setVisible(true);
    }

    public void scene1VisibleFalse() {
        textpanel.setVisible(false);
        geschichte.setVisible(false);
        weiter1.setVisible(false);
    }

    public void scene1Kampf() {
        stats.setVisible(true);
    }

    public void scene1ende() {
        stats.setVisible(false);
        kampfen.setVisible(false);
        // willstDuKampfen.setVisible(false);
    }


    public AlteScene() {
        frame1Setzen();
        frame1true();


    }

    public void scene2(){

    }


    public void update() {
        willstDuKampfen.setText(heldenStats()+"                               " + wolfStats());
        stats.setBounds(50, 150, 1000, 200);
        stats.setText("Du hast: " + Gameobjekt.held.getHp() + "Hp " + " Dein gegner hat: " + Gameobjekt.wolf.getHp() + " Hp ");
        stats.setFont(font);
        stats.setForeground(Color.WHITE);
        willstDuKampfen.setText(heldenStats()+"                               " + wolfStats());

    }


    public String wolfStats() {
        return ("Gegner:  "+ Gameobjekt.wolf.getName()+ " Art: "+Gameobjekt.wolf.getArt()+
                "/  Lv:  "+ Gameobjekt.wolf.getLv()+ "/  HP: "+ Gameobjekt.wolf.getHp()+ "/  Stärke:  "+ Gameobjekt.wolf.getAttacke());
    }

    public String heldenStats() {
        return ("Seraphine Lv:   "+Gameobjekt.held.getLv()+"/   HP:   "+ Gameobjekt.held.getHp()+
                "/   Stärke:  "+ Gameobjekt.held.atacke+"");
    }





    // DER ACTION LISTENER WÄCHSELT DIE SCENE
    @Override
    public void actionPerformed(ActionEvent e) {
        // Der Homescreen
        if (e.getSource() == neuesSpiel) {
            frame1false();
            scene1();
            scene1Visible();
        }
        if (e.getSource() == exit) {
            System.exit(0);
        }


        if (e.getSource() == weiter1){
            scene1VisibleFalse();
            scene1Kampf();
        }

        // wenn ich auf kämpfen klicke soll der kampf stattfinden und geschaut werden wann jemand gewonnen hat
        if (e.getSource() == kampfen) {
            System.out.println("du kämpfst jetzt gegen einen wolf");
            Gameplay.normalAngriffHeld(AlleMobs.WOLF);
            Gameplay.normalAngriffGegner(AlleMobs.WOLF);
            try {
                Thread.sleep(200);
            } catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }

            if(!Gameobjekt.wolf.isAmLeben()){
                Mobs.expDrop(40);
                Mobs.goldDrop(50);
                scene1ende();
                scene2();
                System.out.println();
            }

            update();
        }
    }







}
