package part4;

public abstract class vehicle {
	String make;
	String model;
	int year;
	String fuel_type;
	
	public vehicle(String make, String model , int year , String fuel_type) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.fuel_type = fuel_type;
		
	}
	
	public abstract double fuel_efficiency();
	public abstract double distance(double fuel) ;
	public abstract int speed();
	
	public void display_info() {
		System.out.println("Make : " +make);
		System.out.println("Model :" +model);
		System.out.println("Year : " +year);
		System.out.println("fuel_type : " +fuel_type);
		
		
	}
}
