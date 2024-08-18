package leetcode;

class Solution997 {
    public int findJudge(int n, int[][] trust) {
        
        int target = n-1;
        int[] arr = new int[n+1];
        
        for(int i=0;i<trust.length;i++){
            arr[trust[i][0]] = arr[trust[i][0]]-1;
            arr[trust[i][1]] = arr[trust[i][1]]+1;
        }
        
        for(int i=1;i<arr.length;i++){
            if(arr[i] == target){
                return i;
            }
        }
        
        return -1;
    }
}