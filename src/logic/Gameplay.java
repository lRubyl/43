package logic;
/*
in dieser klasse wird das logic.Gameplay definiert
- alle normalen angriffe und kämpfe
- alle spezial angriffe und kritische treffer
- heiltrank nehmen

 */

/**
 *Die Klasse Gameplay ist das Herzstück der Kategorie Logik, hier wird das gesamte Gameplay
 * definiert die das Spiel bietet dies betrifft den Kampf und jegliche Schadensberechnung,
 * die der Held oder Gegner erleiden genau wie Heilungen und Widerbelebung vom Helden oder Gegner.
 *
 */

public class Gameplay {

    // heilpots werte (kp = kleiner pot...etc) erhöhen die hp um diese werte
    private static final int kp = 30;
    private static final int mp = 80;
    private static final int gp = 180;
    private static final int ep = 320;






    // --------------------------------------- HEILUNG -----------------------------------------------
    public static void heiltrankNehmen(Items items){
        // der held muss mehr als einen heiltrank haben + er darf nicht full live sein + der heiltrank ist ein kleiner/mittlerer/ großer etc
        if(Gameobjekt.held.kleinerHeiltrank > 0 && Gameobjekt.held.maxHp > Gameobjekt.held.hp && items == Items.KLEINERHEILTRANK){
            Gameobjekt.held.hp += kp;
            Gameobjekt.held.kleinerHeiltrank--;
        }
        if(Gameobjekt.held.mittlererHeiltrank > 0 && Gameobjekt.held.maxHp > Gameobjekt.held.hp && items == Items.MITTLERERHEILTRANK){
            Gameobjekt.held.hp += mp;
            Gameobjekt.held.mittlererHeiltrank--;
        }
        if(Gameobjekt.held.grosserHeiltrank > 0 && Gameobjekt.held.maxHp > Gameobjekt.held.hp && items == Items.GROSSERHEILTRANK){
            Gameobjekt.held.hp += gp;
            Gameobjekt.held.grosserHeiltrank--;
        }
        if(Gameobjekt.held.epischerHeiltrank > 0 && Gameobjekt.held.maxHp > Gameobjekt.held.hp && items == Items.EPISCHERHEILTRANK){
            Gameobjekt.held.hp += ep;
            Gameobjekt.held.epischerHeiltrank--;
        }

        if (Gameobjekt.held.hp > Gameobjekt.held.maxHp){
            Gameobjekt.held.hp = Gameobjekt.held.maxHp;
        }
    }

    public static void lvUpHeilung(){

    }





    // ----------------------------------- BESONDERE ATACKEN UND EFFEKTE -------------------------------------
    public static void kritischerTreffer(){
        Gameobjekt.held.setAttacke(Gameobjekt.held.getAttacke()+20);
    }






    public void mobWiderbeleben(String name){
        if (name.equals(Gameobjekt.wolf.getName())){
            Gameobjekt.wolf.setAmLeben(true);
        }
    }







    // ---------------------------------------- DAS KAMPFSYSTEM -----------------------------------------

    // DER HELD GREIFT AN
    public static void normalAngriffHeld(AlleMobs gegner){
        if (AlleMobs.WOLF == gegner){
            Gameobjekt.wolf.setHp(Gameobjekt.wolf.getHp() - (Gameobjekt.held.atacke - Gameobjekt.wolf.getVerteidigung())/2);
//
//            System.out.println(Gameobjekt.wolf.getHp());
//            System.out.println(Gameobjekt.held.atacke);
//            System.out.println(Gameobjekt.wolf.getVerteidigung());
        }
        if (AlleMobs.BRAUNBEAR == gegner){
            Gameobjekt.wolf.setHp(Gameobjekt.wolf.getHp() - (Gameobjekt.held.atacke - Gameobjekt.braunbaer.getVerteidigung())/2);
        }
    }

    // DER GEGNER GREIFT AN
    public static void normalAngriffGegner(AlleMobs gegner){
        if (AlleMobs.WOLF == gegner){
            Gameobjekt.held.hp -= (Gameobjekt.wolf.getAttacke()- Gameobjekt.held.verteidigung)/2;
            System.out.println("wolf attacke"+Gameobjekt.wolf.getAttacke());
            System.out.println("held rüstung"+Gameobjekt.held.verteidigung);
        }
        if (AlleMobs.BRAUNBEAR == gegner){
            Gameobjekt.held.hp -= (Gameobjekt.braunbaer.getAttacke()- Gameobjekt.held.verteidigung)/2;
        }
    }

    public static void regeneration(AlleMobs gegner){
        if (AlleMobs.WOLF == gegner){
            Gameobjekt.held.hp +=
            Gameobjekt.held.hp -= (Gameobjekt.wolf.getAttacke()- Gameobjekt.held.verteidigung)/2;

        }
    }




}
