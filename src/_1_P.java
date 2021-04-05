import java.util.Arrays;

//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//You can return the answer in any order.
public class _1_P {
    public static int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    res[0] = i;
                    res[1] = j;
                }
            }
            return res;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 5};
        int target = 9;
        _1_P test = new _1_P();
        int[] a = _1_P.twoSum(nums, target);
        System.out.println(Arrays.toString(a));

    }
}
