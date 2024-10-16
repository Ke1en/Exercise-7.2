import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Enemy extends GameCharacters {
    private List<String> lootTable = Arrays.asList("Shield", "Sword");

    public Enemy(String name, double maximumHealth, double damagePoints) {
        super(name, maximumHealth, damagePoints);
    }

    public List<String> getLootTable() {
        return lootTable;
    }

    public List<String> getLootTable(int i) {
        return Collections.singletonList(lootTable.get(i));
    }

    public String dropLoot() {
        Random random = new Random();
        int getItem = random.nextInt(lootTable.size());
        return String.valueOf(getLootTable(getItem));
    }
}
