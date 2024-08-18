package leetcode;

class Solution1217 {
    public int minCostToMoveChips(int[] position) {
        
        int oddCnt = 0;
        int evenCnt = 0;
        
        for(int i=0;i<position.length;i++){
            if(position[i]%2==0) evenCnt++;
            else oddCnt++;
        }
        return Math.min(oddCnt,evenCnt);
    }
}