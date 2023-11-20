public class multiple2 {
    public static void main(String[] args) {
        // Creating an object of the class that implements both interfaces
        Dog myDog = new Dog();

        // Calling methods from both interfaces
        myDog.walk();  // Method from Walks interface
        myDog.swim();  // Method from Swims interface
    }
}
interface Walks {
    void walk();
}

// Second interface
interface Swims {
    void swim();
}

// Class implementing both interfaces
class Dog implements Walks, Swims {
    @Override
    public void walk() {
        System.out.println("Dog is walking");
    }

    @Override
    public void swim() {
        System.out.println("Dog is swimming");
    }
}