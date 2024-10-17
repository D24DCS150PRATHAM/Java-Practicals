package part4;

public class Degree_test {
	public static void main(String[] args) {
		System.out.println("From Degree Class : ");
		Degree d = new Degree();
		d.getDegree();
		System.out.println();
		System.out.println("From Postgraduate Class : ");
		postgraduate pd  = new postgraduate();
		pd.getDegree();
		System.out.println();
		System.out.println("From Undergraduate Class : ");
		Undergraduate ud = new Undergraduate();
		ud.getDegree();
	}
}
