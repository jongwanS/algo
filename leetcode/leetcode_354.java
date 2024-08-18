package leetcode;

import java.util.Arrays;

class Solution354 {
    public int maxEnvelopes(int[][] envelopes) {
        Arrays.sort(envelopes, (o1, o2)->{
			return o1[0]-o2[0] == 0 ? o2[1]-o1[1] :o1[0]-o2[0]; 
		});
		
        int[] tails = new int[envelopes.length];
        int size = 0;
        
		for(int[] enve : envelopes){
            int i = 0, j = size;
            while(i < j){
                int mid = (i+j)/2;
                if(tails[mid] < enve[1]){
                    i = mid+1;
                }else{
                    j = mid;
                }
            }
            tails[i] = enve[1];
            if(i == size) {
            	size++;
            }
            
        }
        
        return size;
    }
}