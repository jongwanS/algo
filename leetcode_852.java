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
        1. �迭�� �������� �Ǿ��ִ�.
        2. �迭��ȸ���� ���������� Ȱ���Ͽ� Ǯ���.
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