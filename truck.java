package part4;

public class truck extends vehicle{
	public truck(String make, String model , int year , String fuel_type) {
		super(make,model,year,fuel_type);
		
	}
	public double fuel_efficiency(){
		return 8.0;
	}
	public  double distance(double fuel) {
		return fuel * fuel_efficiency();
		
	}
	public int speed() {
		return 90;
		
	}
	
	

}
