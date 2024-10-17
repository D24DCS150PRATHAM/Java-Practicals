package part4;

interface print{
	public void this_is();
	default void printing() { System.out.println("This from print Interface 's default method print");}}

interface disp{
	public void here_its();
	default void print_it() { System.out.println("This from disp Interface 's default method print");
	}
}

class show implements print{
	public void this_is() { System.out.println("This is from print Interface in multiple_inheritance! ");}
	public void printing() {System.out.println("This is from show class' over rided default method printing() ");}}

class display extends show{
	public void printing() { System.out.println("This is from display class's overided method printing()");}}

class multiple_inheritance implements print , disp{
	public void this_is() { System.out.println("This is from print Interface in multiple_inheritance! ");}
	public void here_its() {
		System.out.println("This is from here_its)_ method of disp interface in multiple inheritance! ");}}	

public class multiple_with_defualt {
	public static void main(String[] args) {
		show s = new show();
		s.this_is();
		s.printing();
		System.out.println();
		multiple_inheritance m = new multiple_inheritance();
		m.here_its();
		m.this_is();
		System.out.println();
		display d = new display();
		d.printing();
		System.out.println();
	}
}
