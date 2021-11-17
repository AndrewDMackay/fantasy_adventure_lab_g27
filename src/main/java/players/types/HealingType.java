
package players.types;

public enum HealingType {

    CURE(25, 25),
    HEAL(50, 50),
    RESTORATION(75, 75);

    private final int healing;
    private final int magic;

    HealingType(int healing, int magic) {
        this.healing = healing;
        this.magic = magic;
    }
}
