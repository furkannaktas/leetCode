package topInterviewQuestions.string_tasks;

import java.util.*;

public class String_FrequencyOfCharacters {

    public static void main(String[] args) {
        System.out.println("findCharacterFrequencies1() = " + findCharacterFrequencies1("CABCBDDD"));
        System.out.println("findCharacterFrequencies()2 = " + findCharacterFrequencies2("CABCBDDD")); // A2B2C1D3
    }


    // Solution 1
    public static String findCharacterFrequencies1(String str){

        String result = "";

        for(String each : new LinkedHashSet<>(Arrays.asList(str.split("")))){
            result += each + Collections.frequency(Arrays.asList(str.split("")),each);
        }
        return result;
    }

    // Solution 2
    public static Map<Character, Integer> findCharacterFrequencies2(String input) {

        // Removing white spaces
        input = input.replace(" ", "");
        // Map<Character, Integer> frequencyMap = new HashMap<>();      // sorted
        Map<Character, Integer> frequencyMap = new LinkedHashMap<>();   // original order

        for (char currentChar : input.toCharArray()) {
            frequencyMap.put(currentChar, frequencyMap.getOrDefault(currentChar, 0) + 1);
            // is used to update the frequency of the character. c is already in the map, or 0 if it's not present.
        }

        return frequencyMap;
    }


}
