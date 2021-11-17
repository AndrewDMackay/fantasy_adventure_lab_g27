
package players.types;

public enum StatsType {

    WARRIOR(200, 0, 200, 0),
    WIZARD(150, 200, 100, 0),
    CLERIC(100, 150, 150, 0);

    private final int health;
    private final int magic;
    private final int stamina;
    private final int gold;

    StatsType(int health, int magic, int stamina, int gold) {
        this.health = health;
        this.magic = magic;
        this.stamina = stamina;
        this.gold = gold;
    }
}
