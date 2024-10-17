package part5;
import java.util.*;
public class Exception_practice {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Integer value of X : ");
			int x = sc.nextInt();
			System.out.println("Enter Integer Value of Y: " );
			int y = sc.nextInt();
			int d = (x/y);
			System.out.println(x+  " Divided by " + y + " is : " + d);
			sc.close();
				
			}
		catch(Exception e) {
			System.out.println(e);
		}
		finally{
			System.out.println("Exception Handled case");
		}
		try {
			int a = 10;
			int b = 0;
			int c = a/b;
			
					
		}
		catch(NullPointerException e) {
			System.out.println(e);
			
		}
		finally {
			System.out.println("Exception Not Handled Case");
		}
			
			
			
	}}


