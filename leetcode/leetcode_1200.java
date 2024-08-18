package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution1200 {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        //정렬
        Arrays.sort(arr);
        
        List<List<Integer>> res = new ArrayList();
        
        //최소의 차를 구한다.
        int minDif = Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++){
            minDif = Math.min(arr[i+1]-arr[i] , minDif);
        }
        
        //최소의 차와 같은것들을 배열에 넣어준다.
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]-arr[i] == minDif){
                res.add(Arrays.asList(arr[i], arr[i+1]));
            }
        }
        
        return res;
        
    }
}