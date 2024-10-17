class Degree {
    public void getDegree() {
        System.out.println("I got a degree");
    }
}

class Undergraduate extends Degree {
    public void getDegree() {
        System.out.println("I am an Undergraduate");
    }
}

class Postgraduate extends Degree {

    public void getDegree() {
        System.out.println("I am a Postgraduate");
    }
}

public class p21 {
    public static void main(String[] args) {
        Degree degreeObj = new Degree();
        degreeObj.getDegree();

        Undergraduate undergraduateObj = new Undergraduate();
        undergraduateObj.getDegree();

        Postgraduate postgraduateObj = new Postgraduate();
        postgraduateObj.getDegree();
    }
}