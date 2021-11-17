
package players;

import players.types.StatsType;

public class Wizard extends Player {

    private StatsType statsType;

    public Wizard(StatsType statsType) {
        super(statsType.WIZARD);
    }

    public StatsType getStatsType(){
        return statsType;
    }
}
