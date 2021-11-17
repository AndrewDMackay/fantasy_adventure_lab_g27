
package rooms;

import enemies.Enemy;
import java.util.ArrayList;

public class EnemyRoom extends Room {

    private String name;
    private ArrayList<Enemy> enemies;


    public EnemyRoom(String name){
        super(name);
        this.enemies = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Enemy> getEnemies() {
        return enemies;
    }

    public void setEnemies(ArrayList<Enemy> enemies) {
        this.enemies = enemies;
    }
}
