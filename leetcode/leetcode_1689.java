package leetcode;

class Solution1689 {
    public int minPartitions(String n) {
        
		int max = Integer.valueOf(n.charAt(0)-'0');
		int subMax = max;
		for(int i=1;i<n.length();i++) {
			int num = Integer.valueOf(n.charAt(i)-'0');
			if(max < num) {
				subMax += num-subMax;
				max = num;
			}
		}
        
        return subMax;
    }
}