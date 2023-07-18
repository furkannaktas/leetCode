package topInterviewQuestions.easy;

public class IsPalindrome_Recursion2 {

    public static boolean isPalindrome(String str){

        if(str.length()<2){
            return true;
        } else {
            if(str.charAt(0) != str.charAt(str.length()-1)){
                return false;
            } else {
                return isPalindrome(str.substring(1,str.length()-1));
            }
        }
    }


    public static void main(String[] args) {

        String str1 = "kayak";
        String str2 = "madamimadam";
        String str3 = "a";
        String str4 = "whatever the word is";

        System.out.println( "Is "+ str1 + " palindrome? = " +isPalindrome(str1));
        System.out.println( "Is "+ str2 + " palindrome? = " +isPalindrome(str2));
        System.out.println( "Is "+ str3 + " palindrome? = " +isPalindrome(str3));
        System.out.println( "Is "+ str4 + " palindrome? = " +isPalindrome(str4));
    }
}
