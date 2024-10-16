public class Main {
    public static void main(String[] args) {
        Player player = new Player("Kelen",6, 3);
        Enemy orc = new Enemy("Orc", 4, 2);

        do {
            player.dealDamage(orc);
            System.out.println("У орка сейчас хп: " + orc.getCurrentHealth());
            if (orc.getCurrentHealth() == 0.0) {
                player.setInventory(orc.dropLoot());
                System.out.println("Игрок поднял предмет: " + player.getInventory());
                System.out.println("У игрока сейчас хп: " + player.getCurrentHealth());
                break;
            }
            orc.dealDamage(player);
            System.out.println("У игрока сейчас хп: " + player.getCurrentHealth());
        } while (player.getCurrentHealth() != 0 || orc.getCurrentHealth() != 0);
    }
}
