package Week4;

public class Jigglypuff extends Pokemon{
    // have jigglypuff attack its opponent
    @Override
    void attack(Pokemon obj) {
        obj.takeDamage(15);
    }
    //constructor 
    Jigglypuff (int health, String name) {
        super(health, name);
    }
}
