public class Main {
    
    public static void main(String[] args) {
        Child Jim = new Child("Jim");
        Jim.getLastName();
        Jim.parentEyeColor();
    }
}

class Parent {
    String last_name = "Smithson";
    String eye_color = "Blue";

    void getLastName() {
        System.out.println("This person's last name is " + this.last_name);
    }
}

class Child extends Parent {
    String first_name;

    Child(String first_name) {
        this.first_name = first_name;
    }

    void getFullName() {
        System.out.println("This is" + first_name + " his last name is " + last_name + ".");
    }

    void parentEyeColor() {
        System.out.println("The parent has " + eye_color + " eyes.");
    }
}