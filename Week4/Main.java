package Week4;

public class Main {
    public static void main(String[] args) {
        // create jigglypuff and pikachu objects
        Pokemon j = new Jigglypuff(100, "Jigglypuff");
        Pokemon p = new Pikachu(100, "Pikachu");
        // have the pokemons attack each other until one collapses
        while(!j.getIsFainted() && !p.getIsFainted()) {
            j.attack(p);
            p.attack(j);
        }
        // printing the winner
        if (j.getIsFainted()) {
            System.out.println("Pikachu won!");

        } else {
            System.out.println("Jigglypuff won!");
        }
    }
}
