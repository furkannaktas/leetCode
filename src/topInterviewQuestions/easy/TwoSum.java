package topInterviewQuestions.easy;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    /**
     * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
     * You may assume that each input would have exactly one solution, and you may not use the same element twice.
     * You can return the answer in any order.
     */

    /**
     *Example 1:
     * Input: nums = [2,7,11,15], target = 9
     * Output: [0,1]
     * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
     */

    public static void main(String[] args) {

        int [] nums = {2,3,4,8};
        int target = 12;
        System.out.println(Arrays.toString(twoSumFirstSolution(nums, target)));

        System.out.println(Arrays.toString(twoSumSecondSolution(nums, target)));

    }


    //Solution 1
    public static int[] twoSumFirstSolution(int[] nums, int target) {

    /*
      Loop through each element in nums and then loop through each element again
      to find if there is a value that equals target - nums[i]
     */

        int[] indexes = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target- nums[i]) {
                    indexes[0] = i;
                    indexes[1] = j;
                    return indexes;
                }
            }
        }
        return indexes;
    }


    //Solution2
    public static int[] twoSumSecondSolution(int[] nums, int target) {

            HashMap<Integer, Integer> map = new HashMap<>();
            int[] indexes = new int[2];

            for (int i = 0; i < nums.length; i++) {
                if (map.containsKey(target - nums[i])) {
                    indexes[0] = map.get(target - nums[i]);
                    indexes[1] = i;
                    return indexes;
                }
                map.put(nums[i], i);
            }
            return indexes;
        }
    }

