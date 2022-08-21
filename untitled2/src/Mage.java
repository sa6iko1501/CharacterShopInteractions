import java.util.ArrayList;

public class Mage implements Character{
    private String name;
    private int hp;
    private int mana;
    private int agility;
    private int power;
    private int gold;
    private String type = "mage";
    private ArrayList<Item> itemList = new ArrayList<>();

    public void Mage(String name, int hp, int mana, int agility, int power, int gold){
        if(name!=null) {
            this.name = name;
        }
        if(hp>0) {
            this.hp = hp;
        }
        if(mana>=0){
            this.mana = mana;
        }
        this.agility = agility;
        this.power = power;
        if(gold>=0){
            this.gold = gold;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        if(hp>0) {
            this.hp = hp;
        }
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        if(mana>=0) {
            this.mana = mana;
        }
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        if(gold>=0) {
            this.gold = gold;
        }
    }
    @Override
    public void info(){
        System.out.printf("Hi my name is %s, I am a Mage and my stats are- HP:%d, MANA:%d, AG:%d, POW:%d\n",this.name,this.hp,this.mana,this.agility,this.power);
    }
    @Override
    public void items(){
        System.out.println("Items:");
        ArrayList<Item> list = new ArrayList<>(getItemList());
        if(list.size()==0){
            System.out.println("No items!");
        }
        else{
            for(int i=0;i<list.size();i++){
                Item item = list.get(i);
                System.out.printf("%s = HP:%d, MANA:%d, AG:%d, POW:%d\n",item.getName(),item.getHp(),item.getMana(),item.getAgility(),item.getPower());
            }
        }
        System.out.println("GOLD: "+getGold());

    }
    public ArrayList<Item> getItemList(){
        return this.itemList;
    }
    @Override
    public void addWeapon(Item item){
        this.itemList.add(item);
    }
    @Override
    public String type(){
        return this.type;
    }
    @Override
    public void updateItems(){
        ArrayList<Item> itemList = getItemList();
        if(itemList.size()!=0){
            for(int i=0;i<itemList.size();i++){
                Item item = itemList.get(i);
                setHp(getHp()+item.getHp());
                setMana(getMana()+item.getMana());
                setPower(getPower()+item.getPower());
                setAgility(getAgility()+item.getAgility());
            }
        }
    }
}
