public class BuyAndSell{
    public static void buyAndSellStocks(int []prices){
        int buyPrice = Integer.MAX_VALUE ;
        int maxProfit = 0;
        int sellingPrice = Integer.MIN_VALUE ;
        for(int i = 0 ; i < prices.length ; i++){
            if(buyPrice < prices[i]){
                int profit = prices[i] - buyPrice ;
                maxProfit = Math.max(profit , maxProfit);
                sellingPrice =Math.max(sellingPrice, prices[i]);
            }
            else{
                buyPrice = prices[i];
            }
        }
        System.out.println("the max profit of stock, by buying stock on " + buyPrice + " "+ "and selling it on "+ sellingPrice +" = " + maxProfit);
    }
    public static void main(String args[]){
        int prices[] = {7,1,5,3,6,4};
        buyAndSellStocks(prices);
        }
}