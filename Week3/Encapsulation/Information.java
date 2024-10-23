public class Information {
    // Private means variable cannot be accessed outside of class
    private String name;
    private int age;
    private String gender;

    Information() {
            this.name = "Jimmeh";
            this.age = 21;
            this.gender = "Male";
    }
    
    Information(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    

    // Public means that there is permission for other classes to use this
    public String getName() {
        return name;
    }
    public void setName(String newName) {
        this.name = newName;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int newAge) {
        this.age = newAge;
    }

    public String getGender() {
        return gender;
    }
    public void setGender(String newGender) {
        this.gender = newGender;
    }

    public boolean getOlderThan21() {
        if (this.age > 21) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Information justin = new Information("Justin", 17, "Male");
        Information weston = new Information("Weston", 22, "Mouse");

        System.out.println(justin.getOlderThan21());
        System.out.println(weston.getOlderThan21());
    }
}

