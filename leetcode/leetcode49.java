package leetcode;

import java.util.*;

class Solution49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        
		Map<String, List<String>> map = new HashMap<>();
		
		for(String str : strs) {
			
			char[] s = str.toCharArray();
			Arrays.sort(s);
			String key = new String(s);
			if(!map.containsKey(key)) {
				map.put(key, new ArrayList<>());
				map.get(key).add(str);
			}else {
				map.get(key).add(str);
			}
			
		}
        
        return new ArrayList<>(map.values());
    }
}