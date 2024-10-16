public class GameCharacters {
    private String name;
    private double maximumHealth;
    private double currentHealth;
    private double damagePoints;

    public GameCharacters(String name, double maximumHealth, double damagePoints) {
        this.name = name;
        this.maximumHealth = maximumHealth;
        this.damagePoints = damagePoints;
        this.currentHealth = maximumHealth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMaximumHealth() {
        return maximumHealth;
    }

    public void setMaximumHealth(double maximumHealth) {
        this.maximumHealth = maximumHealth;
    }

    public double getCurrentHealth() {
        return currentHealth;
    }

    public void setCurrentHealth(double currentHealth) {
        this.currentHealth = currentHealth;
    }

    public double getDamagePoints() {
        return damagePoints;
    }

    public void setDamagePoints(double damagePoints) {
        this.damagePoints = damagePoints;
    }

    public void dealDamage(GameCharacters entity) {
        // Уменьшаем текущее здоровье цели на количество урона
        entity.setCurrentHealth(entity.getCurrentHealth() - this.damagePoints); // Нанесение урона
        // Проверка на смерть персонажа
        if (!isDead(entity)) {
            damageText(entity); // Вывод сообщения о нанесении урона
        }
    }

    private void damageText(GameCharacters entity) {
        System.out.println(this.name + " наносит " + this.getDamagePoints() + " единиц урона " + entity.name);
    }

    private boolean isDead(GameCharacters entity) {
        if(entity.currentHealth < 0.0) {
            entity.setCurrentHealth(0.0);
            System.out.println(entity.name + " умирает");
            return true;
        }
        return false;
    }
}
