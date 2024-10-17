package part6;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class p29 {

	    public static void main(String[] args) {
	        String targetWord = "the"; // Specify the word to search
	        String fileName = "C:/Users/Hp/eclipse-workspace/librarymanagementjava/Djava/src/xanadu.txt.txt"; // Specify the file path
	        Integer count = 0;

	        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
	            String line;
	            while ((line = reader.readLine()) != null) {
	                String[] words = line.split("\\W+");
	                for (String word : words) {
	                    if (word.equalsIgnoreCase(targetWord)) {
	                        count++;
	                    }
	                }
	            }
	            System.out.println("The word '" + targetWord + "' appears " + count + " times in the file " + fileName);
	        } catch (IOException e) {
	            System.out.println("Error reading file " + fileName + ": " + e.getMessage());
	        }
	    }
		

}
