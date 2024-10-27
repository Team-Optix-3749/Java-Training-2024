package Week4;

public class Pikachu extends Pokemon{
    // have pikachu do damage to its opponent
    @Override
    void attack(Pokemon obj) {
        obj.takeDamage(25);
    }
    // constructor
    Pikachu (int health, String name) {
        super(health, name);
    }
}
