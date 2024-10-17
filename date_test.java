package part3;

public class date_test {
	public static void main(String[] args) {
		Date d = new Date(26 , 01 , 2006);
		System.out.println("Date is " + d.get_day());
		System.out.println("Month is: " +d.get_month());
		System.out.println("Year is: " +d.get_year());
		d.display();
		d.set_day(01);
		d.set_month(02);
		d.set_year(2001);
		System.out.println("Date is " + d.get_day());
		System.out.println("Month is: " +d.get_month());
		System.out.println("Year is: " +d.get_year());
		d.display();
		
	}
}
