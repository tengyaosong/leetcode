// at a give integer array, return how many unique elements
// are in the array
// use in-place algorithm
public class _26 {
    public static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int i = 0; // slow pointer
        for (int j = 0; j < nums.length; j++) { // fast pointer, move first
            if (nums[j] != nums[i]) { // if fast = slow, move to next. if !=, update i.
                i++;
                nums[i] = nums[j]; // if !=, update i, meanwhile, replace i with j.
            }
        } return i + 1; // i is the index. the output should be how many elements, so i + 1.
    }
    public static void main (String[] args) {
        int [] nums = {1, 1, 2, 3, 3, 5};
        System.out.println(removeDuplicates(nums));
    }
}
