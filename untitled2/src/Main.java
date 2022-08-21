import java.util.*;

public class Main {
    final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Rogue rogue = new Rogue();
        createRogue("Sebastian",100,0,4,2,350,rogue);
        Warrior warrior = new Warrior();
        createWarrior("Max",200,0,2,10,200,warrior);
        Mage mage = new Mage();
        createMage("Gandalf",75,16,0,0,300,mage);
        Shop shop = new Shop(0);
        rogue.items();
        rogue.info();
        shopping(rogue,shop);
        rogue.items();
        rogue.info();
        sc.close();
    }
    public static void shopping(Character character, Shop shop){
        String type = character.type();
        switch(type){
            case "rogue":{
                shop.printRogueItems();
                System.out.println("0.Back");
                switch(getInput()){
                    case 0:{
                        break;
                    }
                    case 1:{
                        character.addWeapon(shop.getRogueList().get(0));
                        character.setGold((character.getGold()-shop.getRogueList().get(0).getPrice()));
                        break;
                    }
                    case 2:{
                        character.addWeapon(shop.getRogueList().get(1));
                        character.setGold((character.getGold()-shop.getRogueList().get(0).getPrice()));
                        break;
                    }
                    case 3:{
                        character.addWeapon(shop.getRogueList().get(2));
                        character.setGold((character.getGold()-shop.getRogueList().get(0).getPrice()));
                        break;
                    }
                    default:{
                        System.out.println("Incorrect input");
                        break;
                    }
                }
                System.out.println("Thanks for Shopping!");
                break;
            }
            case "mage":{
                shop.printMageItems();
                System.out.println("0.Back");
                switch(getInput()){
                    case 0:{
                        break;
                    }
                    case 1:{
                        character.addWeapon(shop.getMageList().get(0));
                        character.setGold((character.getGold()-shop.getMageList().get(0).getPrice()));
                        break;
                    }
                    case 2:{
                        character.addWeapon(shop.getMageList().get(1));
                        character.setGold((character.getGold()-shop.getMageList().get(0).getPrice()));
                        break;
                    }
                    case 3:{
                        character.addWeapon(shop.getMageList().get(2));
                        character.setGold((character.getGold()-shop.getMageList().get(0).getPrice()));
                        break;
                    }
                    default:{
                        System.out.println("Incorrect input");
                        break;
                    }
                }
                System.out.println("Thanks for Shopping!");
                break;
            }
            case "warrior":{
                shop.printWarriorItems();
                System.out.println("0.Back");
                switch(getInput()){
                    case 0:{
                        break;
                    }
                    case 1:{
                        character.addWeapon(shop.getWarriorList().get(0));
                        character.setGold((character.getGold()-shop.getWarriorList().get(0).getPrice()));
                        break;
                    }
                    case 2:{
                        character.addWeapon(shop.getWarriorList().get(1));
                        character.setGold((character.getGold()-shop.getWarriorList().get(0).getPrice()));
                        break;
                    }
                    case 3:{
                        character.addWeapon(shop.getWarriorList().get(2));
                        character.setGold((character.getGold()-shop.getWarriorList().get(0).getPrice()));
                        break;
                    }
                    default:{
                        System.out.println("Incorrect input");
                        break;
                    }
                }
                System.out.println("Thanks for Shopping!");
                break;
            }
            default:{
                System.out.println("Some kind of error occurred...");
            }
        }
        character.updateItems();
    }
    public static void createRogue(String name, int hp, int mana, int agility, int power, int gold,Rogue rogue){
        rogue.setName(name);
        rogue.setHp(hp);
        rogue.setMana(mana);
        rogue.setAgility(agility);
        rogue.setPower(power);
        rogue.setGold(gold);
    }

    public static void createWarrior(String name, int hp, int mana, int agility, int power, int gold,Warrior warrior){
        warrior.setName(name);
        warrior.setHp(hp);
        warrior.setMana(mana);
        warrior.setAgility(agility);
        warrior.setPower(power);
        warrior.setGold(gold);
    }

    public static void createMage(String name, int hp, int mana, int agility, int power, int gold,Mage mage){
        mage.setName(name);
        mage.setHp(hp);
        mage.setMana(mana);
        mage.setAgility(agility);
        mage.setPower(power);
        mage.setGold(gold);
    }
    public static int getInput() throws NumberFormatException{
        String input = sc.nextLine();
        int x = Integer.parseInt(input);
        return x;
    }

}