package week1;

/**
 * leetcode第11题盛最多水的容器
 */
public class MaxArea {
    public static void main(String[] args) {

    }

    public int maxArea(int[] height) {
        int max = 0;
        int left = 0;
        int right = height.length-1;
        while (left < right){
            int area = Math.min(height[left], height[right]) * (right - left);
            max = Math.max(area, max);
            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        return max;
    }

    public int maxArea1(int[] height) {
        int max = 0;
        int left = 0;
        int right = height.length-1;
        while (left < right){
            max = height[left] > height[right] ? Math.max(max, (right-left)*height[right--]) : Math.max(max, (right-left)*height[left++]);
        }
        return max;
    }
}
