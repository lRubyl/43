package logic;
// in dieser klasse befinden sich alle static objekte

/**
 * In der Klasse Gameobjekt werden alle Objekte gebaut, die einem im Textadvanture Begegnen darunter enthalten ist,
 * der Held, die Gegner, alle Items und Rohstoffe, die man zu Items Craften kann
 */


public class Gameobjekt {

    // Mein Charakter logic.Held
    public static Held held = new Held(100,100,1,0,10,3,3, 0,
            0, 0,0,0,false,false,true, Umgebung.PROLOG);

    // NORMALE GEGNER
    public static Mobs wolf = new Mobs("Wolf","Tier",80,80,2,40,10,2,20,true);
    public static Mobs braunbaer = new Mobs("Braunbär","Tier",140,140,4,120,17,5,80,true);



    // SPIRITS




    // BOSSE



    // ITEMS

    public static ItemObjekt Butterfly = new ItemObjekt("Butterfly", "Waffe",5,1,1,10);
    public static ItemObjekt dolch = new ItemObjekt("Dolch", "Waffe",8,1,1,10);
//    public static ItemObjekt dolch = new ItemObjekt("Dolch", "Waffe",1,1,10);



}
