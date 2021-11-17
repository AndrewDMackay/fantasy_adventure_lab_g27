
package players.types;

public enum HealingType {

    CURE(25,),
    HEAL(50, 0),
    RESTORATION(75, 0);

    private final int healing;

    HealingType() {
        this.healing = healing;
    }
}
