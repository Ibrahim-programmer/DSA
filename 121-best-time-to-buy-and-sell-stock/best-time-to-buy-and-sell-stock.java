class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int min_p = prices[0];
        for(int price:prices){
            if(price < min_p){
                min_p= price;
            }
            profit = Math.max(profit,price - min_p);
        }
        return profit;
    }
}