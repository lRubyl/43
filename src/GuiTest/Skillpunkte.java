
package GuiTest;

import Plays.ScenenCounter;
import Plays.ScenenCounterClass;
import logic.Gameobjekt;
import logic.LvUp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * In diesem Menüpunkt kann der Spieler seine Eigenschaften und Fähigkeiten verbessern.
 * Bei einem Stufenaufstieg erhält der Held Zielpunkte die er in Eigenschaften wie Leben,
 * Angriff oder Rüstung investieren kann, um in den nächsten kämpfen Stärker antreten zu können
 */

public class Skillpunkte implements ActionListener {



    JLabel wilkommen = new JLabel();
    JLabel hp = new JLabel();
    JLabel damage = new JLabel();
    JLabel rustung = new JLabel();
    JLabel level = new JLabel();
    JLabel heldHp = new JLabel();
    JLabel heldDamage = new JLabel();
    JLabel heldRustung = new JLabel();


    JButton plus1 = new JButton();
    JButton minus1 = new JButton();
    JButton plus2 = new JButton();
    JButton minus2 = new JButton();
    JButton plus3 = new JButton();
    JButton minus3 = new JButton();
    JButton bestetigen = new JButton();
    JButton zuruckb = new JButton();




    public Skillpunkte() {
        addFrame();
        visible(true);
        buttons();
        labels();
        update();
        MainFrame.frame.getContentPane().repaint();


    }

    public void buttons(){

        // LABELS POSITION
        wilkommen.setBounds(100, 200, 1600,100);
        hp.setBounds(350, 400, 400,100);
        damage.setBounds(750, 400, 400,100);
        rustung.setBounds(1150, 400, 400,100);
        level.setBounds(1400,300,300,100);
        heldHp.setBounds(1400,400,300,100);
        heldDamage.setBounds(1400,500,300,100);
        heldRustung.setBounds(1400,600,300,100);



        // BUTTONS POSITION
        zuruckb.setBounds(150, 1000, 350, 50);

        plus1.setBounds(300, 500, 100, 50);
        minus1.setBounds(400, 500, 100, 50);
        plus2.setBounds(700, 500, 100, 50);
        minus2.setBounds(800, 500, 100, 50);
        plus3.setBounds(1100, 500, 100, 50);
        minus3.setBounds(1200, 500, 100, 50);

        bestetigen.setBounds(650, 650, 300, 100);


        zuruckb.setText("Zurück zum Hauptmenü");
        zuruckb.setBackground(Color.BLACK);
        zuruckb.setForeground(Color.WHITE);
        zuruckb.setFont(Scenen.Texte.font);
        zuruckb.addActionListener(this);
        zuruckb.setFocusable(false);


        plus1.setText("+1");
        plus1.setBackground(Color.BLACK);
        plus1.setForeground(Color.WHITE);
        plus1.setFont(Scenen.Texte.font);
        plus1.addActionListener(this);
        plus1.setFocusable(false);


        minus1.setText("-1");
        minus1.setBackground(Color.BLACK);
        minus1.setForeground(Color.WHITE);
        minus1.setFont(Scenen.Texte.font);
        minus1.addActionListener(this);
        minus1.setFocusable(false);


        plus2.setText("+1");
        plus2.setBackground(Color.BLACK);
        plus2.setForeground(Color.WHITE);
        plus2.setFont(Scenen.Texte.font);
        plus2.addActionListener(this);
        plus2.setFocusable(false);


        minus2.setText("-1");
        minus2.setBackground(Color.BLACK);
        minus2.setForeground(Color.WHITE);
        minus2.setFont(Scenen.Texte.font);
        minus2.addActionListener(this);
        minus2.setFocusable(false);


        plus3.setText("+1");
        plus3.setBackground(Color.BLACK);
        plus3.setForeground(Color.WHITE);
        plus3.setFont(Scenen.Texte.font);
        plus3.addActionListener(this);
        plus3.setFocusable(false);


        minus3.setText("-1");
        minus3.setBackground(Color.BLACK);
        minus3.setForeground(Color.WHITE);
        minus3.setFont(Scenen.Texte.font);
        minus3.addActionListener(this);
        minus3.setFocusable(false);


        bestetigen.setText("Bestätigen");
        bestetigen.setBackground(Color.BLACK);
        bestetigen.setForeground(Color.WHITE);
        bestetigen.setFont(Scenen.Texte.font);
        bestetigen.addActionListener(this);
        bestetigen.setFocusable(false);

    }

    public void labels(){
        wilkommen.setFont(Scenen.Texte.uberschrift);
        wilkommen.setForeground(Color.BLACK);

        hp.setFont(Scenen.Texte.font);
        hp.setForeground(Color.BLACK);

        damage.setFont(Scenen.Texte.font);
        damage.setForeground(Color.BLACK);

        rustung.setFont(Scenen.Texte.font);
        rustung.setForeground(Color.BLACK);

        level.setFont(Scenen.Texte.font);
        level.setForeground(Color.BLACK);

        heldHp.setFont(Scenen.Texte.font);
        heldHp.setForeground(Color.BLACK);

        heldDamage.setFont(Scenen.Texte.font);
        heldDamage.setForeground(Color.BLACK);

        heldRustung.setFont(Scenen.Texte.font);
        heldRustung.setForeground(Color.BLACK);


    }



    public void addFrame(){
        //Buttons
        MainFrame.frame.add(plus1);
        MainFrame.frame.add(plus2);
        MainFrame.frame.add(plus3);
        MainFrame.frame.add(minus1);
        MainFrame.frame.add(minus2);
        MainFrame.frame.add(minus3);
        MainFrame.frame.add(bestetigen);
        MainFrame.frame.add(zuruckb);

        //Labels
        MainFrame.frame.add(wilkommen);
        MainFrame.frame.add(hp);
        MainFrame.frame.add(damage);
        MainFrame.frame.add(rustung);
        MainFrame.frame.add(level);
        MainFrame.frame.add(heldHp);
        MainFrame.frame.add(heldDamage);
        MainFrame.frame.add(heldRustung);


    }

    public void visible(boolean visible){
        //Buttons
        plus1.setVisible(visible);
        plus2.setVisible(visible);
        plus3.setVisible(visible);
        minus1.setVisible(visible);
        minus2.setVisible(visible);
        minus3.setVisible(visible);
        bestetigen.setVisible(visible);
        zuruckb.setVisible(visible);

        //Labels
        wilkommen.setVisible(visible);
        hp.setVisible(visible);
        damage.setVisible(visible);
        rustung.setVisible(visible);
        level.setVisible(visible);
        heldHp.setVisible(visible);
        heldDamage.setVisible(visible);
        heldRustung.setVisible(visible);
    }


    public void update() {
        //labels

        if(LvUp.getDemowerthp()<=0) {hp.setText("Hp " + Gameobjekt.held.maxHp);}
        else {hp.setText("Hp " + LvUp.getDemowerthp());}

        if(LvUp.getDemowertatacke()<=0){damage.setText("Damage "+ Gameobjekt.held.atacke);}
        else {damage.setText("Damage "+ LvUp.getDemowertatacke());}

        if(LvUp.getDemowertrustung()<=0){rustung.setText("Rüstung "+ Gameobjekt.held.verteidigung);}
        else {rustung.setText("Rüstung "+ LvUp.getDemowertrustung());}

        wilkommen.setText("Was willst du Skillen? Vorhandene skillpunkte: "+ Gameobjekt.held.skillPunkte);
        level.setText("Level: "+Gameobjekt.held.lv);
        heldHp.setText("Hp: "+Gameobjekt.held.maxHp);
        heldDamage.setText("Damage: "+Gameobjekt.held.atacke);
        heldRustung.setText("Rüstung: "+Gameobjekt.held.verteidigung);

    }




    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==zuruckb){
            visible(false);
            ScenenCounterClass.sceneSwitchen(ScenenCounter.MENU);
            // menu.visible();
        }


        // skill puttons + -
        if (e.getSource()== plus1){LvUp.skillHochHp(); update();}

        if (e.getSource()== plus2){LvUp.skillHochAtacke(); update();}

        if (e.getSource()== plus3){LvUp.skillHochRustung(); update();}

        if (e.getSource()== minus1){LvUp.skillRunterHp(); update();}

        if (e.getSource()== minus2){LvUp.skillRunterAtacke(); update();}

        if (e.getSource()== minus3){LvUp.skillRunterRustung(); update();}

        if (e.getSource()== bestetigen){
            LvUp.wurdeBestetigt();
            LvUp.skillsBestetigt();
            update();
        }


    }
}