package part8;

import java.util.*;

public class p40 {
        public static void main(String[] args) {
            String text = "This is a sample String. This String have many words. Words are counted from this String.";
            System.out.println("String: " +text);
            
            String[] words = text.toLowerCase().replaceAll("[^a-zA-Z ]", "").split("\\s+");

            Map<String, Integer> wordCountMap = new TreeMap<>();

                        for (String word : words) {
                if (!word.isEmpty()) {
                    wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                }
            }

            System.out.println("Word Occurrences:");
            for (Map.Entry<String, Integer> entry : wordCountMap.entrySet())
            {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
}