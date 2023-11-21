interface Engine {
    void start();
}

// Interface 2
interface Radio {
    void playMusic();
}

// Class implementing both interfaces
class Car implements Engine, Radio {
    @Override
    public void start() {
        System.out.println("Car engine is starting.");
    }

    @Override
    public void playMusic() {
        System.out.println("Car is playing music.");
    }
}

// Main class
public class MultipleInheritanceExample1 {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();
        myCar.playMusic();
    }
}
