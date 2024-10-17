package part3 ;
import java.util.Scanner;

class recArea {
    private double length;
    private double breadth;

    public recArea(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double returnArea() {
        return length * breadth;
    }
}

public class area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.println("Enter the breadth of the rectangle: ");
        double breadth = scanner.nextDouble();

        recArea rectangle = new recArea(length, breadth);
        double area = rectangle.returnArea();
        System.out.println("The area of the rectangle is: " + area);
    }
}
