package part4;
import java.util.*;

interface AdvancedArithmetic{
	public void divisor_sum(int n);
}


public class Mycalculator {
	public static void main(String[] args) {
		calc c = new calc();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number for calculation: ");
		int k = sc.nextInt();
		c.divisor_sum(k);
	}
	
}
class calc extends Mycalculator implements AdvancedArithmetic{
	public void divisor_sum(int n) {
		int d = 0;
		for(int i = 1;i <= n ; i++){
			if(n % i  == 0){
				System.out.println("Divisors : " +i);
				d = d + i;}
		
			}
		System.out.println("Sum of Divisors  : "+ d);
				
			
	}
}
