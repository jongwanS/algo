package programmers;

import java.util.LinkedList;
import java.util.Queue;

public class 프로그래머스_숫자변환하기 {

    static class Solution {
        public int solution(int x, int y, int n) {
            // BFS를 이용하여 x에서 y로 가는 최소 연산 횟수를 찾음
            return solve(x, y, n);
        }

        public int solve(int x, int y, int n){

            Queue<int[]> que = new LinkedList<>();
            que.add(new int[]{x, 0});
            boolean[] visited = new boolean[y+1];

            while(!que.isEmpty()){

                int[] arr = que.poll();
                int num = arr[0];//중간계산 결과값
                int cnt = arr[1];//연산횟수

                if(num == y) return cnt;

                //+5
                if(num+n <= y && !visited[num+n]){
                    que.add(new int[]{num+n, cnt+1});
                    visited[num+n] = true;
                }

                //x2
                if(num*2 <= y && !visited[num*2]){
                    que.add(new int[]{num*2, cnt+1});
                    visited[num*2] = true;
                }

                //x3
                if(num*3 <= y && !visited[num*3]){
                    que.add(new int[]{num*3, cnt+1});
                    visited[num*3] = true;
                }
            }


            return -1;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution(10,40,5);
    }
}
