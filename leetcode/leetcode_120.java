package leetcode;

import java.util.List;

class Solution120 {
    public int minimumTotal(List<List<Integer>> triangle) {
        /**
           2
          3 4
         6 5 7
        4 1 8 3
        */
        
        for(int i=triangle.size()-1;i>=0;i--){
            for(int j=0;j<triangle.get(i).size()-1;j++){
                int before = triangle.get(i).get(j);
                int after = triangle.get(i).get(j+1);
                triangle.get(i-1).set(j, triangle.get(i-1).get(j)+ Math.min(before,after));
            }
        }
        return triangle.get(0).get(0);
    }
}