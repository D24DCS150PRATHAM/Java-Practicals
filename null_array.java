package part5;

public class null_array {

    public static void main(String[] args) {
        try {
            int[] array = {1, 22, 3};
            System.out.println("Accessing element at index 2: " + array[2]); 
            System.out.println("Accessing element at index 3: " + array[3]); 
        } catch (ArrayIndexOutOfBoundsException a) {
            System.out.println(a);
        }

        try {
            String str = null;
            System.out.println("Length of the string: " + str.length());  
        } catch (NullPointerException e) {
            System.out.println(e);
        }

        System.out.println("Program Completed!");
    }
}
