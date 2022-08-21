public class Item {
    private String name;
    private int hp;
    private int mana;
    private int agility;
    private int power;
    private int price;

    public Item(String name, int hp, int mana, int agility, int power, int price){
        if(name!=null){
            this.name = name;
        }
        this.hp = hp;
        this.mana = mana;
        this.agility = agility;
        this.power = power;
        this.price = price;

    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getMana() {
        return mana;
    }

    public int getAgility() {
        return agility;
    }

    public int getPower() {
        return power;
    }

    public int getPrice() {
        return price;
    }
}
