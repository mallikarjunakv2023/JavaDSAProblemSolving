package programs;

public class StockBuySell {
    public int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE;
        int op = 0;
        int profit = 0;
        for(int i = 0; i < prices.length; i++){
            if(prices[i] < buy ){
                buy = prices[i]; //[7,1,5,3,6,4]
            }
            profit = prices[i] - buy;
            if(op < profit){
                op = profit;
            }
        }
        return op;
    }
}
