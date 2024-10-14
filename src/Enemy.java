import java.util.Collections;
import java.util.List;

public class Enemy extends GameCharacters {
    private List<String> lootTable;

    public Enemy(String name, double maximumHealth, double damagePoints) {
        super(name, maximumHealth, damagePoints);
        lootTable.add("Sword");
    }

    public List<String> getLootTable() {
        return lootTable;
    }

    public List<String> getLootTable(int i) {
        return Collections.singletonList(lootTable.get(i));
    }

    public void dropLoot() {
        getLootTable();
    }
}
