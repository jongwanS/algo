package leetcode;

class Solution338 {
    public int[] countBits(int n) {
        
        int[] ans = new int[n+1];
		
		for(int i=0;i<=n;i++) {
			
			int cnt = 0;
			int x = i;
			while(x != 0) {
				cnt+= (x&1);
				x=x>>1;
			}
			ans[i] = cnt;
		}
        
        return ans;
    }
}