package Day4;

public class Solution {
    public int maxProfit(int[] prices) {
        int bPrice = Integer.MAX_VALUE;
        int sPrice = 0;
        for(int i=0; i<prices.length; i++){
            bPrice = Math.min(bPrice, prices[i]);
            sPrice = Math.max(sPrice, prices[i]-bPrice);
        }
        return sPrice;
    }
}