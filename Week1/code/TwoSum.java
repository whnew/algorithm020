package week1;

import java.util.HashMap;
import java.util.Map;

/**
 * leetcode第1题两数之和
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        if(nums == null || nums.length ==0){
            return null;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            Integer temp = map.get(target-nums[i]);
            if (temp != null && temp != i){
                result[0] = i;
                result[1] = temp;
                return result;
            }
        }
        return null;
    }
}
