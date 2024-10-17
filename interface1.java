interface Shape {
    int calculateArea();
    int calculatePerimeter();
}

class Rectangle1 implements Shape {
    int length;
    int width;

    public Rectangle1(int length, int width) {
        this.length = length;
        this.width = width;
    }
@Override
    public int calculateArea() {
        return length * width;
    }

@Override
    public int calculatePerimeter() {
        return 2 * (length + width);
    }
}

public class interface1 {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle1(5, 3);
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimeter: " + rectangle.calculatePerimeter());
    }
}
