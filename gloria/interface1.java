public class interface1 {
    public static void main(String[] args) {
        // Creating an object of the class that implements both interfaces
        FlyingCar myFlyingCar = new FlyingCar();

        // Calling methods from both interfaces
        myFlyingCar.drive();  // Method from Drives interface
        myFlyingCar.fly();    // Method from Flies interface
    }
}
interface Drives {
    void drive();
}

// Second interface
interface Flies {
    void fly();
}

// Class implementing both interfaces
class FlyingCar implements Drives, Flies {
    @Override
    public void drive() {
        System.out.println("Flying car is driving");
    }

    @Override
    public void fly() {
        System.out.println("Flying car is flying");
    }
}