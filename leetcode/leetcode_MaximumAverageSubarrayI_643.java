package leetcode;

public class leetcode_MaximumAverageSubarrayI_643 {
    static class Solution {
        public double findMaxAverage(int[] nums, int k) {

            double max = Integer.MIN_VALUE;
            for (int i=0;i<=nums.length-k;i++){
                double sum = 0;
                for(int j=i;j<k+i;j++){
                    sum+=nums[j];
                }
                max = Math.max(sum,max);
            }

            return max/k;
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
