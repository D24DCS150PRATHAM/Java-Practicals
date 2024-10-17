package part4;
class Parent {
    void display() {
        System.out.println("This is parent class");
    }
}

class Childd extends Parent {
    void show() {
        System.out.println("This is child class");
    }
}

public class p17 {
    public static void main(String[] args) {
        Parent parentObj = new Parent();
        Childd childObj = new Childd();

        parentObj.display();
        childObj.show();
        childObj.display();
    }
}
