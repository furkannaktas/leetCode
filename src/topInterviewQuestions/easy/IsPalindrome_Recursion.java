package topInterviewQuestions.easy;

public class IsPalindrome_Recursion {

    // Write a recursive method that returns a boolean value if the String is palindrome or not
    public static boolean isPalindrome(String str){
        String reverse = reverseString(str);
        if(str.equals(reverse)){
            return true;
        }
        return false;
    }

    public static String reverseString(String str){

        if(str == null || str.isEmpty()){
            return str;
        }

        return str.charAt(str.length()-1) + reverseString(str.substring(0,str.length()-1));
    }


    public static void main(String[] args) {

        String str = "ada";
        System.out.println("Is "+ str + " palindrome ? = " + isPalindrome(str));
    }

}
