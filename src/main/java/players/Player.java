
package players;

import players.types.StatsType;

public abstract class Player {

    private StatsType statsType;

    public Player(StatsType statsType){
        this.statsType = statsType;
    }
}

