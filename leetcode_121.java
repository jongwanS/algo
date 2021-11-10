class Solution {
    public int maxProfit(int[] prices) {
        /****
        
        시간초과
        
        int max = 0;
        for(int i=0;i<prices.length;i++){
            
            int r = i+1;
            while(r <= prices.length-1){
                max = Math.max(max,prices[r] - prices[i]);
                r++;
            }
        }
        
        return max;
        ***/
        /**
        1. 구매최소값을 갱신한다.
        2. 배열을 순회하면서, 배열의 원소값 - 최소값 의 최대값을 갱신한다.
        **/
        int maxProfit = 0;
        int minBuy= Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            
            minBuy = Math.min(minBuy, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - minBuy);
            
        }
        
        return maxProfit;
    }
}