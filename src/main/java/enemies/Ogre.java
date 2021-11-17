
package enemies;

import enemies.types.EnemyType;

public class Ogre extends Enemy {

    private EnemyType enemyType;

    public Ogre(EnemyType enemyType) {
        super(enemyType.LARGE);
    }

    @Override
    public EnemyType getEnemyType() {
        return enemyType;
    }

    public void setEnemyType(EnemyType enemyType) {
        this.enemyType = enemyType;
    }
}
