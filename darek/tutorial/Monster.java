package darek.tutorial;

public class Monster {
    private int health = 500;
    private int attack = 20;
    private int movement = 2;
    private int xPosition = 1;
    private int yPosition = 1;
    private boolean alive = true;

    public String name = "Big Monster";

    // getter
    public int getAttack() {
        return attack;
    }

    public int getMovement() {
        return movement;
    }

    public int getHealth() {
        return health;
    }

    // setter
    public void setHealth(int decreaseHealth) {
        this.health -= decreaseHealth;
        if (health < 0) {
            alive = false;
        }
    }

    public void setHealth(double decreaseHealth) {
        int decraseHealth = (int) decreaseHealth;

        this.health = health - decraseHealth;
        if (health < 0) {
            alive = false;
        }
    }
}
