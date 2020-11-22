package week1;

/**
 * leetcode第26. 删除排序数组中的重复项
 */
public class RemoveDuplicates {

    public int removeDuplicates(int[] nums) {
        int end = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] != nums[i+1]){
                nums[++end] = nums[i+1];
            }
        }
        return end + 1;
    }
}
