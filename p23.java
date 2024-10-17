interface Shape2 {
    String getColor();
    double getArea();
    default void printShapeInfo() {
        System.out.println("Shape color: " + getColor());
        System.out.println("Shape area: " + getArea());
    }
}

class Circle2 implements Shape2 {
    double radius;
    String color;

    public Circle2(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }


    public String getColor() {
        return color;
    }


    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle2 implements Shape2 {
    double length;
    double width;
    String color;

    public Rectangle2(double length, double width, String color) {
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
}

class Sign {
    Shape2 shape;
    String text;

    public Sign(Shape2 shape, String text) {
        this.shape = shape;
        this.text = text;
    }

    public void printSignInfo() {
        shape.printShapeInfo();
        System.out.println("Sign text: " + text);
    }
}

public class p23 {
    public static void main(String[] args) {
        Circle2 circle = new Circle2(5.0, "Red");

        Rectangle2 rectangle = new Rectangle2(4.0, 6.0, "Blue");

        Sign circleSign = new Sign(circle, "Welcome to Campus!");
        circleSign.printSignInfo();

        Sign rectangleSign = new Sign(rectangle, "Campus Events");
        rectangleSign.printSignInfo();
    }
}