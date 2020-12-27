package week5;

/**
 * 91. 解码方法
 */
public class NumDecodings {
    public int numDecodings(String s) {
        if (s == null || s.length() == 0 || s.charAt(0) == '0'){
            return 0;
        }
        int[] dp = new int[s.length()];
        dp[0] = 1;
        for (int i = 1; i < s.length(); i++) {
            if(s.charAt(i) == '0'){
                if (s.charAt(i-1) > '2'){
                    return 0;
                }else {
                    dp[i] = dp[i-1];
                }
            }else if(s.charAt(i-1) == '1' || (s.charAt(i-1) == '2' && s.charAt(i) >= '1' && s.charAt(i) <= '6')){
                int pre = i-2 < 0 ? 1 : dp[i-2];
                dp[i] = dp[i-1] + pre;
            }else {
                dp[i] = dp[i-1];
            }
        }
        return dp[s.length()-1];
    }
}
