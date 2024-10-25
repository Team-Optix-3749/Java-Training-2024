public class Me {
    String name;
    int age;

    Me(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void name() {
        System.out.println(this.name);
    }
    void age() {
        System.out.println(this.age);
    }

    public static void main(String[] args) {
        Me justin = new Me("Justin", 17);
        justin.name();
        justin.age();
    }
}
