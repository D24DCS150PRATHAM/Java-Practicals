import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class p27 {
    public static void main(String[] args) {
        String[] files = {"C:\\Users\\Pratham\\OneDrive\\Desktop\\FirstReact\\Charusat Syllabus and all\\file1.txt",
                "C:\\Users\\Pratham\\OneDrive\\Desktop\\FirstReact\\Charusat Syllabus and all\\file2.txt",
                "C:\\Users\\Pratham\\OneDrive\\Desktop\\FirstReact\\Charusat Syllabus and all\\file3.txt"};
        for (String file : files) {
            try {
                File f = new File(file);
                Scanner scanner = new Scanner(f);
                int lineCount = 0;
                while (scanner.hasNextLine()) {
                    scanner.nextLine();
                    lineCount++;
                }
                System.out.println("File: " + file + " | Number of lines: " + lineCount);
                scanner.close();
            } catch (FileNotFoundException e) {
                System.err.println("Error reading file: " + file);
            }
        }
    }
}