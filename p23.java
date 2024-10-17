package part4;

interface S {
    String getColor();
    double getArea();
    
    default String describeShape() {
        return "This is a shape with color: " + getColor() + " and area: " + getArea();
    }
}

class cir implements S {
    private double radius;
    private String color;

    public cir(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }
}

class Re implements S {
    private double length;
    private double width;
    private String color;

    public Re(double length, double width, String color) {
        this.length = length;
        this.width = width;
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
}

class sn {
    private S shape;
    private String text;

    public sn(S shape, String text) {
        this.shape = shape;
        this.text = text;
    }

    public void displaySign() {
        System.out.println(shape.describeShape());
        System.out.println("Sign text: " + text);
    }
}

public class p23 {
    public static void main(String[] args) {
        cir circle = new cir(5.0, "Red");
        Re rectangle = new Re(4.0, 6.0, "Blue");

        sn sign1 = new sn(circle, "Welcome to the Campus Center");
        sn sign2 = new sn(rectangle, "Library Hours");

        sign1.displaySign();
        sign2.displaySign();
    }
}
