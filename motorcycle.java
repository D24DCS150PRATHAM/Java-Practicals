package part4;

public class motorcycle extends truck {
	public motorcycle(String make, String model , int year , String fuel_type) {
		super(make,model,year,fuel_type);
		
	}
	public double fuel_efficiency(){
		return 30.0;
	}
	public  double distance(double fuel) {
		return fuel * fuel_efficiency();
		
	}
	public int speed() {
		return 150;
		
	}
	
}
