package leetcode;

class Solution231 {
    public boolean isPowerOfTwo(int n) {
        //음수나, 0일경우 표현못함
        if(n <= 0) return false;
        
        int cnt = 0;
		while(n >= 1) {
			if((n & 1) == 1) {
                //n과 1을 and 연산을 통해 1의 갯수를 센다.
				cnt++;
			}
			n = n >> 1;//쉬프트 연산 (오른쪽으로 1번 이동)
            if(cnt>1) return false; //2의 제곱일경우 1의 갯수가 1개여야함
		}
		
		return true;
    }
}