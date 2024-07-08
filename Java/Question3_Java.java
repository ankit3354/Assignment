import java.util.HashSet;
import java.util.Set;

public class PangramChecker {

    // Method to check if a string is a pangram
    public static boolean isPangram(String s) {
        // Convert the input string to lowercase to handle case-insensitivity
        s = s.toLowerCase();

        // Create a set to store unique characters
        Set<Character> charSet = new HashSet<>();

        // Iterate through each character in the input string
        for (char c : s.toCharArray()) {
            // If the character is a letter, add it to the set
            if (c >= 'a' && c <= 'z') {
                charSet.add(c);
            }
        }

        // Check if the set contains all 26 letters of the alphabet
        return charSet.size() == 26;
    }

    // Main method to test the pangram checker
    public static void main(String[] args) {
        // Test cases
        String sentence1 = "The quick brown fox jumps over the lazy dog";
        String sentence2 = "Hello, world!";
        String sentence3 = "Pack my box with five dozen liquor jugs.";

        // Check and print if the sentences are pangrams
        System.out.println("\"" + sentence1 + "\" is a pangram: " + isPangram(sentence1)); // Output: true
        System.out.println("\"" + sentence2 + "\" is a pangram: " + isPangram(sentence2)); // Output: false
        System.out.println("\"" + sentence3 + "\" is a pangram: " + isPangram(sentence3)); // Output: true
    }
}
