// Superclass
class Animal {
    void makeSound() {
        System.out.println("Generic animal sound.");
    }
}

// Subclass 1
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks.");
    }
}

// Subclass 2
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows.");
    }
}

// Main class
public class HierarchicalInheritanceExample2 {
    public static void main(String[] args) {
        // Object cases
        Dog myDog = new Dog();
        Cat myCat = new Cat();

        myDog.makeSound();
        myCat.makeSound();
    }
}
