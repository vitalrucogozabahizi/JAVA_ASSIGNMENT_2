// Interface
interface Vehicle {
    void start();
    void stop();
}

// Class implementing the interface
class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting.");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping.");
    }
}

// Class implementing the interface
class Motorcycle implements Vehicle {
    @Override
    public void start() {
        System.out.println("Motorcycle is starting.");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle is stopping.");
    }
}

// Main class
public class // Interface
interface Shape {
    double calculateArea();
    double calculatePerimeter();
}

// Class implementing the interface for a circle
class Circle implements Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Class implementing the interface for a rectangle
class Rectangle implements Shape {
    private double length;
    private double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

// Main class
public class InterfaceExperiment3 {
    public static void main(String[] args) {
        // Object cases
        Circle myCircle = new Circle(3.0);
        Rectangle myRectangle = new Rectangle(4.0, 5.0);

        // Using the interface methods
        System.out.println("Circle Area: " + myCircle.calculateArea());
        System.out.println("Circle Perimeter: " + myCircle.calculatePerimeter());

        System.out.println("Rectangle Area: " + myRectangle.calculateArea());
        System.out.println("Rectangle Perimeter: " + myRectangle.calculatePerimeter());
    }
}
 {
    public static void main(String[] args) {
        // Object cases
        Car myCar = new Car();
        Motorcycle myMotorcycle = new Motorcycle();

        // Using the interface methods
        myCar.start();
        myCar.stop();

        myMotorcycle.start();
        myMotorcycle.stop();
    }
}
