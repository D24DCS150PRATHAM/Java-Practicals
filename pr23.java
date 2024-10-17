package part4;
interface Shape {
    String getColor();
    double getArea();

    default void displayInfo() {
        System.out.println("Shape color: " + getColor());
        System.out.println("Shape area: " + getArea());
    }
}
class Circle implements Shape {
    private double radius;
    private String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }


    public String getColor() {
        return color;
    }


    public double getArea() {
        return Math.PI * radius * radius;
    }


    public void displayInfo() {
        System.out.println("This is a Circle.");
        Shape.super.displayInfo();
        System.out.println("Circle radius: " + radius);
    }
}

class Rectangle implements Shape {
    private double length;
    private double width;
    private String color;

    public Rectangle(double length, double width, String color) {
        this.length = length;
        this.width = width;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return length * width;
    }

    public void displayInfo() {
        System.out.println("This is a Rectangle.");
        Shape.super.displayInfo();
        System.out.println("Rectangle length: " + length);
        System.out.println("Rectangle width: " + width);
    }
}
class Sign {
    private Shape backgroundShape;
    private String text;

    public Sign(Shape backgroundShape, String text) {
        this.backgroundShape = backgroundShape;
        this.text = text;
    }

    public void displaySign() {
        System.out.println("Sign Text: " + text);
        backgroundShape.displayInfo();
    }
}

public class pr23 {

    public static void main(String[] args) {
        Shape circle = new Circle(5.0, "Red");
        Shape rectangle = new Rectangle(4.0, 3.0, "Blue");

        Sign sign1 = new Sign(circle, "Welcome to the Campus Center!");
        Sign sign2 = new Sign(rectangle, "Caution: Wet Floor");

        sign1.displaySign();
        System.out.println();
        sign2.displaySign();
    }

}
