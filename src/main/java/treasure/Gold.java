
package treasure;

public class Gold extends Treasure {

    private String name;

    public Gold(int value, String name) {
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
