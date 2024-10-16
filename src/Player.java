import java.util.ArrayList;

public class Player extends GameCharacters {
    private ArrayList<String> inventory = new ArrayList<>();

    public ArrayList<String> getInventory() {
        return inventory;
    }

    public void setInventory(String item) {
        this.inventory.add(item);
    }

    public Player(String name, double maximumHealth, double damagePoints) {
        super(name, maximumHealth, damagePoints);
    }
}
