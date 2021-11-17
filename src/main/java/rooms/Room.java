
package rooms;

import enemies.Enemy;
import treasure.Treasure;

import java.util.ArrayList;

public abstract class Room {

    private ArrayList<Enemy> enemies;
    private ArrayList<Treasure> treasures;

    public Room(){
        this.enemies = new ArrayList<>();
        this.treasures = new ArrayList<>();
    }

    public int getEnemyCount() {
        return this.enemies.size();
    }

    public int getTreasureCount() {
        return this.treasures.size();
    }
}
