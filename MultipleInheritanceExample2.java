// Interface 1
interface Runnable {
    void run();
}

// Interface 2
interface Swimmable {
    void swim();
}

// Class implementing both interfaces
class Athlete implements Runnable, Swimmable {
    @Override
    public void run() {
        System.out.println("Athlete is running.");
    }

    @Override
    public void swim() {
        System.out.println("Athlete is swimming.");
    }
}

// Main class
public class MultipleInheritanceExample2 {
    public static void main(String[] args) {
        // Object case
        Athlete myAthlete = new Athlete();
        myAthlete.run();
        myAthlete.swim();
    }
}
