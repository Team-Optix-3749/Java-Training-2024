public class Pokemon {
    String name;
    int level;
    

    Pokemon(){
        level = 1;
    }

    Pokemon(String pName, int pLevel){
        // Use variables defined in class (at top of page) rather than local variables (this statements)
        this.name = pName;
        this.level = pLevel;
    }
    
    void attack(){
        System.out.println(name + "attack!");
    }

    public static void main(String[] args) {
    
        Pokemon p1 = new Pokemon("Pikachu", 15);
        
        System.out.print(p1.name + "\nLevel:" + p1.level);

        Pokemon p2 = new Pokemon("Vaporeon", 69);

        p2.attack();
    }
}
