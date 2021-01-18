package week9;

/**
 * 5. 最长回文子串
 */
public class LongestPalindrome {
    public String longestPalindrome(String s) {
        if(s == null || s.length() == 0){
            return null;
        }
        int start = 0;
        int max = 0;
        boolean[][] dp = new boolean[s.length()][s.length()];
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j + i< s.length(); j++) {
                int k = j + i;
                if(i == 0){
                    dp[j][k] = true;
                }else if (i == 1) {
                    dp[j][k] = s.charAt(j) == s.charAt(k);
                }else{
                    dp[j][k] = dp[j + 1][k - 1] && s.charAt(j) == s.charAt(k);
                }
                if(k - j > max && dp[j][k]){
                    start = j;
                    max = k - j;
                }
            }
        }
        return s.substring(start, start + max + 1);
    }
}
