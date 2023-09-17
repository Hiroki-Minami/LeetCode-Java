package org.example.org.problems;

public class BestTimeToBuyAndSellStockWithTransactionFee {
    public int maxProfit(int[] prices, int fee) {
        int[] free = new int[prices.length];
        int[] hold = new int[prices.length];

        hold[0] = -prices[0];
        for (int i = 1; i < prices.length; i++) {
            hold[i] = Math.max(hold[i-1], free[i-1] - prices[i]);
            free[i] = Math.max(free[i-1], hold[i-1] + prices[i] - fee);
        }
        return free[prices.length - 1];
    }
}
