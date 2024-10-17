package part5;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Method;
public class p26final {
    public void readFile() throws IOException {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("somefile.txt"));
            String line = reader.readLine();
            System.out.println(line);
            reader.close();
        } catch (IOException e) {
            throw new IOException("The specified file was not found");
        }
    }

    public void checkMethod() throws NoSuchMethodException {
        try {
            Method method = String.class.getMethod("nonExistentMethod");
        } catch (NoSuchMethodException e) {
            throw new NoSuchMethodException("The specified method does not exist");
        }
    }

    public void uncheckedExceptionsDemo() {
        int[] arr = {1, 2, 3};
        System.out.println(arr[5]); 

        String str = null;
        System.out.println(str.length()); 
    }

    public static void main(String[] args) {
        p26final demo = new p26final();

        try {
            demo.readFile();
        } catch (IOException e) {
            System.out.println("Caught IOException: " + e.getMessage());
        }

        try {
            demo.checkMethod();
        } catch (NoSuchMethodException e) {
            System.out.println("Caught NoSuchMethodException: " + e.getMessage());
        }
        try {
            demo.uncheckedExceptionsDemo();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }
}
