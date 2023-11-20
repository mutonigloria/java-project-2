public class single2{
    public static void main(String[] args) {
        Circle myCircle = new Circle();
        myCircle.draw(); // Overridden method from Circle class
    }
}
class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a circle");
    }
}
