package week1;

/**
 * leetcode第189. 旋转数组
 */
public class Rotate {
    public void rotate(int[] nums, int k) {
        for (int i = 0; i <k ; i++) {
            int end = nums[nums.length-1];
            for (int j = nums.length-2; j >= 0 ; j--) {
                nums[j+1] = nums[j];
            }
            nums[0] = end;
        }
    }

    public void rotate1(int[] nums, int k) {
        k = k%nums.length;
        reverse(nums, 0 ,nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
    }

    public  void reverse(int[] nums, int start, int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
