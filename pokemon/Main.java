package pokemon;

public class Main {
    public static void main(String[] args) {
        Pokemon pikachu = new Pikachu(100, "Ash's Pikachu", 20);
        Pokemon jigglypuff = new Jigglypuff(121, "Demon Slapping Singer", 6);
        
        while (pikachu.getIsFainted() || jigglypuff.getIsFainted()) {
            pikachu.attack(jigglypuff);
            jigglypuff.attack(pikachu);
        }
        if (pikachu.getIsFainted()) {
            System.out.println(jigglypuff.getName() + " wins");
        } else {
            System.out.println(pikachu.getName() + " Wins");
        }
    }
}
