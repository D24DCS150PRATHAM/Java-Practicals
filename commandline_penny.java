package part3;

public class commandline_penny {
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("No command line araguments provided!! ");
		
		}
		else {
			for(int i =0 ;i < args.length ; i ++) {
				System.out.println("Argument " + (i + 1) + ": " + args[i]);
			}
		}
	}
}
