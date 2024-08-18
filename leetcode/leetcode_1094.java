package leetcode;

import java.util.Map;
import java.util.TreeMap;

//풀이 1
class Solution1094 {
    public boolean carPooling(int[][] trips, int capacity) {
        
        int[] range = new int[1001];
        
        for(int[] trip : trips){
            int passN = trip[0];
            int start = trip[1];
            int end = trip[2];
            
            for(int i=start;i<end;i++){
                range[ i ]+=passN;
            }
            
        }
        
        for(int i=0;i<range.length;i++){
            if(range[i] > capacity){
                return false;
            }
        }
        return true;
    }
}

//풀이 2
class Solution1094_2 {
    public boolean carPooling(int[][] trips, int capacity) {
        
        //Comparator 미선언시, key로 정렬하여 넣어줌
        Map<Integer, Integer> map = new TreeMap<>();
        
        for(int[] trip : trips){
            int pass = trip[0]; //사람수
            int start = trip[1]; //시작
            int end = trip[2]; //끝
            
            //시작점에 승객수 -, 종료점에 승객수 +
            map.put( start , map.getOrDefault(start,0) - pass );
            map.put( end , map.getOrDefault(end,0) + pass );
        }
        
        for(int v : map.values()){
            capacity+=v;
            if(capacity < 0){
                return false;
            }
        }
        
        return true;
    }
}