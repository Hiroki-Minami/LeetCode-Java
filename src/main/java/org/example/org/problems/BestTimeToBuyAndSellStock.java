package org.example.org.problems;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int bought = prices[0];

        for (int i = 1; i < prices.length; i++) {
            if (bought > prices[i]) {
                bought = prices[i];
            } else {
                profit = Math.max(profit, prices[i] - bought);
            }
        }
        return profit;
    }
}
