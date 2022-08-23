package logic;

// diese klasse steht für den blueprint aller Items die in dem spiel vorkommen
// die methoden , effekt und das system sind folgende

// - itemUpgrade : wie werden die items aufgebessert
// - die effekte bestimmter items definieren
// - zeigen ob sie im shop zu kaufen sind oder nicht mit der anzahl an exemplaren
// - item crafting zusammenstellung.. welche items werden benötigt um andere items zu craften


public class ItemObjekt {

    private String name, kategorie, effekt;
    private int attacke, verteidigung, lv, itemUpgrade, preis;


    // diese Art von item steht für normale items wie z.b. TRÄNKE VERSCHIEDENER ART
    public ItemObjekt(String name, String kategorie, int lv, int itemUpgrade, int preis) {
        this.name = name;
        this.kategorie = kategorie;
        this.lv = lv;
        this.itemUpgrade = itemUpgrade;
        this.preis = preis;
    }

    // diese Art von item steht für GEGENSEÄNDE DIE EINEN BESTIMMTEN EFFEKT HABEN ODER FÜR DIE GESCHICHTE RELEVANT SIND
    public ItemObjekt(String name, String kategorie, String effekt, int lv, int preis) {
        this.name = name;
        this.kategorie = kategorie;
        this.effekt = effekt;
        this.lv = lv;
        this.preis = preis;
    }

    // diese Art von item steht für ALLE WAFFEN DIE DAMAGE MACHEN
    public ItemObjekt(String name, String kategorie, int attacke, int lv, int itemUpgrade, int preis) {
        this.name = name;
        this.kategorie = kategorie;
        this.attacke = attacke;
        this.lv = lv;
        this.itemUpgrade = itemUpgrade;
        this.preis = preis;
    }

    // epische items die von allem etwas haben

    public ItemObjekt(String name, String kategorie, String effekt, int attacke, int verteidigung, int lv, int itemUpgrade, int preis) {
        this.name = name;
        this.kategorie = kategorie;
        this.effekt = effekt;
        this.attacke = attacke;
        this.verteidigung = verteidigung;
        this.lv = lv;
        this.itemUpgrade = itemUpgrade;
        this.preis = preis;
    }
}
