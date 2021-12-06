package leetcode_gits;

class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        
        /*�Ϲ� �迭 ��ȸ
        
        int idx = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1] < arr[i]){
                idx = i;
            }
        }
        
        return idx;
        */
        
        /*
        1. 배열이 산모양으로 되어있다.
        2. 배열순회보다 분할정복을 활용하여 풀어보자.
        */
        
        int l = 0;
        int r = arr.length-1;
        
        while(l < r ){
            
            int mid = (l+r)/2;
            
            if(arr[mid] < arr[mid+1])
                l = mid+1;
            else
                r = mid;
        }
        
        return l;
    }
}