class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0; 
        int bestBuy = prices[0];  // 0 index ka element
        int n=prices.length;

        for(int i=1; i<n; i++){
            if(prices[i] > bestBuy){  // reason to sell
            maxProfit = Math.max(maxProfit, prices[i]-bestBuy);
            } else{    // reason to buy at lowest price
            bestBuy = Math.min(bestBuy, prices[i]);
            }
        }
        return maxProfit;
    }
}