import java.lang.reflect.Array;
import java.util.ArrayList;

public class Shop {
    private int shopId;
    private ArrayList<Item> mageList = new ArrayList<>();
    private ArrayList<Item> warriorList = new ArrayList<>();
    private ArrayList<Item> rogueList = new ArrayList<>();

    public Shop(int shopId){
        this.shopId = shopId;
        Item mitem1 = new Item("Magic Wand",1,6,0,-2,100);
        Item mitem2 = new Item("Wizard Hat",3,8,0,-4,150);
        Item mitem3 = new Item("Scepter of Fire",2,10,0,-6,200);
        Item witem1 = new Item("Sword",6,0,2,5,100);
        Item witem2 = new Item("Shield",15,0,-2,2,200);
        Item witem3 = new Item("Axe",8,0,0,8,250);
        Item ritem1 = new Item("Pistol",0,0,4,6,250);
        Item ritem2 = new Item("Rapier",2,0,6,4,100);
        Item ritem3 = new Item("Lucky Eye Patch",0,0,15,0,200);
        this.mageList.add(mitem1);
        this.mageList.add(mitem2);
        this.mageList.add(mitem3);
        this.warriorList.add(witem1);
        this.warriorList.add(witem2);
        this.warriorList.add(witem3);
        this.rogueList.add(ritem1);
        this.rogueList.add(ritem2);
        this.rogueList.add(ritem3);
    }

    public ArrayList<Item> getMageList() {
        return mageList;
    }

    public ArrayList<Item> getWarriorList() {
        return warriorList;
    }

    public ArrayList<Item> getRogueList() {
        return rogueList;
    }

    public void printWarriorItems(){
        ArrayList<Item> warList = getWarriorList();
        for(int i=0;i<warList.size();i++){
            Item item = warList.get(i);
            System.out.printf("%d.%s = HP:%d, MANA:%d, AG:%d, POW:%d, PRICE:%d\n",i+1,item.getName(),item.getHp(),item.getMana(),item.getAgility(),item.getPower(),item.getPrice());
        }
    }
    public void printMageItems(){
        ArrayList<Item> mageList = getMageList();
        for(int i=0;i<mageList.size();i++){
            Item item = mageList.get(i);
            System.out.printf("%d.%s = HP:%d, MANA:%d, AG:%d, POW:%d, PRICE:%d\n",i+1,item.getName(),item.getHp(),item.getMana(),item.getAgility(),item.getPower(),item.getPrice());
        }
    }
    public void printRogueItems(){
        ArrayList<Item> rogueList = getRogueList();
        for(int i=0;i<rogueList.size();i++){
            Item item = rogueList.get(i);
            System.out.printf("%d.%s = HP:%d, MANA:%d, AG:%d, POW:%d, PRICE:%d\n",i+1,item.getName(),item.getHp(),item.getMana(),item.getAgility(),item.getPower(),item.getPrice());
        }
    }
}
