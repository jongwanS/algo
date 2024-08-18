package programmers;

import java.util.*;
class Solution추억점수 {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        Map<String,Integer> names = new HashMap<>();
        for(int i=0;i<name.length;i++){
            names.put(name[i], yearning[i]);
        }

        int idx = 0;
        for(String[] photos : photo){
            int sum = 0;
            for(String str : photos){
                sum+=names.getOrDefault(str,0);
            }
            answer[idx++] = sum;
        }


        return answer;
    }
}
