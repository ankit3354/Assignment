import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    // Method to convert a Roman numeral to an integer
    public static int romanToInt(String s) {
        // Create a map to store Roman numerals and their corresponding integer values
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0; // Variable to store the final result
        int prevValue = 0; // Variable to store the value of the previous character

        // Iterate through each character in the input string
        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = romanMap.get(s.charAt(i)); // Get the value of the current character

            // If the current value is less than the previous value, subtract it from the result
            // Otherwise, add it to the result
            if (currentValue < prevValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }

            prevValue = currentValue; // Update the previous value
        }

        return result; // Return the final result
    }

    // Main method to test the conversion
    public static void main(String[] args) {
        // Test cases
        String roman1 = "IX";
        String roman2 = "LVIII";
        String roman3 = "MCMXCIV";

        // Convert and print the results
        System.out.println(roman1 + " = " + romanToInt(roman1)); // Output: IX = 9
        System.out.println(roman2 + " = " + romanToInt(roman2)); // Output: LVIII = 58
        System.out.println(roman3 + " = " + romanToInt(roman3)); // Output: MCMXCIV = 1994
    }
}
