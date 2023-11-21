class Vehicle {
    void start() {
        System.out.println("Vehicle is starting.");
    }
}

// Subclass
class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving.");
    }
}

// Main class
public class singleInheritence {
    public static void main(String[] args) {
        // Object case
        Car myCar = new Car();
        myCar.start();
        myCar.drive();
    }
}
