
package players.types;

public enum WeaponsType {

    DAGGER(25, 25),
    BROADSWORD(50, 50),
    GREATSWORD(75, 75);

    private final int damage;
    private final int stamina;

    WeaponsType(int damage, int stamina) {
        this.damage = damage;
        this.stamina = stamina;
    }
}
