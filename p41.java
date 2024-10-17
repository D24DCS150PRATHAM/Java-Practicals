package part8;

import java.io.*;
import java.util.*;

public class p41 {

    // Method to load all Java keywords into a HashSet
    public static Set<String> loadJavaKeywords() {
        // Java keywords list (as of Java 17)
        String[] keywords = {
                "abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class",
                "const", "continue", "default", "do", "double", "else", "enum", "extends", "final",
                "finally", "float", "for", "goto", "if", "implements", "import", "instanceof",
                "int", "interface", "long", "native", "new", "null", "package", "private",
                "protected", "public", "return", "short", "static", "strictfp", "super",
                "switch", "synchronized", "this", "throw", "throws", "transient", "try",
                "void", "volatile", "while"
        };

        // Store keywords in a HashSet for quick lookup
        return new HashSet<>(Arrays.asList(keywords));
    }

    // Method to count the number of Java keywords in a source file
    public static int countKeywordsInFile(String filePath, Set<String> keywordSet) throws IOException {
        int keywordCount = 0;

        // Read the file line by line
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        while ((line = reader.readLine()) != null) {
            // Split each line into words using non-word characters as delimiters
            String[] words = line.split("\\W+");

            // Check each word to see if it's a Java keyword
            for (String word : words) {
                if (keywordSet.contains(word)) {
                    keywordCount++;
                }
            }
        }
        reader.close();
        return keywordCount;
    }

    public static void main(String[] args) {
        // Load the set of Java keywords
        Set<String> javaKeywords = loadJavaKeywords();

        // Path to the Java source file (modify with your file's path)
        String filePath = "C:/Users/Hp/eclipse-workspace/librarymanagementjava/Djava/src/part8/javakeyword.java";  // Update this with the actual path

        try {
            // Count the keywords in the file
            int keywordCount = countKeywordsInFile(filePath, javaKeywords);
            System.out.println("Number of Java keywords in the file: " + keywordCount);
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}