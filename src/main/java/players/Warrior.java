
package players;

import players.types.StatsType;

public class Warrior extends Player {

    private StatsType statsType;

    public Warrior(StatsType statsType) {
        super(statsType.WARRIOR);
    }

    public StatsType getStatsType(){
        return statsType;
    }
}
