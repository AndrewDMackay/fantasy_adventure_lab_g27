
package enemies;

import enemies.types.EnemyType;
import players.types.StatsType;

public abstract class Enemy {

    private EnemyType enemyType;

    public Enemy(EnemyType enemyType){
        this.enemyType = enemyType;
    }

    public EnemyType getEnemyType() {
        return enemyType;
    }

    public void setEnemyType(EnemyType enemyType) {
        this.enemyType = enemyType;
    }
}
