package part5;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class p25 {
    public static void main(String[] args) {
        try {
            readFile("C:/Users/HP/eclipse-workspace/librarymanagementjava/Djava/src/text files/text.txt");
            System.out.println("File Reading Successfull!! ");
        } catch (IOException e) {
            System.out.println("Caught an IOException: " + e.getMessage());
        }

        System.out.println("Program continues after the exception is handled.");
    }

    public static void readFile(String fileName) throws IOException {
        File file = new File(fileName);

        if (!file.exists()) {
            throw new IOException("File not found: " + fileName);
        }

        FileInputStream fis = new FileInputStream(file);

        fis.close();
    }
}
