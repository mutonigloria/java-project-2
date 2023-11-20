public class hierarchical1 {
    public static void main(String[] args) {
        // Creating objects of the subclasses
        Dog myDog = new Dog();
        Cat myCat = new Cat();

        // Calling methods from the superclass and subclasses
        myDog.eat();   // Inherited method from Animal class
        myDog.bark();  // Method from Dog class
        myCat.eat();   // Inherited method from Animal class
        myCat.meow();  // Method from Cat class
    }
}
class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Subclass 1
class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking");
    }
}

// Subclass 2
class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing");
    }
}