package logic;
//--------- WAS IST HIER DRINNE ----------------
// doese klasse kümmert sich rund um die lv up logic
// hier befindet sich das Lv system --------------
// hier befindet sich das skill system -----------------
// hier befindet sich das aufwertungssystem ---------------- (aufplussen von waffen)

//---------SKILLCOUNTER ERKLÄRUNG ---------------
// skillcounter erklärung: wenn man skillt+, und sich verskillt soll man das mit dem - rückgängig machen
// spamt man allerdings auf den - putton kann man einen stats reset machen und neu skillen.. das will man nicht
// somit achtet der skillcounter, ob man überhaupt weiter zurück gehen kann

// --------- X VARIABLE -------------------
// damit die skillpunkte beliebig gesezt werden ohne einfloss wird die zahl erst gezeigt und dann nach dem
// bestätigen übernommen.. die werte werden in der variablen gespeichert und dann ausgegeben


/**
 * In der Lv Up Klasse sind die Levels definiert, die man im Spiel erreichen kann. Hier wird entschieden
 * wie viel Erfahrungspunkte man benötigt die man von Gegnern oder nach Erfolgreichen lösen von Problemen
 * erhalten kann, um auf die nächste Stufe aufzusteigen, die es ermöglicht den Helden durch verbesserte
 * Eigenschaften stärker zu machen
 */

public class LvUp {


    // variablen
    private static final int plusHp = 50;
    private static final int plusAtacke = 10;
    private static final int plusVerteidigung = 5;
    private static int skillpunkteCounterHp;
    private static int skillpunkteCounterDamage;
    private static int skillpunkteCounterRustung;


    private static int demowerthp;
    private static int demowertatacke;
    private static int demowertrustung;

    // ------------------------- DAS LV SYSTEM --------------------------------------------
    public static void lv(){
        if(Gameobjekt.held.exp < 100){ Gameobjekt.held.lv = 1; Gameobjekt.held.skillPunkte++; }
        if(Gameobjekt.held.exp >= 100 && Gameobjekt.held.exp < 250){ Gameobjekt.held.lv = 2; Gameobjekt.held.skillPunkte++;}
        if(Gameobjekt.held.exp >= 250 && Gameobjekt.held.exp < 450){ Gameobjekt.held.lv = 3; Gameobjekt.held.skillPunkte++;}
        if(Gameobjekt.held.exp>= 450 && Gameobjekt.held.exp < 700){ Gameobjekt.held.lv = 4; Gameobjekt.held.skillPunkte++;}

        if (Gameobjekt.held.exp>= 700 && Gameobjekt.held.exp < 1000){ Gameobjekt.held.lv = 5; Gameobjekt.held.skillPunkte++;}
        if (Gameobjekt.held.exp>= 1000 && Gameobjekt.held.exp < 1350){ Gameobjekt.held.lv = 6; Gameobjekt.held.skillPunkte++;}
        if (Gameobjekt.held.exp>= 1350 && Gameobjekt.held.exp < 1750){ Gameobjekt.held.lv = 7; Gameobjekt.held.skillPunkte++;}
        if (Gameobjekt.held.exp>= 1750 && Gameobjekt.held.exp < 2200){ Gameobjekt.held.lv = 8; Gameobjekt.held.skillPunkte++;}
        if (Gameobjekt.held.exp>= 2200 && Gameobjekt.held.exp < 2700){ Gameobjekt.held.lv = 9; Gameobjekt.held.skillPunkte++;}

    }




    // ----------------------------- DAS SKILL SYSTEM -----------------------------------
    // hoch skillen von hp, atacke oder verteidigung


    // HP ------------------------
    public static void skillHochHp(){
        if(Gameobjekt.held.skillPunkte>0){

            if(skillpunkteCounterHp<=0){
                demowerthp = Gameobjekt.held.maxHp + plusHp;
                Gameobjekt.held.skillPunkte--;
                skillpunkteCounterHp++;
                System.out.println(getDemowerthp());
                System.out.println(skillpunkteCounterHp);
            }
            else {
                demowerthp += plusHp;
                Gameobjekt.held.skillPunkte--;
                skillpunkteCounterHp++;
                System.out.println(getDemowerthp());
                System.out.println(skillpunkteCounterHp);
                System.out.println("ich bin behindert");
            }
        }
    }
    public static void skillRunterHp(){
        if(skillpunkteCounterHp>0){
                demowerthp -= plusHp;
                Gameobjekt.held.skillPunkte++;
                skillpunkteCounterHp--;

        }
    }

    // DAMAGE --------------------------------
    public static void skillHochAtacke(){

        if(Gameobjekt.held.skillPunkte>0) {
            if (skillpunkteCounterDamage <= 0) {
                demowertatacke = Gameobjekt.held.atacke + plusAtacke;
                Gameobjekt.held.skillPunkte--;
                skillpunkteCounterDamage++;
            } else {
                demowertatacke += plusAtacke;
                Gameobjekt.held.skillPunkte--;
                skillpunkteCounterDamage++;
                System.out.println(getDemowertatacke());
            }
        }
    }

    public static void skillRunterAtacke(){
        if(skillpunkteCounterDamage>0){
            demowertatacke -= plusAtacke;
            Gameobjekt.held.skillPunkte++;
            skillpunkteCounterDamage--;

        }
    }

    // RÜSTUNG -------------------------------
    public static void skillHochRustung(){

        if(Gameobjekt.held.skillPunkte>0) {
            if (skillpunkteCounterRustung <= 0) {
                demowertrustung = Gameobjekt.held.verteidigung + plusVerteidigung;
                Gameobjekt.held.skillPunkte--;
                skillpunkteCounterRustung++;
            } else {
                demowertrustung += plusVerteidigung;
                Gameobjekt.held.skillPunkte--;
                skillpunkteCounterRustung++;
                System.out.println(getDemowertrustung());
            }
        }
    }
    public static void skillRunterRustung(){
        if(skillpunkteCounterRustung>0){
            demowertrustung -= plusVerteidigung;
            Gameobjekt.held.skillPunkte++;
            skillpunkteCounterRustung--;
        }
    }

    public static void skillsBestetigt(){
        skillpunkteCounterHp = 0;
        skillpunkteCounterDamage = 0;
        skillpunkteCounterRustung = 0;
    }

    public static void wurdeBestetigt(){
        if(skillpunkteCounterHp>0){
            Gameobjekt.held.maxHp = demowerthp ;
            Gameobjekt.held.hp = Gameobjekt.held.maxHp;

            System.out.println(demowerthp);
            System.out.println(Gameobjekt.held.hp);
        }
        if(skillpunkteCounterDamage>0){
            Gameobjekt.held.atacke = demowertatacke;
            System.out.println(demowertatacke);
            System.out.println(Gameobjekt.held.atacke);
        }
        if(skillpunkteCounterRustung>0){
            Gameobjekt.held.verteidigung = demowertrustung;
            System.out.println(demowertrustung);
            System.out.println(Gameobjekt.held.verteidigung);
        }

    }


    public static int getDemowerthp() {
        return demowerthp;
    }

    public static int getDemowertatacke() {
        return demowertatacke;
    }

    public static int getDemowertrustung() {
        return demowertrustung;
    }
}
