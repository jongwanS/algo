class Solution {
    public boolean validMountainArray(int[] arr) {
        //최고값의 인덱스를 구한다.
        int top = 0;
        int topIdx = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > top){
                top = arr[i];
                topIdx = i;
            }
        }
        //최고값의 인덱스가 배열의 첫번째거나, 맨마지막일경우 return false;
        if(topIdx == 0 || topIdx == arr.length-1 ) return false;
            
        //최고점까지, 배열의 값이 계속올라가는지 체크
        for(int i=1;i<=topIdx;i++){
            if(arr[i-1] >= arr[i]) return false;
        }
        //최고점에서 배열의 길이 마지막까지 값이 계속내려가는지 체크
        for(int i=topIdx+1;i<=arr.length-1;i++){
            if(arr[i-1] <= arr[i]) return false;
        }
        
        return true;
    }
}