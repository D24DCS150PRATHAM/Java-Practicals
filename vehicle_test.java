package part4;

public class vehicle_test {
	public static void main(String[] args) {
		System.out.println(":: -- Truck -- ::");
		System.out.println();
		truck t = new truck("Toyata","F15h",2013,"deisel");
		System.out.println("Fuel Efficiency : " + t.fuel_efficiency() + " kmph");
		System.out.println("Distnce Travelled : " + t.distance(50));
		System.out.println("Maximum Speed : " + t.speed());
		System.out.println();
		System.out.println("Truck Details :");
		t.display_info();
		System.out.println();
		System.out.println(":: -- Car -- ::");
		System.out.println();
		car c = new car("Maruti","C66e",2020,"deisel");
		System.out.println("Fuel Efficiency : " + c.fuel_efficiency() + " kmph");
		System.out.println("Distnce Travelled : " + c.distance(5));
		System.out.println("Maximum Speed : " + c.speed());
		System.out.println();
		System.out.println("Car  Details :");
		c.display_info();
		System.out.println();
		System.out.println(":: -- Motorcycle -- ::");
		System.out.println();
		motorcycle mc = new motorcycle("Honda","B887H",2003,"Petrol");
		System.out.println("Fuel Efficiency : " + mc.fuel_efficiency() + " kmph");
		System.out.println("Distnce Travelled : " + mc.distance(50));
		System.out.println("Maximum Speed : " + mc.speed());
		System.out.println();
		System.out.println("Motorcycle Details :");
		mc.display_info();
		
		
}}
