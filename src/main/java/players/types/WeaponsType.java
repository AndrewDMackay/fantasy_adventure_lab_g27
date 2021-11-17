
package players.types;

public enum WeaponsType {

    DAGGER(25, 25),
    MACE(50,50),
    BROADSWORD(75, 75),
    GREATSWORD(100, 100);

    private final int damage;
    private final int stamina;

    WeaponsType(int damage, int stamina) {
        this.damage = damage;
        this.stamina = stamina;
    }
}
