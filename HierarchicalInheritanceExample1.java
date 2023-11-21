// Superclass
class Vehicle {
    void start() {
        System.out.println("Vehicle is starting.");
    }
}

// Subclass 1
class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving.");
    }
}

// Subclass 2
class Motorcycle extends Vehicle {
    void ride() {
        System.out.println("Motorcycle is riding.");
    }
}

// Main class
public class HierarchicalInheritanceExample1 {
    public static void main(String[] args) {
        // Object cases
        Car myCar = new Car();
        Motorcycle myMotorcycle = new Motorcycle();

        myCar.start();
        myCar.drive();

        myMotorcycle.start();
        myMotorcycle.ride();
    }
}
