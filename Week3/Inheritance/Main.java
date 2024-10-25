public class Main {
    
    public static void main(String[] args) {
        Child Jim = new Child("Jim", "Smithson", "blue");
        Jim.getLastName();
        Jim.parentEyeColor();
    }
}

// class Parent {
//     String last_name;
//     String eye_color;

//     Parent(String last_name, String eyeColor) {
//         this.last_name = last_name;
//         this.eye_color = eyeColor;
//     }
//     void getLastName() {
//         System.out.println("This person's last name is " + this.last_name);
//     }
// }

class Child extends Parent {
    String first_name;

    Child(String first_name, String lastName, String eyeColor) {
        super(lastName, eyeColor);
        this.first_name = first_name;
    }

    void getFullName() {
        System.out.println("This is" + first_name + " his last name is " + last_name + ".");
    }

    void parentEyeColor() {
        System.out.println("The parent has " + super.eye_color + " eyes.");
    }
}