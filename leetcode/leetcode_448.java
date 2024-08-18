package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();
        
        int n = nums.length;
        Set<Integer> set = new HashSet();
        for(int i : nums){
            set.add(i);
        }
        for(int i=1;i<n+1;i++){
            if(!set.contains(i)){
                res.add(i);
            }
        }
               
        return res;
    }
}