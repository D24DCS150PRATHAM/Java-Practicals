package part7;

public class p36 {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Task(),"First");
		Thread t2 = new Thread(new Task(),"Second");
		Thread t3 = new Thread(new Task(),"Third");
		t1.setPriority(1);
		t2.setPriority(5);
		t3.setPriority(10);
		t1.start();
		t2.start();
		t3.start();
	}
}
class Task implements Runnable{
	public void run() {
		System.out.println("Current Thread : "+ Thread.currentThread().getName() + " is running with Priority : " + Thread.currentThread().getPriority());
		try {
			Thread.sleep(1000);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}