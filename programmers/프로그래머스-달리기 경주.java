package programmers;

import java.util.*;
class Solution달리기경주 {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = {};
        
        Map<String,Integer> map = new HashMap<>();
        int i = 0;
        for(String player : players){
            map.put(player,i);
            i++;
        }

        for(String calling : callings){
            int idx = map.get(calling);
            String pre = players[idx-1];
            players[idx-1] = players[idx];
            players[idx] = pre;
            map.put(calling, map.get(calling)-1);
            map.put(pre, map.get(pre)+1);
        }

        return players;
    }
    
}
