
package players;

import players.types.StatsType;

public class Cleric extends Player {

    private StatsType statsType;

    public Cleric(StatsType statsType) {
        super(statsType.CLERIC);
    }

    public StatsType getStatsType(){
        return statsType;
    }
}
