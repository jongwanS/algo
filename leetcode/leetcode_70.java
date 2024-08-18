package leetcode;

class Solution70 {
    public int maxSubArray(int[] nums) {
        //[-2,1,-3,4,-1,2,1,-5,4]
        int subSum = nums[0];
        int max = nums[0];
        
        for(int i=1;i<nums.length;i++){
            
            /*
                문제는 subArray의 최대값 구하기이다
                i == 1 : 현재 까지의 부분배열합의 최대값은 -2, 최대값도 -2
                         i인덱스값과, 부분배열최대값+i인덱스값을 비교하여,
                         더 큰수를 부분합에 넣어준다.
                         따라서, subSum = 1, max =1 이된다.
                i == 2 : 현재 부분배열합 최대 1, max 1
                         i인덱스값과, 부분배열합 최대+i인덱스값 비교하여 큰수를 넣는다.
                         따라서, subSum = -2, max 값은 그대로 1이다.
                         
                i == 3 : i인덱스값과, 부분배열합 최대+i인덱스값 비교하여 큰수 넣기
                         따라서, subSum = 4, max = 4 가 된다.
                ...
                
                # max 값이 갱신된 이후 인덱스의 subArr 합들을 계속 더해주면된다.
            */
            subSum = Math.max(nums[i], subSum + nums[i]);
            max = Math.max(max, subSum);
        }
        
        return max;
    }
}