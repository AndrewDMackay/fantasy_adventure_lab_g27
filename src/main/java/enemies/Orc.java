
package enemies;

import enemies.types.EnemyType;

public class Orc extends Enemy {

    private EnemyType enemyType;

    public Orc(EnemyType enemyType) {
        super(enemyType.MEDIUM);
    }

    public EnemyType getEnemyType(){
        return enemyType;
    }
}
