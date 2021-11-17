
import org.junit.Before;
import org.junit.Test;

import players.Warrior;
import players.types.StatsType;

import static org.junit.Assert.assertEquals;

public class WarriorTest {

    Warrior warrior;

    @Before
    public void setUp(){
        warrior = new Warrior("Warrior", StatsType.WARRIOR);
    }

    @Test
    public void hasName() {
        assertEquals("Warrior", warrior.getName());
    }
}
