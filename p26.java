package part5;
import java.util.*;
class InvalidAgeException extends Exception{
	InvalidAgeException(String msg){
		super(msg);
		
	}
}
public class p26 {
			public static void check_age(int age)throws InvalidAgeException{
				if(age < 18 || age>60) {
					throw new InvalidAgeException("Age Needs to be between 18 to 60");
				}
				else {
					System.out.println("Age is Valid");
					
				}
	}
			public static void main(String[] args) {
				try {
					Scanner sc = new Scanner(System.in);
					System.out.println("Please Enter Your Age For Validation: ");
					int i = sc.nextInt();
					check_age(i);
					
					
				}
				catch(InvalidAgeException e){
					System.out.println(e);
					
				}
				
			}
	
}
