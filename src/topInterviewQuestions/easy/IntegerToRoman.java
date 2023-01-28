package topInterviewQuestions.easy;

public class IntegerToRoman {

    /**
     * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
     *
     * Symbol       Value
     * I             1
     * V             5
     * X             10
     * L             50
     * C             100
     * D             500
     * M             1000
     */

    /*
    Approach
This problem should be very simple to solve. Since the maximum number can be 3999, we can have only four places —
Ones, Tens, Hundreds and Thousands.

Thus, we will create four arrays with all the possible combination of places. Since 0 doesn’t make any impact,
we will put 0th place of every as an empty string.
     */

    public static String intToRoman(int num) {
        String[] M = {"", "M", "MM", "MMM"};
        String[] C = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] X = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] I = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        return M[num / 1000] + C[(num % 1000) / 100] + X[(num % 100) / 10] + I[num % 10];
    }

    public static void main(String[] args) {

        int number = 16;
        System.out.println(intToRoman(number));

    }


}
