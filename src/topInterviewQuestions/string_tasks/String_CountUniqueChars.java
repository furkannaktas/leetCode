package topInterviewQuestions.string_tasks;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class String_CountUniqueChars {

    public static void main(String[] args) {

        System.out.println("countUniqueCharacters1() = " + countUniqueCharacters1("aab d ")); //2
    }

    // Solution 1
    public static int countUniqueCharacters1(String  input){
        input = input.replace(" ", "");
        Map<Character, Integer> characterCount = new HashMap<>();

        for (char currentChar : input.toCharArray()) {
            characterCount.put(currentChar, characterCount.getOrDefault(currentChar, 0) + 1);
            // getOrDefault coming from Map interface.If the key is present in the map, it returns the corresponding value.
            // If the key is not found in the map, it returns a default value that you provide.
        }

        int uniqueCount = 0;
        for (int count : characterCount.values()) {
            if (count == 1) {
                uniqueCount++;
            }
        }

        return uniqueCount;
    }




    public static int countUniqueCharacters(String input) {

        // Remove white spaces from the string
        input = input.replace(" ", "");

        // Create a map to store the count of each character
        Map<Character, Integer> characterCount = new HashMap<>();

        // Iterate over each character in the string
        for (char c : input.toCharArray()) {
            // Increment the count for the character
            characterCount.put(c, characterCount.getOrDefault(c, 0) + 1);
        }

        int uniqueCount = 0;
        // Iterate over the character count map
        for (Map.Entry<Character, Integer> entry : characterCount.entrySet()) {
            // If the character count is 1, it's unique
            if (entry.getValue() == 1) {
                uniqueCount++;
            }
        }

        // Return the count of unique characters
        return uniqueCount;

    }

}
