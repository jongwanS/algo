package leetcode;

public class leetcode_MaximumAverageSubarrayI_643 {
    static class Solution {
        public double findMaxAverage(int[] nums, int k) {

            double max = Integer.MIN_VALUE;
            double sum = 0;
            int start = 0;
            for (int i=0;i<nums.length;i++){
                sum+=nums[i];
                if(i - start + 1==k){
                    max = Math.max(max,sum/k);
                    sum -= nums[start];
                    start++;
                }
            }

            return max;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
//        int[] nums = {1,12,-5,-6,50,3};
        int[] nums = {-1};
        int k = 1;
        double sss = solution.findMaxAverage(nums,k);
        System.out.println(sss);
    }
}
