package part7;

public class p35 {
	public static void main (String args[]) {
		Increementer ic = new Increementer();
		Thread t1 = new Thread(ic);
		t1.start();
	}
}
class Increementer implements Runnable {
	private int n = 0;
	public void run() {
		try {
		while (true) {
			n++;
			System.out.println("Value Increeemented : "+n);
			Thread.sleep(1000);
		}
	}
		catch(Exception e) {
			System.out.println(e);
		}

}}