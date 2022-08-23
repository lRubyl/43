package logic;

// das ist der verkäufer der für den kauf der normalen gegenstände zuständig ist
// die klasse hat für jeden trank oder gegenstand eine methode zum kaufen
// diese klasse ist mit der Klasse SHOP VERBUNDEN


/**
 * Der Verkäufer bietet dem Spieler die Möglichkeit an verschiedene
 * Gegenstände mit dem gefundenen oder verdienten Gold zu kaufen.
 * Um diese Gegenstände für Aufgaben benutzen zu können oder sie im Kampf zu verwenden.
 */


public class Verkaufer {

    // preise
    public static final int kleinerHeiltrankPreis = 10;
    public static final int mittlererHeiltrankPreis = 80;
    public static final int grosserHeiltrankPreis = 280;
    public static final int epischerHeiltrankPreis = 1000;
    public static final int kraftingSteinPreis = 1000;
    public static final int kraftingBrockenPreis = 7000;
    public static final int reperaturkidPreis = 10000;

    public static void kleinerHeiltrankKaufen() {
        if (Gameobjekt.held.geld >= kleinerHeiltrankPreis) {
            Gameobjekt.held.geld -= kleinerHeiltrankPreis;
            Gameobjekt.held.kleinerHeiltrank++;
        }
    }
    public static void mittlererHeiltrankKaufen() {
        if (Gameobjekt.held.geld >= mittlererHeiltrankPreis) {
            Gameobjekt.held.geld -= mittlererHeiltrankPreis;
            Gameobjekt.held.mittlererHeiltrank++;
        }
    }
    public static void grosserHeiltrankKaufen() {
        if (Gameobjekt.held.geld >= grosserHeiltrankPreis) {
            Gameobjekt.held.geld -= grosserHeiltrankPreis;
            Gameobjekt.held.grosserHeiltrank++;
        }
    }
    public static void epischerHeiltrankKaufen() {
        if (Gameobjekt.held.geld >= epischerHeiltrankPreis) {
            Gameobjekt.held.geld -= epischerHeiltrankPreis;
            Gameobjekt.held.epischerHeiltrank++;
        }
    }
    public static void kraftingSteinKaufen() {
        if (Gameobjekt.held.geld >= kraftingSteinPreis) {
            Gameobjekt.held.geld -= kraftingSteinPreis;
            Gameobjekt.held.kleinerHeiltrank++;
        }
    }
    public static void kraftingBrockenKaufen() {
        if (Gameobjekt.held.geld >= kraftingBrockenPreis) {
            Gameobjekt.held.geld -= kraftingBrockenPreis;
            Gameobjekt.held.kleinerHeiltrank++;
        }
    }
    public static void reperaturkidKaufen() {
        if (Gameobjekt.held.geld >= reperaturkidPreis) {
            Gameobjekt.held.geld -= reperaturkidPreis;
            Gameobjekt.held.kleinerHeiltrank++;
        }
    }


    // FÜR ANDERE KLASSEN BRAUCHT MAN DIE GETTER METHODEN





}