package week4;

import java.util.Arrays;

/**
 * 455. 分发饼干
 */
public class FindContentChildren {
    public int findContentChildren(int[] g, int[] s) {
        if (g == null || g.length == 0){
            return 0;
        }
        if (s == null || s.length ==0){
            return 0;
        }
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < g.length && j < s.length){
            if(s[j] >= g[i]){
                i++;
                j++;
                count++;
            }else {
                j++;
            }
        }
        return count;
    }
}
