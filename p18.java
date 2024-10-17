 class members {
    String Name;
    int age;
    String phonno;
    String address;
    int salary;

    public void printSalary(){
        System.out.println("The Salary of "+ Name + " is " + salary);
    }

     public members(String name, int age, String phonno, String address, int salary) {
         Name = name;
         this.age = age;
         this.phonno = phonno;
         this.address = address;
         this.salary = salary;
     }
 }
class Employee1 extends members{
    String specialization;

    public Employee1(String name, int age, String phonno, String address, int salary, String specialization) {
        super(name, age, phonno, address, salary);
        this.specialization = specialization;
    }
}

class Manager extends members
{
    String department;

    public Manager(String name, int age, String phonno, String address, int salary, String department) {
        super(name, age, phonno, address, salary);
        this.department = department;
    }
}
class TestEmployee{
    public static void main(String[] args) {
        Employee1 e1 = new Employee1("Pratham",20,"9722768555","Surat",50000,"Computer Engineering");
        Manager m1 = new Manager("Vivek",20,"8145698754","Anand",45000,"CSE");
        e1.printSalary();
        m1.printSalary();
    }
}

