package week4;

/**
 * 122. 买卖股票的最佳时机 II
 */
public class MaxProfit {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0){
            return 0;
        }
        int profit = 0;
        for (int i = 0; i < prices.length-1; i++) {
            if (prices[i+1] > prices[i]){
                profit = profit + (prices[i+1]-prices[i]);
            }
        }
        return profit;
    }
}
