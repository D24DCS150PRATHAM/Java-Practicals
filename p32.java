package part6;
class thread_class extends Thread{
	public void run(){
		System.out.println("This is from Thread class");
	}
}
class runnable_interface implements Runnable{
	public void run() {
		System.out.print("This is from Runnable interface");
	}
}
public class p32 {
	public static void main(String[]args) {
	thread_class t = new thread_class();
	Thread t1 = new Thread(t);
	t1.start();
	runnable_interface r = new runnable_interface();
	r.run();
	}
}
