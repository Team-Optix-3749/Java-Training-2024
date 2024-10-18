package Week3.Inheritance;

public class Vehicle {
    double speed;

    void go() {
        System.out.println("This vehicle is moving!");
    }

    void stop() {
        System.out.println("This vehicle is stopped!");
    }
    public static void main(String[] args) {
        Car ferrari = new Car();
        ferrari.go();
    }
}
    
class Car extends Vehicle {
        
}

class Bicycle extends Vehicle {
    
}