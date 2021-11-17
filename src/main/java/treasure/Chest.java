
package treasure;

public class Chest extends Treasure {

    private String name;

    public Chest(int value, String name) {
        super(value);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
