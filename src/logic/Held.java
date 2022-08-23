package logic;

/* DER HELD BRAUCHT SYSTEM

- SKILLPUNKTE
- LV
- GELD DROP (ERHALTEN VON GELD)
- EXP DRAP (ERHALTEN VON EXP)
-
 */

/**
 * Der Held steht für den gespielten Spieler. Hier sind die Eigenschaften des Spielers definiert der dann in Gameobjekt als einen Spielbaren Helden initialisiert wird.
 *
 */



public class Held {

    public int maxHp,hp,lv,exp,atacke,verteidigung,skillPunkte,kleinerHeiltrank,mittlererHeiltrank,grosserHeiltrank,epischerHeiltrank,geld;
    public boolean waffeEqupt,rustungEqupt,amLeben;
    public Umgebung umgebung;

    public static int selfcare = 5;

    public Held(int maxHp, int hp, int lv, int exp, int atacke, int verteidigung,
                int skillPunkte, int kleinerHeiltrank, int mittlererHeiltrank,
                int grosserHeiltrank, int epischerHeiltrank, int geld, boolean waffeEqupt,
                boolean rustungEqupt, boolean amLeben, Umgebung umgebung) {
        this.maxHp = maxHp;
        this.hp = hp;
        this.lv = lv;
        this.exp = exp;
        this.atacke = atacke;
        this.verteidigung = verteidigung;
        this.skillPunkte = skillPunkte;
        this.kleinerHeiltrank = kleinerHeiltrank;
        this.mittlererHeiltrank = mittlererHeiltrank;
        this.grosserHeiltrank = grosserHeiltrank;
        this.epischerHeiltrank = epischerHeiltrank;
        this.geld = geld;
        this.waffeEqupt = waffeEqupt;
        this.rustungEqupt = rustungEqupt;
        this.amLeben = amLeben;
        this.umgebung = umgebung;
    }

    // HELD STERBEN LASSEN ODER WIEDR BELEBEN
    public void heldStirbt(){
        amLeben = false;
    }
    public void heldWiderbeleben(){
        amLeben = true;
    }



    // HELD SPEZIELLE ATTACKEN

    // der held heilt sich selbst , wenn er sich mehr halt als seine max hp wird er einfach auf max hp gesetzt
    public static void regeneration(){
        if (Gameobjekt.held.maxHp > Gameobjekt.held.hp){
            Gameobjekt.held.hp += selfcare;
            if (Gameobjekt.held.hp >= Gameobjekt.held.maxHp){
                Gameobjekt.held.hp = Gameobjekt.held.maxHp;
            }
        }


    }











// --------------- unnötig aber man weiß ja nie ----------------------------



    public int getGeld() {
        return geld;
    }

    public void setGeld(int geld) {
        this.geld = geld;
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

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    public int getAttacke() {
        return atacke;
    }

    public void setAttacke(int attacke) {
        this.atacke = attacke;
    }

    public int getVerteidigung() {
        return verteidigung;
    }

    public void setVerteidigung(int verteidigung) {
        this.verteidigung = verteidigung;
    }

    public boolean isWaffeEqupt() {
        return waffeEqupt;
    }

    public void setWaffeEqupt(boolean waffeEqupt) {
        this.waffeEqupt = waffeEqupt;
    }

    public boolean isRustungEqupt() {
        return rustungEqupt;
    }

    public void setRustungEqupt(boolean rustungEqupt) {
        this.rustungEqupt = rustungEqupt;
    }

    public boolean isAmLeben() {
        return amLeben;
    }

    public void setAmLeben(boolean amLeben) {
        this.amLeben = amLeben;
    }

    public int getSkillPunkte() {
        return skillPunkte;
    }

    public void setSkillPunkte(int skillPunkte) {
        this.skillPunkte = skillPunkte;
    }

}
