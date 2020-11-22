package week1;

/**
 * leetcode第70题爬楼梯
 */
public class ClimbStairs {

    public int climbStairs(int n) {
        if(n == 1){
            return 1;
        }
        if(n == 2){
            return 2;
        }
        return climbStairs(n-1) + climbStairs(n-2);
    }

    public int climbStairs1(int n) {
        int c1 = 1;
        int c2 = 2;
        if(n == 1 || n ==2){
            return n;
        }
        for (int i = 0; i < n-2; i++) {
            int temp = c2;
            c2 = c1 + c2;
            c1 = temp;
        }
        return c2;
    }
}
