public class Parent {
    String last_name;
    String eye_color;

    Parent(String last_name, String eyeColor) {
        this.last_name = last_name;
        this.eye_color = eyeColor;
    }
    void getLastName() {
        System.out.println("This person's last name is " + this.last_name);
    }
}
