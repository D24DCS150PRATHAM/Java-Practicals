package part4;

public class mainn {
	public static void main (String[] args) {
		Rectangle r = new Rectangle(55.0,60);
		System.out.println("Rectangle :-- ");
		r.area();
		r.perimeter();
		
		square sq = new square(4.0);
		System.out.println();
		System.out.println("Square :-- ");
		sq.area();
		sq.perimeter();
		
		Rectangle[] rr = new Rectangle[3];
		rr[0] = new Rectangle(44.9,211.0);
		rr[1] = new Rectangle(51.9,71.0);
		rr[2] = new Rectangle(54.7,217);
		System.out.println();
		System.out.println("Array of Rectangles : ");
		
		for(int i = 0 ; i < rr.length; i++) {
			System.out.println();
			System.out.println("Rectangle "  + (i+1) + ":");
			System.out.println();
			rr[i].area();
			rr[i].perimeter();
		}
	}
}
