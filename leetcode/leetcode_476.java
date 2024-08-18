package leetcode;

class Solution476 {
    public int findComplement(int num) {
        int bitLen = Integer.toBinaryString(num).length(); 
		int nNum = ~num;
		
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<bitLen;i++) {
			sb.append(nNum&1);
			nNum = nNum>>1;
		}
		
		return Integer.parseInt(sb.reverse().toString(), 2);
    }
}

class Solution476_1 {
    public int findComplement(int num) {
		int mask = -1;
		while ((num & mask) != 0) {
			mask <<= 1;
		}
		
		return ~(num ^ mask); //~num & ~mask
    }
}
