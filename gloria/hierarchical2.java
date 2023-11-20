public class hierarchical2 {
    public static void main(String[] args) {
        // Creating objects of the subclasses
        Circle myCircle = new Circle();
        Square mySquare = new Square();

        // Calling overridden methods from the subclasses
        myCircle.draw();  // Overridden method from Circle class
        mySquare.draw();  // Overridden method from Square class
    }
}
class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

// Subclass 1
class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a circle");
    }
}

// Subclass 2
class Square extends Shape {
    void draw() {
        System.out.println("Drawing a square");
    }
}