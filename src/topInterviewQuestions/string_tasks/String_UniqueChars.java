package topInterviewQuestions.string_tasks;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class String_UniqueChars {

    public static void main(String[] args) {
        System.out.println("findUniqueCharacters() = " + findUniqueCharacters("eABCAA BBZDE"));
    }

    public static String findUniqueCharacters(String str) {
        str = str.toLowerCase(); // Convert all characters to lowercase
        str = str.replace(" ", ""); // Remove white spaces
        Set<Character> uniqueChars = new LinkedHashSet<>();
        Set<Character> duplicateChars = new LinkedHashSet<>();

        for (char c : str.toCharArray()) {
            if (!uniqueChars.add(c)) {
                duplicateChars.add(c);
            }
        }

        uniqueChars.removeAll(duplicateChars);

        StringBuilder result = new StringBuilder();
        for (Character c : uniqueChars) {
            result.append(c);
        }
        return result.toString();
    }

}
