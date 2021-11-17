
package enemies;

import enemies.types.EnemyType;

public class Orc extends Enemy {

    private EnemyType enemyType;

    public Orc(EnemyType enemyType) {
        super(enemyType.MEDIUM);
    }

    @Override
    public EnemyType getEnemyType() {
        return enemyType;
    }

    public void setEnemyType(EnemyType enemyType) {
        this.enemyType = enemyType;
    }
}
