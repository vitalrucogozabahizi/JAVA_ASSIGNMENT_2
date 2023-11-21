// Superclass
class Shape {
    void calculateArea() {
        System.out.println("Calculating area of a generic shape.");
    }
}

// Subclass
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Calculating area of a circle: " + area);
    }
}

// Main class
public class SingleInheritanceExample2 {
    public static void main(String[] args) {
        // Object case
        Circle myCircle = new Circle(5.0);
        myCircle.calculateArea();
    }
}