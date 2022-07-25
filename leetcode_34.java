class Solution {
    public int[] searchRange(int[] nums, int target) {

        return binarySearch(nums, target);
    }

    private int[] binarySearch(int[] nums, int target ){

        int l = 0;
        int r = nums.length-1;
        int mid;
        while(l<=r){

            mid = (l+r)/2;
            if(nums[mid] == target){
                int left = mid;
                int right = mid;
                while(left >= 0 && nums[left] == target) left--;
                while(right <= nums.length-1 && nums[right] == target) right++;
                return new int[]{++left, --right};
            }else if(nums[mid] < target){
                l = mid+1;
            }else if(nums[mid] > target){
                r = mid-1;
            }
        }

        return new int[]{-1,-1};
    }
}