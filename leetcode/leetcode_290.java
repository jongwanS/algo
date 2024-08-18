package leetcode;

import java.util.HashMap;
import java.util.Map;

class Solution290 {
    public boolean wordPattern(String pattern, String s) {
        
        Map<Character, String> map = new HashMap<>();
        String[] arr = s.split(" ");
        
        //길이가 다를경우 ex) pattern = abba, str = aa bb bb aa aa 
        if(pattern.length() != arr.length) return false;
        
        //pattern=abba, str=dog dog dog dog 이런 케이스에도 false 
        for(int i=0;i<pattern.length();i++){
            if(map.containsKey(pattern.charAt(i))){
            	//이미 선언된 키값에, value값이 변경되는경우
                if( !map.get(pattern.charAt(i)).equals(arr[i]) ) return false;                
            }else{
                if(map.containsValue(arr[i])){
                	//이미 선언된 키값에, value값이 같은경우
                    return false;
                }
                map.put(pattern.charAt(i), arr[i]);
            }
        }
        
        return true;
    }
}