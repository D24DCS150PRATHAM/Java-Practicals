package part3;

	import java.util.Scanner;

	class Complex {
	    private double real;
	    private double imaginary;

	    public Complex(double real, double imaginary) {
	        this.real = real;
	        this.imaginary = imaginary;
	    }

	    public Complex add(Complex other) {
	        return new Complex(this.real + other.real, this.imaginary + other.imaginary);
	    }

	    public Complex subtract(Complex other) {
	        return new Complex(this.real - other.real, this.imaginary - other.imaginary);
	    }

	    public Complex multiply(Complex other) {
	        double realPart = this.real * other.real - this.imaginary * other.imaginary;
	        double imaginaryPart = this.real * other.imaginary + this.imaginary * other.real;
	        return new Complex(realPart, imaginaryPart);
	    }

	    public void display() {
	        System.out.println(this.real + " + " + this.imaginary + "i");
	    }
	}

	public class ComplexNumberOperations {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter real and imaginary parts of the first complex number:");
	        double real1 = scanner.nextDouble();
	        double imaginary1 = scanner.nextDouble();

	        System.out.println("Enter real and imaginary parts of the second complex number:");
	        double real2 = scanner.nextDouble();
	        double imaginary2 = scanner.nextDouble();

	        Complex c1 = new Complex(real1, imaginary1);
	        Complex c2 = new Complex(real2, imaginary2);

	        Complex sum = c1.add(c2);
	        Complex difference = c1.subtract(c2);
	        Complex product = c1.multiply(c2);

	        System.out.println("Sum:");
	        sum.display();

	        System.out.println("Difference:");
	        difference.display();

	        System.out.println("Product:");
	        product.display();
	    }
	
}
