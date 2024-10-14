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

    public void dealDamage(GameCharacters firstEntity, GameCharacters secondEntity) {
        double currentHealthPoints = firstEntity.getCurrentHealth() - secondEntity.getDamagePoints();
        boolean isDead;
        isDead = isDead(firstEntity);
        if(isDead)

            return;
        firstEntity.setCurrentHealth(currentHealthPoints);
        damageText(firstEntity, secondEntity);

        currentHealthPoints = secondEntity.getCurrentHealth() - firstEntity.getDamagePoints();
        isDead = isDead(firstEntity);
        if(isDead)
            return;
        secondEntity.setCurrentHealth(currentHealthPoints);
        damageText(secondEntity, firstEntity);
    }

    private void damageText(GameCharacters firstEntity, GameCharacters secondEntity) {
        System.out.println(firstEntity.name + " наносит " + firstEntity.getDamagePoints() + " единиц урона " + secondEntity.name);
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
