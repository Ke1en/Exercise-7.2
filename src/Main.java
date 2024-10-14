public class Main {
    public static void main(String[] args) {
        Player player = new Player("Kelen",6, 3);
        Enemy orc = new Enemy("Orc", 4, 2);

        player.dealDamage(orc);
        orc.dealDamage(player);

        System.out.println("У игрока сейчас хп: " + player.getCurrentHealth());
        System.out.println("У орка сейчас хп: " + orc.getCurrentHealth());
    }
}
