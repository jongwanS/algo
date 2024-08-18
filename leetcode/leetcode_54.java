package leetcode;

import java.util.ArrayList;
import java.util.List;

class Solution54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        ArrayList<Integer> res = new ArrayList<>();
		int left = 0;
		int right = matrix[0].length-1;
		int top = 0;
		int bottom = matrix.length-1;
		
		while(true) {
			//오른쪽
			for(int i=left;i<=right;i++) {
				res.add(matrix[left][i]);
			}
			top++;
			if(top > bottom) break;
			
            //아래
			for(int i=top;i<=bottom;i++) {
				res.add(matrix[i][right]);
			}
			right--;
			if(left > right) break;
            
            //왼쪽
			for(int i=right;i>=left;i--) {
				res.add(matrix[bottom][i]);
			}
			bottom--;
			if(top > bottom) break;
            
            //위로
			for(int i=bottom;i>=top;i--) {
				res.add(matrix[i][left]);
			}
			left++;
            if(left > right) break;
		}
        return res;
    }
}