package Plays;
import GuiTest.*;
import Scenen.AiStats;
import Scenen.Geschichte1.Chapter1;
import Scenen.Geschichte1.Chapter2;
import Scenen.Hauptmenu;
import Scenen.Prolog.Prolog1;

//DIESE KLASSE IST DAFÜR DA UM LEICHTER DIE SCENEN ZU SWITSCHEN, HÄNGT UNMITTELBAR MIT SCENENCOUNTER ZUSAMMEN

public class ScenenCounterClass {


    public void derFrame(){
        MainFrame.frame.setVisible(true);
    }


    public static void sceneSwitchen(ScenenCounter scenenCounter){


        // DER PROLOG
        if(scenenCounter== ScenenCounter.PROLOG1){ Prolog1 prolog1 = new Prolog1();}






        // DIE MENÜS
        if(scenenCounter== ScenenCounter.MENU){
            Menu menu = new Menu();}
        if(scenenCounter== ScenenCounter.LAGER){Lager lager = new Lager();}
        if(scenenCounter== ScenenCounter.SHOP){Shop shop = new Shop();}
        if(scenenCounter== ScenenCounter.SKILLPUNKTE){Skillpunkte skillpunkte = new Skillpunkte();}
        if(scenenCounter== ScenenCounter.HAUPTMENU){ Hauptmenu hauptmenu = new Hauptmenu();}


        // BATTLES
        if(scenenCounter==ScenenCounter.BATTLE){Battle battle = new Battle();}




        // DIE SCENEN
        if(scenenCounter== ScenenCounter.AI){ AiStats ai = new AiStats();}

        if(scenenCounter== ScenenCounter.CHAPTER1){ Chapter1 chapter1 = new Chapter1();}
        if(scenenCounter== ScenenCounter.CHAPTER2){ Chapter2 chapter2 = new Chapter2();}


        // DIE ABFRAGEN
        if(scenenCounter== ScenenCounter.NEUESSPIEL){ NeuesSpiel neuesSpiel = new NeuesSpiel();}



    }





}
