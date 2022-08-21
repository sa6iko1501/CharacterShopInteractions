public interface Character {
    void info();
    void items();

    String type();
    void addWeapon(Item item);

    void setGold(int gold);
    int getGold();
    void updateItems();
}
