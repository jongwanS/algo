package programmers;

import java.util.Arrays;

public class 시소짝꿍 {

    static class Solution {
        public long solution(int[] weights) {
            long answer = 0;
            Arrays.sort(weights);
            for(int i=0;i<weights.length-1;i++){
                int stand = weights[i];
                for (int j=i+1;j<weights.length;j++){
                    int compare = weights[j];

                    if(stand*2 < compare){
                        break;
                    }

                    if(stand == compare){
                        answer++;
                        continue;
                    }

                    if(stand*4 == compare*2){
                        answer++;
                        continue;
                    }

                    if(stand*3 == compare*2){
                        answer++;
                        continue;
                    }

                    if(stand*4 == compare*3){
                        answer++;
                        continue;
                    }
                }
            }

            return answer;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        solution.solution(new int[]{100, 180, 360, 100, 270});
    }
}


