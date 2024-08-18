package leetcode;

class Solution134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int[] costGap = new int[gas.length];
        
        int sum = 0;
        for(int i=0;i<costGap.length;i++){
            costGap[i] = gas[i]-cost[i];
            sum+=costGap[i];
        }
        if(sum < 0){
            return -1;
        }
        
        sum = 0;
        int s = 0;
        for(int i=0;i<costGap.length;i++){
            sum+=costGap[i];
            if(sum < 0){
                s=i+1;
                sum=0;
            }
        }
        
        return s;
    }
}