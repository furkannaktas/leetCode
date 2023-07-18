package topInterviewQuestions.string_tasks;

public class String_Palindrome {

    public static void main(String[] args) {
        System.out.println("isPalindrome1() = " + isPalindrome1("level"));
        System.out.println("isPalindrome2() = " + isPalindrome2("level"));
        System.out.println("isPalindrome1() = " + isPalindrome1("computer"));
        System.out.println("isPalindrome2() = " + isPalindrome2("computer"));
    }

    // Solution 1
    public static boolean isPalindrome1(String str) {

        str = str.toLowerCase();
        return str.equals(new StringBuilder(str).reverse().toString());
        /*
        The code uses the StringBuilder class to create a reversed version of the string
        Then creates a new StringBuilder object with the original string and then reverses it.
        The toString() method is called to obtain the reversed string as a String object.
         */
    }

    // Solution 2
    public static boolean isPalindrome2(String str) {

        String reversedStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr += str.charAt(i);
        }
        boolean isPalindrome2 = str.equals(reversedStr);
        return isPalindrome2;
    }

}
