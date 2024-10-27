package Week4;

public abstract class Pokemon {
    //private instance variables
    private int health;
    private String name;
    // constructor
    Pokemon (int health, String name) {
        this.health = health;
        this.name = name;
    }
    // subtract health when taken damage
    public void takeDamage(int damage) {
        health -= damage;
    }
    // attack method
    abstract void attack(Pokemon obj);
    // check if pokemon collapsed
    public boolean getIsFainted() {
        if (health <= 0) {
            return true;
        }
        else {
            return false;
        }
    }
    public String getName() {
        return name;
    }
}
