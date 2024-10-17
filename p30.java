package part6;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class p30 {
	    public static void main(String[] args) {
	      
	    	String sourceFile = "C:/Users/Hp/eclipse-workspace/librarymanagementjava/Djava/src/source.txt";

	        String destinationFile = "destination.txt";

	        try (FileInputStream fis = new FileInputStream(sourceFile);
	             FileOutputStream fos = new FileOutputStream(destinationFile)) {

	            byte[] buffer = new byte[1024];
	            int bytesRead;

	            while ((bytesRead = fis.read(buffer)) != -1) {
	                fos.write(buffer, 0, bytesRead);
	            }

	            System.out.println("File copied successfully!");

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}

