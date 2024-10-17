package part8;
import java.util.*;
public class p38 {
	private ArrayList<Object> list;
	private int maxSize;
	public p38(int maxSize) {
		list = new ArrayList<>();
		this.maxSize = maxSize; 
	}
	public boolean isEmpty() {
		System.out.println("IsEmpty? : "+list.isEmpty());
		return list.isEmpty();
	}
	public int getSize() {
		System.out.println("size: "+list.size());
		return list.size();
	}
	public Object peek() {
		if(isEmpty()) {
			System.out.println("Stack Underflow : Stack is Empty! ");
			return null;
			}
		System.out.println("Peeked: "+list.get(list.size()-1));
		return list.get(list.size()-1);
	}
	public Object pop() {
		if(isEmpty()) {
			System.out.println("Stack Underflow : Stack is Empty! ");
			return null;
			}
		Object a = list.get(list.size()-1);
		System.out.println("Popped: "+a);
		return list.remove(list.size()-1);
		
		
		
	}
	public void push(Object o) {
        if (list.size() < maxSize) {
            list.add(o);
            System.out.println("Pushed: " + o);
        } else {
            System.out.println("Overflow: Can't insert values anymore!");
        }
    }

	
	public static void main(String[] args) {
		p38 stack = new p38(3);
		stack.isEmpty();
		stack.push(50);
		stack.push(10);
		stack.peek();
		stack.pop();
		stack.peek();
		stack.isEmpty();
		stack.getSize();
		stack.pop();
		stack.getSize();
		stack.isEmpty();
		stack.pop();
		stack.pop();
		stack.push(100);

		stack.push(550);
		stack.push(100);
		stack.push(110);
		stack.push(520);
		stack.getSize();
	}
}
