

class Rectangle{
    int length;
    int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public void printArea(){
        System.out.println("The Area of Rectangle for length "+ length + " and Breadth is "+ breadth + " = "+ length * breadth);
    }
    public void printPerimemter(){
        System.out.println("The Perimeter of Rectangle for length "+ length + " and Breadth is "+ breadth + " = "+ (length * breadth)/2);

    }

}

class Square extends Rectangle{

    int side;

    public Square(int length, int breadth, int side) {
        super(length, breadth);
        this.side = side;
    }
    public void area(){
        super.printArea();
        System.out.println("The Area of Square is :" + side * side);
    }

    public void perimeter(){
        super.printPerimemter();
        System.out.println("The Perimeter of the side "+ side +" for the Square is: " + side * 4 );
    }
}
class TestRect{
    public static void main(String[] args) {


        Square[] squares = new Square[4];

        squares[0] = new Square(4,5,9);
        squares[1] = new Square(2,9,4);
        squares[2] = new Square(1,6,5);
        squares[3] = new Square(4,2,8);

        for(Square s1 : squares){
            s1.area();
            System.out.println();
            s1.perimeter();
            System.out.println();
        }

    }
}


