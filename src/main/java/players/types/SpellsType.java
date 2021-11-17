
package players.types;

public enum SpellsType {

    MAGICMISSLE(25, 25),
    LIGHTNINGBOLT(50, 50),
    FIREBALL(75, 75);

    private final int damage;
    private final int magic;

    SpellsType(int damage, int magic) {
        this.damage = damage;
        this.magic = magic;
    }
}
