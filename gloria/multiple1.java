public class multiple1 {
    public static void main(String[] args) {
        // Creating an object of the class that implements both interfaces
        FlyingCar myFlyingCar = new FlyingCar();

        // Calling methods from both interfaces
        myFlyingCar.drive();  // Method from Drives interface (inherited from Car)
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
class Car implements Drives {
    @Override
    public void drive() {
        System.out.println("Car is driving");
    }
}

// Class implementing the first interface and extending a class
class FlyingCar extends Car implements Flies {
    @Override
    public void fly() {
        System.out.println("Flying car is flying");
    }}

