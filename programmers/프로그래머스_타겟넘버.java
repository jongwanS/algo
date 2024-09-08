package programmers;

public class 프로그래머스_타겟넘버 {

    static class Solution {
        private int answer = 0;
        public int solution(int[] numbers, int target) {


            dfs(numbers, target, 0,0);

            return answer;
        }

        public void dfs(int[] numbers,int target, int sum, int index){

            if(index == numbers.length){
                return;
            }
            if(sum == target){
                answer++;
                return;
            }

            dfs(numbers, target, sum + numbers[index], index+1);
            dfs(numbers, target, sum - numbers[index], index+1);

        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] numbers = {1,1,1,1,1};
        int target = 3;
        solution.solution(numbers, target);
    }
}
