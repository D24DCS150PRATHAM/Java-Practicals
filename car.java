package part4;

public class car extends vehicle {
	public car(String make, String model , int year , String fuel_type) {
		super(make,model,year,fuel_type);
		
	}
	public double fuel_efficiency(){
		return 15.0;
	}
	public  double distance(double fuel) {
		return fuel * fuel_efficiency();
		
	}
	public int speed() {
		return 180;
		
	}
	
}
