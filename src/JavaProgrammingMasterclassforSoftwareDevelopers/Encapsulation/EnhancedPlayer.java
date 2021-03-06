package JavaProgrammingMasterclassforSoftwareDevelopers.Encapsulation;

public class EnhancedPlayer {
    private String name;
    private int health = 100;
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        if (this.health > 0 && this.health <= 100) {
            this.health = health;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        this.health -= damage;

        if (this.health <= 0) {
            System.out.println("Player Knocked Out");
        }
    }

    public int getHealth() {
        return health;
    }
}
