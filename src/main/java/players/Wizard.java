
package players;

import players.types.StatsType;

public class Wizard extends Player {

    private String name;
    private StatsType statsType;

    public Wizard(String name, StatsType statsType) {
        super(statsType.WIZARD);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public StatsType getStatsType() {
        return statsType;
    }

    public void setStatsType(StatsType statsType) {
        this.statsType = statsType;
    }
}
