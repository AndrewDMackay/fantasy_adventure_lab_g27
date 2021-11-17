
package enemies;


import enemies.types.EnemyType;

public class Goblin extends Enemy {

    private EnemyType enemyType;

    public Goblin(EnemyType enemyType) {
        super(enemyType.SMALL);
    }

    public EnemyType getEnemyType(){
        return enemyType;
    }
}
