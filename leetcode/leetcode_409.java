package leetcode;

import java.util.HashMap;
import java.util.Map;

class Solution409 {
    public int longestPalindrome(String s) {
        
        Map<Character, Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0) +1);
        }
        
        int res = 0;
        boolean oddYn = false;
        for(char key : map.keySet()){
            int n = map.get(key);
            if(n%2 == 0){
                res+=n;
            }else{
                res+=n-1;                
                oddYn = true;
            }
        }
        if(oddYn){
            res++;
        }
        return res;
    }
}