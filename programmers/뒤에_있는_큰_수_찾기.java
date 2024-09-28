package programmers;

import java.util.Stack;

public class 뒤에_있는_큰_수_찾기 {

    static class Solution {
        public int[] solution(int[] numbers) {
            int[] answer = new int[numbers.length];

            Stack<Integer> st = new Stack<>();
            st.push(0);

            for(int i=1;i<numbers.length;i++){

                while(!st.isEmpty() && numbers[st.peek()] < numbers[i]){
                    answer[st.pop()] = numbers[i];
                }
                st.push(i);
            }

            while(!st.isEmpty()){
                answer[st.pop()] = -1;
            }


            return answer;
        }
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {2, 3, 3, 5};
        solution.solution(arr);
    }
}
