package part4;

public class Rectangle {
	double l;
	double b;
	public Rectangle(double l ,double b){
		this.l = l;
		this.b = b;
		
	}
	public double calc_area(){
		return l*b;
	}
	public double calc_peri() {
		return 2*(l+b);
		
	}
	public void area() {
		System.out.println("Area : " + calc_area());
	}
	public void perimeter() {
		System.out.println("Perimeter : "+calc_peri());
	}
}
