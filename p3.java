package part7;
import java.util.*;
public class p3 {
	public static void main(String[] args) {
		NumberGenerator ng = new NumberGenerator();
		Thread gt = new Thread(ng);
		gt.start();
		
	}
}
class NumberGenerator implements Runnable{
	Random r = new Random();
	public void run() {
		while(true) {
			int num = r.nextInt(100);
			System.out.println("Generated Num : "+num);
			
			if(num%2 == 0) {
				new Thread(new SquareCalculator(num)).start();
			}
			else {
				new Thread(new CubeCalculator(num)).start();
			}
			try {
				Thread.sleep(1000);
				
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	}
			
}

class SquareCalculator implements Runnable{
	private int number;
	public SquareCalculator(int number) {
		this.number = number;
	}
	
	public void run() {
		int sq = number*number;
		System.out.println("Square of : " + number + " : "+ sq);
	}
}
class CubeCalculator implements Runnable{
	private int number;
	public CubeCalculator(int number) {
		this.number = number;
	}
	
	public void run() {
		int cu = number*number;
		System.out.println("Square of : " + number + " : "+ cu);
	}
}
