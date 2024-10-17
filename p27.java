package part6;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class p27 {
	    public static void main(String[] args) {
	        if (args.length == 0) {
	            System.out.println("Usage: java LineCounts <file1> <file2> ...");
	            return;
	        }

	        for (String fileName : args) {
	            int lineCount = 0;

	            try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
	                while (reader.readLine() != null) {
	                    lineCount++;
	                }
	                System.out.println(fileName + ": " + lineCount + " lines");
	            } catch (IOException e) {
	                System.out.println("Error reading file " + fileName + ": " + e.getMessage());
	            }
	        }
	    }
	

}
