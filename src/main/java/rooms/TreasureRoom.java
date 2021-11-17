
package rooms;

import treasure.Treasure;
import java.util.ArrayList;


public class TreasureRoom extends Room {

    private String name;
    private ArrayList<Treasure> treasures;


    public TreasureRoom(String name){
        super(name);
        this.treasures = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Treasure> getTreasures() {
        return treasures;
    }

    public void setTreasures(ArrayList<Treasure> treasures) {
        this.treasures = treasures;
    }
}
