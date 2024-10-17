package part4;
public class shape_test{
	public static void main(String[] args) {
		System.out.println("This is from Rectangle Class :");
		rect r = new rect("Rectangular");
		r.this_is();
		System.out.println();
		System.out.println("This is from Circle Class :");
		circle c = new circle("Circular");
		c.this_is();
		squa s = new squa("Square");
		System.out.println();
		System.out.println("This is from Square Class :");
		s.this_is();
		s.shape();
		
	}
}