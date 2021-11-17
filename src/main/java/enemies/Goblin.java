
package enemies;


import enemies.types.EnemyType;

public class Goblin extends Enemy {

    private EnemyType enemyType;

    public Goblin(EnemyType enemyType) {
        super(enemyType.SMALL);
    }

    @Override
    public EnemyType getEnemyType() {
        return enemyType;
    }

    public void setEnemyType(EnemyType enemyType) {
        this.enemyType = enemyType;
    }
}
