package part4;

public class p18 {
	public static void main(String[] args) {
		System.out.println("From Employee");
		Employee e = new Employee();
		e.address = "101,Old Town Road";
		e.age = 21;
		e.name="Den Josh";
		e.salary = 150000;
		e.Department = "Management";
		e.phone_number = 66987844;
		e.Specialization = "Project Management";
		e.Salary();
		System.out.println("Manager's name :"+ e.name);
		System.out.println("Manager's Age:"+e.age);
		System.out.println("Manager's name:"+e.name);
		System.out.println("Manager's salary:"+e.salary);
		System.out.println("Manager's Department:"+e.Department);
		System.out.println("Manager's Phone_number:"+e.phone_number);
		System.out.println("Managers Specialization:" + e.Specialization);
		
		
		
		System.out.println("From Manager");
		Manager m = new Manager();
		m.address = "New City Near Library ";
		m.age = 25;
		m.name = "Jeralddine Marek";
		m.salary = 65753;
		m.Department = "Project Supply";
		m.Specialization = "Chain Management";
		m.Salary();
		System.out.println("Manager's name :"+ m.name);
		System.out.println("Manager's Age:"+m.age);
		System.out.println("Manager's name:"+m.name);
		System.out.println("Manager's salary:"+m.salary);
		System.out.println("Manager's Department:"+m.Department);
		System.out.println("Manager's Phone_number:"+m.phone_number);
		System.out.println("Managers Specialization:" + m.Specialization);
	}
}
