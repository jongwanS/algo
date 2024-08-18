package leetcode;

class Solution121_2 {
    public int maxProfit(int[] prices) {
        
        int l = 0;//최소값을 저장할 포인터
        int sum = 0;//최대 이익 profit 값
        for(int i=1;i<prices.length;i++){
            if(prices[l] >= prices[i]) l = i;//최소값을 갱신해준다.
            else sum = Math.max(sum, prices[i] - prices[l]);
        }
        if(l==prices.length) return 0;//특정날에 사도 최대이득을 볼수없을때
        
        return sum;
    }
}