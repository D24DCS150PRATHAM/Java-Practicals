package part3;

public class Employ {
	private String fname;
	private String lname;
	private Double salary;
	
	public Employ(String fname , String lname , Double salary) {
		this.fname = fname;
		this.lname = lname;
		setsalary(salary);
		
	}
	public String get_fname() {
		return fname;	
	}
	
	public void set_fname(String fname) {
		this.fname = fname;
	}
	
	public void setsalary(Double salary) {
		if(salary <= 0) {
			this.salary = 0.0;
		}
		else {
			this.salary = salary;
		}
	}
	
	public Double getsalary() {
		return salary;
		
	}
	public String get_lname() {
		return lname;	
	}
	
	public void set_lname(String lname) {
		this.lname = lname;
	}
	public double get_annual_income() {
		return salary*12;
	}
	public void raise(double per) {
		salary += salary * (per/100);
	}
}
