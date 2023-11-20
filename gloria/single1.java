public class single1 {
    public static void main(String[] args) {
        // Creating an object of the subclass
        Dog myDog = new Dog();

        // Calling methods from the superclass and subclass
        myDog.eat();  // Inherited method from Animal class
        myDog.bark(); // Method from Dog class
    }
}

class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Subclass inheriting from Animal
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

