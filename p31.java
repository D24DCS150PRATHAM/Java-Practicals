package part6;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
public class p31 {

    public static void main(String[] args) {
        String fileName = "output.txt";

        try (BufferedReader consoleReader = new BufferedReader(new java.io.InputStreamReader(System.in));
             BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileName))) {

            System.out.println("Enter text (type 'exit' to stop):");
            String inputLine;
            while (!(inputLine = consoleReader.readLine()).equals("exit")) {
                fileWriter.write(inputLine);
                fileWriter.newLine();
          }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try (FileInputStream fileInputStream = new FileInputStream(fileName)) {
            int byteData;
            System.out.println("\nContents of the file:");
            while ((byteData = fileInputStream.read()) != -1) {
                System.out.print((char) byteData);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
