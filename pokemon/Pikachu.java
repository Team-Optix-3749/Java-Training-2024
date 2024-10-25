package pokemon;

public class Pikachu extends Pokemon {
    public Pikachu(int health, String name, int attack) {
        super(health, name, attack);
    };

    private Pikachu() {
        super(50, "Pikachu", 12);
    };

    @Override
    public void attack(Pokemon target) {
        target.damageTaken(this.attack);
    };
}
