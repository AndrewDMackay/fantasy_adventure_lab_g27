
package enemies.types;

public enum EnemyType {

    SMALL(100, 100, 100),
    MEDIUM(150, 150, 150),
    LARGE(200, 200, 200);

    private final int health;
    private final int stamina;
    private final int gold;

    EnemyType(int health, int stamina, int gold) {
        this.health = health;
        this.stamina = stamina;
        this.gold = gold;
    }
}
