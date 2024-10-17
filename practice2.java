package part6;

public class practice2 {
	public static void main(String[] args) throws InterruptedException{
		odd d = new odd();
		even e = new even();
		
		Thread  t2 = new Thread(e);
		t2.start();
		t2.join();
		d.start();
		
	}
	
	}
class even implements Runnable{
	public  void run() {
		for(int i = 0; i<=50 ; i++) {
			if(i%2==0) {
				System.out.println("This is even: "+i);
			}
		}
	}
}
class odd extends Thread{
	public  void run(){
		for(int i = 1; i<=50; i++) {
			if(i%2!=0) {
				System.out.println("this is Odd!! " +i);
			}
		}}}
