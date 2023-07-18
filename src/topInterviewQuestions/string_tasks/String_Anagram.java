package topInterviewQuestions.string_tasks;

import java.util.Arrays;

public class String_Anagram {

    /*
    Write a  function that check if a string is build out of the same letters as another string.
            Ex: same("abc", "cab"); -> true , Solution 1:
                same("abc", "abb"); -> false:

     */

    public static void main(String[] args) {
        System.out.println("isAnagram1() = " + isAnagram1("abc","ab c"));
        System.out.println("isAnagram2() = " + isAnagram2("abc","ab cc"));

    }

    // Solution 1
    public static boolean isAnagram1 (String str1, String str2){

        // First we can start removing white spaces and create a charArray
        // Then we can sort them out to see if two arrays are equal or not

        char[] arr1 = str1.replaceAll("\\s", "").toLowerCase().toCharArray();
        char[] arr2 = str2.replaceAll("\\s", "").toLowerCase().toCharArray();

        // Sort the char arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Compare the sorted arrays
        return Arrays.equals(arr1, arr2);

    }

    // Solution 2
    public static boolean isAnagram2 (String str1, String str2){

        // We can remove all white spaces and check if the length is the same or not.
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        if(str1.length() != str2.length()){
            return false;
        }

        // Then checking chars one by one
        int [] charCount = new int[26];

        for (int i = 0; i < str1.length(); i++) {
            charCount[str1.charAt(i) - 'a']++;
            charCount[str2.charAt(i) - 'a']--;
        }

        /*
        If the strings are anagrams, the character counts for all letters will be zero,
        indicating that both strings contain the same characters in the same frequencies.
        If any count is non-zero, it means that the strings have different character frequencies and are not anagrams.
         */
        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }

}
