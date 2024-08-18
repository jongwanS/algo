package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Solution56 {
    public int[][] merge(int[][] intervals) {
        
        //2차원 배열 정렬( 이차원 배열중,[k][m] k값을 기준으로 정렬)
        //[1,4],[0,5] 이러한 데이터가 있을경우 대비
        Arrays.sort(intervals, Comparator.comparingInt(o1 -> o1[0]));
        
        List<ArrayList<Integer>> list = new ArrayList<>();
        for(int i=0;i<intervals.length;i++){
            int s1 = intervals[i][0];
            int e1 = intervals[i][1];
            for(int j=i+1;j<intervals.length;j++){
                int s2 = intervals[j][0];
                int e2 = intervals[j][1];
               	//앞인덱스 끝값 > 현재인덱스 시작값은 merge 대상
                if(e1 >= s2){
                	//[1,4][2,3] 이러한 반례가 있으므로
                    e1 = Math.max(e1,e2);
                    i++;
                }else {
                	break;
                }
            }
            list.add(new ArrayList<>(Arrays.asList(s1,e1)));
        }
        int[][] res = new int[list.size()][2];
        for(int i=0;i<list.size();i++){
            for(int j=0;j<list.get(i).size();j++){
                int s = list.get(i).get(j);
                res[i][j] = s;
            }
            
        }
        
        return res;
    }
}