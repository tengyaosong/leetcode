//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//You can return the answer in any order.

import java.util.Arrays;

public class _1 {
    public static int[] twoSum(int[] nums, int target) {
        int result[] = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (((nums[i] + nums[j]) == target)) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 5};
        int target = 9;
        _1 test = new _1();
        int[] a = _1.twoSum(nums, target);
        System.out.println(Arrays.toString(a));
    }
}
