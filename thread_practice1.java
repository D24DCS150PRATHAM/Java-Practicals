package part6;
class one implements Runnable{
	public void run() {
		System.out.println("This is thread running.......");
		for(int i = 1; i <= 10 ; i++ ) {
			if((i % 2) == 0) {
				System.out.println("The number is even");
				
			}
			else {
				System.out.println("This number is odd");
			}
		}
	}
}
public class thread_practice1 {
	public static void main(String[] args) {
		one o = new one();
		o.run();
	}
	
}
