package leetcode;

import java.util.HashSet;
import java.util.Set;

class Solution409_2 {
    public int longestPalindrome(String s) {
        
	    /**
	        문제 : 최대의 Palindrome 을 만들어라
	        풀이 : 스트링 s 에 대해 짝수인 char에 대해 모두 제거.
	           (짝수의 경우 최대 Palindrome을 만들기위해 무조건 사용)
               set에는 홀수의 char 들만 남아있다.
               즉, abababdd 일경우 a,b 만 남을것이다.
               나머지 a 2개, b 2개, d 두개는 최대 Palindrome을 만들기위해 사용
               스트링 s에서 Palindrome을 만들수 없는 두수를 제외시킨다.
               하지만, 홀수의 수가 하나 들어가도 Palindrome을 만들수 있기 때문에 +1을 더해준다.
               예를들어 aacaa 이것도 Palindrome임.
        */
        Set<Character> set = new HashSet<>();
        
        for(char ch : s.toCharArray()){
            if(set.contains(ch)){
                set.remove(ch);
            }else{
                set.add(ch);
            }
        }
        
        int evenNum = s.length() - set.size();
        
        if(!set.isEmpty()) evenNum++;
        return evenNum;
    }
}