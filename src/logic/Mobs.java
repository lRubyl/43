package logic;

// todo die drops nach dem tot einfach erstellen

// DIE MOB KLASSE STEHT FÜR DIE GEGNER DES ADVANTURES
// HIER WERDEN ALLE DROPS DER MOPS GEZEIGT SOWIE IHR LEBENSUMSTÄNDE
// - EXP
// - GOLD
// - ITMES
// - MOB AM LEBEN?


/**
 *Die Mob Klasse stellt die Gegner dar gegen die der Spieler mit seinem Held kämpfen muss. Hier ist
 *  der Bauplan für alle Eigenschaften der Mobs (Gegner) genauso wie deren fallengelassenen Gegenstände,
 *  Gold und Erfahrungspunkte. Jeder Mob wird in der Klasse Gameplay gebaut
 *
 */



public class Mobs {

    private String name, art;
    private int maxHp, hp, lv, expDrop, attacke, verteidigung, geldDrop;
    private boolean amLeben;


    public Mobs(String name, String art, int maxHp, int hp, int lv, int expDrop, int attacke, int verteidigung, int geldDrop, boolean amLeben) {
        this.name = name;
        this.art = art;
        this.maxHp = maxHp;
        this.hp = hp;
        this.lv = lv;
        this.expDrop = expDrop;
        this.attacke = attacke;
        this.verteidigung = verteidigung;
        this.geldDrop = geldDrop;
        this.amLeben = amLeben;
    }


    // VARIABELN FÜR DIE DROPS

    private final int goldWolf = 30;
    private final int goldBear = 30;

    private static final int expWolf = 30;
    private static final int expBear = 30;

    private static final ItemObjekt itemWolf = Gameobjekt.dolch;
    private static final ItemObjekt itemBear = Gameobjekt.dolch;




    // ------------------------------------ MONSTER DROP ------------------------------------

    public static void expDrop(int exp){
        Gameobjekt.held.setExp(Gameobjekt.held.getExp()+exp);
        LvUp.lv();
    }

    public static void goldDrop(int gold){
        Gameobjekt.held.geld += gold;
    }

    public static void itemDrop(ItemObjekt item){
    }


    // ------------------------------------ LEBT DER MOB NOCH? ---------------------------------

    public static void lebtMobNoch(AlleMobs name){
        if (name == AlleMobs.WOLF){
            if (Gameobjekt.wolf.getHp()<=0){
                Gameobjekt.wolf.setAmLeben(false);
                expDrop(expWolf);
            }
        }
        if (name == AlleMobs.BRAUNBEAR){
            if (Gameobjekt.braunbaer.getHp()<=0){
                Gameobjekt.braunbaer.setAmLeben(false);
                expDrop(expBear);
            }

        }

    }























    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArt() {
        return art;
    }

    public void setArt(String art) {
        this.art = art;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getLv() {
        return lv;
    }

    public void setLv(int lv) {
        this.lv = lv;
    }

    public int getExpDrop() {
        return expDrop;
    }

    public void setExpDrop(int expDrop) {
        this.expDrop = expDrop;
    }

    public int getAttacke() {
        return attacke;
    }

    public void setAttacke(int attacke) {
        this.attacke = attacke;
    }

    public int getVerteidigung() {
        return verteidigung;
    }

    public void setVerteidigung(int verteidigung) {
        this.verteidigung = verteidigung;
    }

    public int getGeldDrop() {
        return geldDrop;
    }

    public void setGeldDrop(int geldDrop) {
        this.geldDrop = geldDrop;
    }

    public boolean isAmLeben() {
        return amLeben;
    }

    public void setAmLeben(boolean amLeben) {
        this.amLeben = amLeben;
    }
}
