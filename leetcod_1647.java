class Solution {
    public int minDeletions(String s) {
		int[] nums = new int[26];
		
		for(char ch : s.toCharArray()) {
			nums[ch-'a']++;
		}
		Arrays.sort(nums);
		
		int target = nums[nums.length-1];
		int cnt = 0;
		for(int i=nums.length-2;i>=0;i--) {
			if(nums[i]==0) break;
			if(nums[i]<target) {
				target = nums[i];
			}else {
				while(nums[i] !=0 && nums[i]>=target ) {
					nums[i]=nums[i]-1;
					cnt++;
				}
				target=nums[i];
			}
		}
        return cnt;
    }
}