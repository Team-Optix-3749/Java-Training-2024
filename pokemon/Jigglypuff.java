package pokemon;

public class Jigglypuff extends Pokemon {
    public Jigglypuff(int health, String name, int attack) {
        super(health, name, attack);
    }

    private Jigglypuff() {
        super(50, "Jigglypuff", 8);
    }

    @Override
    public void attack(Pokemon target) {
        target.damageTaken(this.attack);
    } 
}
