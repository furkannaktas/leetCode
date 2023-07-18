package topInterviewQuestions.string_tasks;

import java.util.Arrays;
import java.util.stream.Collectors;

public class String_RemoveDuplicates {

    public static void main(String[] args) {
        System.out.println("removeDup()1 = " + removeDup1("BA ACIC"));
        System.out.println("removeDup2() = " + removeDup2("BA ACIC"));
    }

    // Solution 1
    public static String removeDup1(String str) {

        // First we can remove white spaces, then create a char array with split method
        // distinct is applied to the stream, which removes any duplicate characters.
        // collect(Collectors.joining()) is used to collect the distinct characters from the stream and join them back into a single string.
        return Arrays.stream(str.replace(" ", "").split(""))
                .distinct()
                .collect(Collectors.joining());
    }

    // Solution 2
    public static String removeDup2(String str){

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if(currentChar != ' ' && !result.contains(String.valueOf(currentChar))){
                result += currentChar;
            }
        }
        return result;
    }
}
