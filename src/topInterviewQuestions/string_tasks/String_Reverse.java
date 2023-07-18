package topInterviewQuestions.string_tasks;

public class String_Reverse {

    public static void main(String[] args) {

    }

    // We use the StringBuilder class to efficiently build the reversed string,
    // as StringBuilder provides mutable string operations, making it more efficient than
    // repeatedly concatenating strings with the + operator.

    // Solution 1
    public static String reverseString1(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    // Solution 2
    public static String reverseString2(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }

    // Solution 3
    public static String StrReverse(String str) {

        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.toCharArray()[i];
        }
        return reverse;
    }


}
