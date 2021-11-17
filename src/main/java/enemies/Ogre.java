
package enemies;

import enemies.types.EnemyType;

public class Ogre extends Enemy {

    private EnemyType enemyType;

    public Ogre(EnemyType enemyType) {
        super(enemyType.LARGE);
    }

    public EnemyType getEnemyType(){
        return enemyType;
    }
}
