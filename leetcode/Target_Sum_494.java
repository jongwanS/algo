public class Target_Sum_494 {

    int cnt = 0;
    public int findTargetSumWays(int[] nums, int target) {

        recursive(nums,target, 0, 0);

        return cnt;
    }

    public void recursive(int[] nums, int target, int sum,int index){
        if(nums.length == index){
            if(target == sum) cnt++;
            return;
        }
        recursive(nums, target, sum+nums[index], index+1);
        recursive(nums, target, sum-nums[index], index+1);
    }
}