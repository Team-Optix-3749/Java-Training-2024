package pokemon;

abstract public class Pokemon {
    private int health;
    private String name;
    public int attack;
    // Sets a default value for all Pokemon of 50
    public Pokemon(int health, String name, int attack) {
        this.health = health;
        this.name = name;
        this.attack = attack;
    }
    // Abstract method to reprogram for attack
    abstract void attack(Pokemon target);
    // Takes a number it deals that much damage to the Pokemon
    public void damageTaken(int dmg) {
        this.health = this.health - dmg;
    }
    // Checks the status of isFainted to see if Pokemon is fainted
    public boolean getIsFainted() {
        boolean isFainted = health <= 0;
        return isFainted;
    }
    // Returns the value of Pokemon's name
    public String getName() {
        return this.name;
    }
}