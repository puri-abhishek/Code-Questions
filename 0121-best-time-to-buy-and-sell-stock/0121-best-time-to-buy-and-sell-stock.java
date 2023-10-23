
/*
-----------------------------------------------------------------TIME LIMIT EXCEEDED--------------------------------------------------------------------
class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        for(int i = 0; i < prices.length; i++){
            for(int j = i; j < prices.length; j++){
                if((prices[i] - prices[j] < 0) && Math.abs(prices[i] - prices[j]) > max){
                    max = Math.abs(prices[i] - prices[j]);
                }
            }
        }
        return max;
    }
}
------------------------------------------------------------------------------------------------------------------------------------------------------*/
class Solution {
    public int maxProfit(int[] prices)
    {
        int buy = Integer.MAX_VALUE, sell = 0;
        for(int i = 0; i < prices.length; i++)
        {
            buy = Math.min( buy, prices[i] );
            sell = Math.max(sell, prices[i] - buy );
        }
        return sell;
    }
}