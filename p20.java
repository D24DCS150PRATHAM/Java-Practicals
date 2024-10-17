package part4;

class Shape {
    void printShape() {
        System.out.println("This is shape");
    }
}

class R extends Shape {
    void printRectangle() {
        System.out.println("This is rectangular shape");
    }
}

class Circle extends Shape {
    void printCircle() {
        System.out.println("This is circular shape");
    }
}

class sq extends R {
    void printSquare() {
        System.out.println("Square is a rectangle");
    }
}

public class p20 {
    public static void main(String[] args) {
        sq square = new sq();
        square.printShape();
        square.printRectangle();
        square.printSquare();
    }
}

