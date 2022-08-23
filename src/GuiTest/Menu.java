package GuiTest;

import Plays.Ausfuhrungen;
import Plays.ScenenCounter;
import Plays.ScenenCounterClass;
import Scenen.AiStats;
import Scenen.Texte;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * Das Menü gibt die auswahlmöglichkeiten für den Shop , das Lager , genau wie die Skillpunte die man skillen kann
 */

public class Menu implements ActionListener{


        JLabel text = new JLabel();


        JButton shop = new JButton();
        JButton inventar = new JButton();

        JButton weiterSpeielen = new JButton();
        JButton skillpunkte = new JButton();
        JButton zuruckZumHauptmenu = new JButton();




        public Menu(){


            addAll();
            visible(true);
            frame1Setzen();


        }



        // ---------- HAUPTMENÜ -------------------------
        public void frame1Setzen() {

            text.setBounds(550,20,1500,400);
            weiterSpeielen.setBounds(650, 300, 450, 100);
            shop.setBounds(650, 450, 450, 100);
            inventar.setBounds(650, 600, 450, 100);
            skillpunkte.setBounds(650, 750, 450, 100);
            zuruckZumHauptmenu.setBounds(650, 900, 450, 100);


            text.setText("Adventure Menü");
            text.setFont(Texte.titel);
            text.setForeground(Color.BLACK);

            weiterSpeielen.setText("WEITER SPIELEN");
            weiterSpeielen.setBackground(Color.BLACK);
            weiterSpeielen.setForeground(Color.WHITE);
            weiterSpeielen.setFont(Texte.font);
            weiterSpeielen.addActionListener(this);
            weiterSpeielen.setFocusable(false);


            shop.setText("SHOP");
            shop.setBackground(Color.BLACK);
            shop.setForeground(Color.WHITE);
            shop.setFont(Texte.font);
            shop.addActionListener(this);
            shop.setFocusable(false);


            inventar.setText("INVENTAR");
            inventar.setBackground(Color.BLACK);
            inventar.setForeground(Color.WHITE);
            inventar.setFont(Texte.font);
            inventar.addActionListener(this);
            inventar.setFocusable(false);


            skillpunkte.setText("SKILLS");
            skillpunkte.setBackground(Color.BLACK);
            skillpunkte.setForeground(Color.WHITE);
            skillpunkte.setFont(Texte.font);
            skillpunkte.addActionListener(this);
            skillpunkte.setFocusable(false);


            zuruckZumHauptmenu.setText("Zurück zum Hauptmenü");
            zuruckZumHauptmenu.setBackground(Color.BLACK);
            zuruckZumHauptmenu.setForeground(Color.WHITE);
            zuruckZumHauptmenu.setFont(Texte.font);
            zuruckZumHauptmenu.addActionListener(this);
            zuruckZumHauptmenu.setFocusable(false);
            zuruckZumHauptmenu.setVisible(true);

        }

        public void visible(boolean sichtbar){

            text.setVisible(sichtbar);
            shop.setVisible(sichtbar);
            inventar.setVisible(sichtbar);
            weiterSpeielen.setVisible(sichtbar);
            skillpunkte.setVisible(sichtbar);
            zuruckZumHauptmenu.setVisible(sichtbar);
        }

        public void addAll(){
            MainFrame.frame.add(text);
            MainFrame.frame.add(shop);
            MainFrame.frame.add(inventar);
            MainFrame.frame.add(weiterSpeielen);
            MainFrame.frame.add(skillpunkte);
            MainFrame.frame.add(zuruckZumHauptmenu);
        }


        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == weiterSpeielen){
              //  visible(false);
                //  AiStats.ai();
                //   AiStats.aiVisible(true);
                //   ScenenCounterClass.sceneSwitchen(ScenenCounter.WEITERSPIELEN);
                System.out.println("Du stürtzt dich wieder zurück ins abenteuer");
            }

            if(e.getSource() == shop){
                visible(false);
                ScenenCounterClass.sceneSwitchen(ScenenCounter.SHOP);
                System.out.println("Du hast den laden betreten");
            }
            if(e.getSource() == inventar){
                visible(false);
                ScenenCounterClass.sceneSwitchen(ScenenCounter.LAGER);
                System.out.println("du hast dein lager betreten");
            }
            if(e.getSource() == skillpunkte){
                visible(false);
                ScenenCounterClass.sceneSwitchen(ScenenCounter.SKILLPUNKTE);
                System.out.println("das sind deine skillpunkte");
            }

            if(e.getSource() == zuruckZumHauptmenu){

                visible(false);
                ScenenCounterClass.sceneSwitchen(ScenenCounter.HAUPTMENU);
            }
        }
}


