package leetcode;

import java.util.HashMap;
import java.util.Map;

class Solution748 {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        
        //알파벳 소문자만 추린다.
		StringBuilder sb = new StringBuilder();
		for(char ch : licensePlate.toCharArray()) {
			if(Character.isAlphabetic(ch)) {
				sb.append(Character.toLowerCase(ch));
			}
		}
		licensePlate = sb.toString();
		
        //각 char를 맵에 저장한다.
		Map<Character,Integer> map = new HashMap<>();
		for(char ch : licensePlate.toCharArray()) {
			if(!map.containsKey(ch)) {
				map.put(ch, 1);
			}else {
				map.put(ch, map.get(ch)+1);
			}
		}
		
        //맵에 들어가있는 총 알파벳 갯수의합
		int mapSum = licensePlate.length();
		
        //최대 length 로 잡는다.
		String str = "9999999999999999999";
		for(int i =0; i< words.length;i++) {
			int alphaCnt = 0;
			
			Map<Character,Integer> copyMap = new HashMap<>(map);
			 
			
			for(char ch : words[i].toCharArray()) {
				if(copyMap.containsKey(ch) && copyMap.get(ch) > 0) {
					copyMap.put(ch, copyMap.get(ch)-1);
					alphaCnt++;
				}
				if(mapSum == alphaCnt) {
                    //맵에 저장된 캐릭터가 전체가 해당 스트링에 있을경우
					if(str.length() > words[i].length()) {
                        //스트링 갱신
						str = words[i];
					}
					
					break;
				}
			}
			
		}
        
        return str;
    }
}