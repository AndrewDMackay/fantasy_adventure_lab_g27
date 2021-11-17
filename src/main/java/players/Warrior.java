
package players;

import players.types.StatsType;

public class Warrior extends Player {

    private StatsType statsType;
    private int gold;

    public Warrior(StatsType statsType) {
        super(statsType);
    }
}
