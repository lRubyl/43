package logic;

// diese klasse steht für das inventar des helden

/**
 * hier ist das Inventar des heldens , mit dem beliebiegen beutel den er zur verfügung hat
 */

public class Inventar {


    public Items[] kleinerBeutel = new Items[10];
    public Items[] grosserBeutel = new Items[20];
    public Items[] epischerBeutel = new Items[50];

    public void itemAddInventar0(Items item, int postion){
        kleinerBeutel[postion] = item;
    }
    public void itemAddInventar1(Items item, int postion){
        grosserBeutel[postion] = item;
    }
    public void itemAddInventar2(Items item, int postion){epischerBeutel[postion] = item;}

}
