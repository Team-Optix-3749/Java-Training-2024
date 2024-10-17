public class Pokemon {
    String name;
    int level;
    
    void attack(){
        System.out.print(name + "attack!");
    }

    public static void main(String[] args) {
    
        Pokemon p1 = new Pokemon();
        p1.name = "Pikachu";
        p1.level = 100;
        
        System.out.println(p1.name + " " + p1.level);
        p1.attack();
    }
}
