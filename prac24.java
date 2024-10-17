package part5;

public class prac24 {

    public static void main(String[] args) {
       
        int[] numbers = {1, 2, 3, 4, 5};

        
        String text = null;

        try {
           
            System.out.println("Accessing element at index 5: " + numbers[5]);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(" Invalid index in the array.");
        } 
        try {
        	 System.out.println("Length of the text: " + text.length());
        }
        catch (NullPointerException e) {
            System.out.println("Object is null.");
        } 
        
      
    }
}