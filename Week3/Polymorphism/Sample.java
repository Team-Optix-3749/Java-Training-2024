public class Sample {
    String ice;
    Sample(String ice) {
        this.ice = ice;
    }
    
    void saySomething() {
        System.out.println("HEY!");
    }

    public static void main(String[] args) {
        Sample[] bob = {new Polymorphism("ice"), new Sample("ice"), new Polymorphism("ice"), new Sample("Bob")};
        for (int i = 0; i < bob.length; i++) {
            bob[i].saySomething();
        }
    }
}

class Polymorphism extends Sample {
    Polymorphism(String ice) {
        super(ice);
    }
    
    @Override
    void saySomething() {
        System.out.println("Hey?");
    }
}
