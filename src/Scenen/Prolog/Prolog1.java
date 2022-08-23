package Scenen.Prolog;

import GuiTest.GameOver;
import GuiTest.MainFrame;
import Plays.ScenenCounter;
import Plays.ScenenCounterClass;
import Scenen.AiStats;
import Scenen.Geschichte1.Chapter1;
import Scenen.Geschichte1.Chapter2;
import Scenen.Texte;
import logic.AlleMobs;
import logic.AlleSchlussel;
import logic.Speichern;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Prolog1 implements ActionListener {


    JTextPane prologText1 = new JTextPane();
    JLabel titel = new JLabel();


    JButton weiter = new JButton();
    JButton weiterSpielen = new JButton();
    JButton e1 = new JButton();
    JButton e2 = new JButton();
    JButton e3 = new JButton();
    JButton menu = new JButton();



    public Prolog1() {
        addFrame();
        visible(true);
        titel.setVisible(true);
        e3.setVisible(false);
        visibleSwitch(false);
        scene();

    }

    public void prologUpdate(String text){
        prologText1.setText(text);
    }

    public void baueScene(JTextPane prolog, String text){
        prolog.setText(text);
        prolog.setBackground(null);
        prolog.setForeground(Color.BLACK);
        prolog.setFont(Texte.font2);
        prolog.setEditable(false);
    }
    public void baueButton(JButton button, String text){
        button.setText(text);
        button.setBackground(Color.BLACK);
        button.setForeground(Color.WHITE);
        button.setFont(Texte.font);
        button.addActionListener(this);
        button.setFocusable(false);
    }

    public void scene(){


        titel.setBounds(200,50,1500,200);
        weiter.setBounds(700, 850, 300, 100);
        weiterSpielen.setBounds(450, 800, 300, 100);
        e1.setBounds(450, 850, 300, 100);
        e2.setBounds(850, 850, 300, 100);
        e3.setBounds(1250, 850, 300, 100);
       // menu.setBounds(1400, 850, 400, 100);
        prologText1.setBounds(250, 250, 1350, 550);


        baueScene(prologText1,Texte.prolog1);


        baueButton(weiter,"Weiter");
        baueButton(weiterSpielen,"Weiter Spielen");
       // baueButton(menu,"Zum Menü");

        baueButton(e1,"entscheidung 1");
        baueButton(e2,"entscheidung 2");
        baueButton(e3,"entscheidung 3");

        titel.setText("  PROLOG:  Das Buch");
        titel.setFont(Texte.titel);

    }

    public void visible(boolean visible){
        weiter.setVisible(visible);
        prologText1.setVisible(visible);
      //  menu.setVisible(visible);
    }

    public void visibleSwitch(boolean visible){
        e1.setVisible(visible);
        e2.setVisible(visible);
        weiter.setVisible(!visible);
       // menu.setVisible(!visible);
    }

    public void addFrame(){
        MainFrame.frame.add(weiter);
        MainFrame.frame.add(prologText1);
        MainFrame.frame.add(menu);
        MainFrame.frame.add(e1);
        MainFrame.frame.add(e2);
        MainFrame.frame.add(e3);
        MainFrame.frame.add(titel);
    }

    public void performance(String prolog, int x){
            AiStats.ai();
            prologUpdate(prolog);
            Texte.weiterCounterProlog = x;
    }

    @Override
    public void actionPerformed(ActionEvent e) {


        // ------------------------ANFANGSSZENE----------------------------------
        // ANFANGSCENE
        if (e.getSource()==weiter && Texte.weiterCounterProlog==0){
            performance(Texte.prolog1,1);
            System.out.println(Texte.weiterCounterProlog);
        }
        // ANFANGSCENE2
        if (e.getSource()==weiter && Texte.weiterCounterProlog==1){
            performance(Texte.prolog2,2);
            System.out.println(Texte.weiterCounterProlog);
        }
        // ERSTE ENTSCHEIDUNG IN DER HAUPTHALLE
        else if (e.getSource()==weiter && Texte.weiterCounterProlog==2){
            performance(Texte.prolog3,3);
            visibleSwitch(true);
            System.out.println(Texte.weiterCounterProlog);
        }


        // ENTSCHEIDUNG 1 ZUR KERUB AUSSTELLUNG
        else if (e.getSource()==e1 && Texte.weiterCounterProlog==3){
            performance(Texte.prolog4,4);
            visibleSwitch(false);
            System.out.println(Texte.weiterCounterProlog);
        }
        // ENTSCHEIDUNG 2 ZUM BRUNNEN
        else if (e.getSource()==e2 && Texte.weiterCounterProlog==3){
            performance(Texte.prolog5,5);
            System.out.println(Texte.weiterCounterProlog);
        }


        // ---------------------- DER BRUNNEN ------------------------------
        // ZUM BRUNNEN
        else if (e.getSource()==weiter && Texte.weiterCounterProlog==4){
            performance(Texte.prolog5,5);
            visibleSwitch(true);
            System.out.println(Texte.weiterCounterProlog);
        }
        // ENTSCHEIDUNG 1 WASSER TRINKEN
        else if (e.getSource()==e1 && Texte.weiterCounterProlog==5){
            performance(Texte.prolog6,6);
            visibleSwitch(false);
            System.out.println(Texte.weiterCounterProlog);
        }
        // ENTSCHEIDUNG 2 AUF SARIA WARTEN, ER KOMMT HASTIG
        else if (e.getSource()==e2 && Texte.weiterCounterProlog==5){
            performance(Texte.prolog7,7);
            visibleSwitch(false);
            System.out.println(Texte.weiterCounterProlog);
        }
        // ENDE: GEBEUDE STÜRTZT GAME OVER
        else if (e.getSource()==weiter && Texte.weiterCounterProlog==6){
            GameOver gameOver = new GameOver();
            visible(false);
            System.out.println(Texte.weiterCounterProlog);
        }


        // ----------------- SARIA KOMMT VERSCHWITZ ANGELAUFEN -----------------------------
        // ES IST HEAVENS DREAM
        else if (e.getSource()==weiter && Texte.weiterCounterProlog==6){
            performance(Texte.prolog7,7);
            System.out.println(Texte.weiterCounterProlog);
        }

        // SARIA ERZÄHLT MIR VOM TICKET
        else if (e.getSource()==weiter && Texte.weiterCounterProlog==7){
            performance(Texte.prolog8,8);
            System.out.println(Texte.weiterCounterProlog);
        }

        // SARIA WILL MIR DIE ANTWORTEN SAGEN
        else if (e.getSource()==weiter && Texte.weiterCounterProlog==8){
            performance(Texte.prolog9,9);
            System.out.println(Texte.weiterCounterProlog);
        }


        // ----------------- DIE HAUPTHALLE HOLE DIR EIN TICKET ---------------------------
        // ICH GEHE ZUR HAUPTHALLE
        else if (e.getSource()==weiter && Texte.weiterCounterProlog==9){
            performance(Texte.prolog10,10);
            visibleSwitch(true);
            System.out.println(Texte.weiterCounterProlog);
        }

        // VON HAUPTHALLE --> ZUR KERUBIN AUSSTELLUNG
        else if (e.getSource()==e1 && Texte.weiterCounterProlog==10){
            performance(Texte.prolog11,11);
            System.out.println(Texte.weiterCounterProlog);
        }
        // VON HAUPTHALLE --> ZUR THEKE

        else if (e.getSource()==e2 && AlleSchlussel.prologPrufungBestanden && Texte.weiterCounterProlog==10){
            performance(Texte.prolog201,201);
            visibleSwitch(false);
            System.out.println(Texte.weiterCounterProlog);
        }
        else if (e.getSource()==weiter && AlleSchlussel.prologPrufungBestanden && Texte.weiterCounterProlog==201){
            performance(Texte.prolog10,10);
            visibleSwitch(true);
            System.out.println(Texte.weiterCounterProlog);
        }



        else if (e.getSource()==e2 && Texte.weiterCounterProlog==10){
            performance(Texte.prolog12,12);
            System.out.println(Texte.weiterCounterProlog);
        }

        // VON DER THEKE --> ZUR PRÜFUNG
        else if (e.getSource()==e1 && Texte.weiterCounterProlog==12){
            performance(Texte.prolog14,14);
            visibleSwitch(false);
            System.out.println(Texte.weiterCounterProlog);
        }
        // VON DER THEKE --> ZUR HAUPTHALLE
        else if (e.getSource()==e2 && Texte.weiterCounterProlog==12){
            performance(Texte.prolog10,10);
            System.out.println(Texte.weiterCounterProlog);
        }






        //-------------------------------- DIE PRÜFUNG --------------------------------------
        else if (e.getSource()==weiter && Texte.weiterCounterProlog==14){
            performance(Texte.prolog17,17);
            e3.setVisible(true);
            visibleSwitch(true);
            System.out.println(Texte.weiterCounterProlog);
        }

        // PRÜFUNG NICHT BESTANDEN
        else if (e.getSource()==weiter && Texte.weiterCounterProlog==15){
            performance(Texte.prolog16,16);
            System.out.println(Texte.weiterCounterProlog);
        }
        else if (e.getSource()==weiter && Texte.weiterCounterProlog==16){
            GameOver gameOver = new GameOver();
            visible(false);
            System.out.println(Texte.weiterCounterProlog);
        }

        //ERSTE FRAGE
        else if (e.getSource()==e1 && Texte.weiterCounterProlog==17){
            performance(Texte.prolog15,15);
            e3.setVisible(false);
            visibleSwitch(false);
            System.out.println(Texte.weiterCounterProlog);
        }
        else if (e.getSource()==e2 && Texte.weiterCounterProlog==17){
            performance(Texte.prolog15,15);
            e3.setVisible(false);
            visibleSwitch(false);
            System.out.println(Texte.weiterCounterProlog);
        }
        else if (e.getSource()==e3 && Texte.weiterCounterProlog==17){
            performance(Texte.prolog18,18);
            System.out.println(Texte.weiterCounterProlog);
        }

        // ZWEITE FRAGE
        else if (e.getSource()==e1 && Texte.weiterCounterProlog==18){
            performance(Texte.prolog15,15);
            e3.setVisible(false);
            visibleSwitch(false);
            System.out.println(Texte.weiterCounterProlog);
        }
        else if (e.getSource()==e2 && Texte.weiterCounterProlog==18){
            performance(Texte.prolog19,19);
            System.out.println(Texte.weiterCounterProlog);
        }
        else if (e.getSource()==e3 && Texte.weiterCounterProlog==18){
            performance(Texte.prolog15,15);
            e3.setVisible(false);
            visibleSwitch(false);
            System.out.println(Texte.weiterCounterProlog);
        }

        // DRITTE FRAGE
        else if (e.getSource()==e1 && Texte.weiterCounterProlog==19){
            performance(Texte.prolog20,20);
            visibleSwitch(false);
            e3.setVisible(false);
            System.out.println(Texte.weiterCounterProlog);
        }
        else if (e.getSource()==e2 && Texte.weiterCounterProlog==19){
            performance(Texte.prolog15,15);
            e3.setVisible(false);
            visibleSwitch(false);
            System.out.println(Texte.weiterCounterProlog);
        }
        else if (e.getSource()==e3 && Texte.weiterCounterProlog==19){
            performance(Texte.prolog15,15);
            e3.setVisible(false);
            visibleSwitch(false);
            System.out.println(Texte.weiterCounterProlog);
        }

        // PRÜFUNG BESTANDEN
        else if (e.getSource()==weiter && Texte.weiterCounterProlog==20) {
            performance(Texte.prolog10, 10);
            visibleSwitch(true);
            AlleSchlussel.prologPrufungBestanden = true;
            System.out.println(Texte.weiterCounterProlog);
        }



        //------------------ HAUPTHALLE ZUM TÜRSTEHER ------------------------------------

        // VON KERUBIN AUSSTELLUNG --> EINLASS GENEMIGT
        else if (e.getSource()==e1 && AlleSchlussel.prologPrufungBestanden && Texte.weiterCounterProlog==11){
            performance(Texte.prolog21,21);
            visibleSwitch(false);
            System.out.println(Texte.weiterCounterProlog);
        }
        // VON KERUBIN AUSSTELLUNG --> EINLASS NICHT GENEMIGT
        else if (e.getSource()==e1 && !AlleSchlussel.prologPrufungBestanden && Texte.weiterCounterProlog==11){
            performance(Texte.prolog13,13);
            visibleSwitch(false);
            System.out.println(Texte.weiterCounterProlog);
        }
        // VOM TÜRSTEHER --> ZURÜCK ZUR HAUPTHALLE
        else if (e.getSource()==e2 && Texte.weiterCounterProlog==11){
            performance(Texte.prolog10,10);
            visibleSwitch(true);
            System.out.println(Texte.weiterCounterProlog);
        }
        // VOM TÜRSTEHER --> ZURÜCK ZUR HAUPTHALLE
        else if (e.getSource()==weiter && Texte.weiterCounterProlog==13){
            performance(Texte.prolog10,10);
            visibleSwitch(true);
            System.out.println(Texte.weiterCounterProlog);
        }


        //--------------- IN DER TROHNRITTER AUSSTELLUNG ----------------------------
        else if (e.getSource()==weiter && Texte.weiterCounterProlog==21){
            performance(Texte.prolog22,22);
            System.out.println(Texte.weiterCounterProlog);
        }
        else if (e.getSource()==weiter && Texte.weiterCounterProlog==22){
            performance(Texte.prolog23,23);
            System.out.println(Texte.weiterCounterProlog);
        }
        else if (e.getSource()==weiter && Texte.weiterCounterProlog==23){
            performance(Texte.prolog24,24);
            System.out.println(Texte.weiterCounterProlog);
        }
        else if (e.getSource()==weiter && Texte.weiterCounterProlog==24){
            performance(Texte.prolog25,25);
            System.out.println(Texte.weiterCounterProlog);
        }
        else if (e.getSource()==weiter && Texte.weiterCounterProlog==25){
            Chapter2 chapter2 = new Chapter2();
            chapter2.scene();
            titel.setVisible(false);
            Speichern.speichern = 1;
            visible(false);
            titel.setVisible(false);
            System.out.println(Texte.weiterCounterProlog);
        }


        if (e.getSource()==menu){
            visible(false);
            titel.setVisible(false);
            AiStats.aiVisible(false);
            AiStats.ai();
            ScenenCounterClass.sceneSwitchen(ScenenCounter.MENU);
        }


    }
}
