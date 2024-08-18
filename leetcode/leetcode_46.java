package leetcode;

import java.util.ArrayList;
import java.util.List;

class Solution46 {
    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> result = new ArrayList<>();
        
        
        dfs(result, nums, new ArrayList<>());
        
        return result;
    }
    
    public void dfs(List<List<Integer>> result,int[] nums, List<Integer> arr){
        if(nums.length == arr.size()){
            result.add(new ArrayList<>(arr));
        }
        
        for(int i : nums){
            if(!arr.contains(i)){
                arr.add(i);
                dfs(result, nums, arr);
                arr.remove(arr.size()-1);
            }
        }
        
        
    }
}