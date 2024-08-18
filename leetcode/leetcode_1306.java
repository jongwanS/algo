package leetcode;

class Solution {
    public boolean canReach(int[] arr, int start) {
        
        if(start < 0 || arr.length <= start){
        	//배열의 인덱스값이 배열크기를 넘지않도록
            return false;
        }
        if(arr[start] < 0){
        	//arr[start] = -arr[start] 체크, 이미 방문했던 인덱스를 다시 돌면 무한루프를 돌것이기때문
            return false;
        }
        if(arr[start]==0){
        	//정답을 찾았을때, 
            return true;
        }
        arr[start] = -arr[start];//방문했다고 기록을한다.
        int left = start+arr[start];
        int right = start-arr[start];
        boolean la = canReach(arr,left);
        boolean ra = canReach(arr,right);
        return la||ra; 
    }
}