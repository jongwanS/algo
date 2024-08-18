package leetcode;

class Solution461 {
    public int hammingDistance(int x, int y) {
        
        //xor 연산진행, 두 int 이진수로 변경후, 같은 자리수의 값이 다른것들
        int xor = x^y; 
        
        /*
        이진수의 최대 길이는 Integer.MAX_VALUE 는 31이다.
        (5 >> 0 ) & 1  : 0101 & 0001 = 0001
        (5 >> 1 ) & 1  : 0010 & 0001 = 0000
        (5 >> 2 ) & 1  : 0001 & 0001 = 0001
        ....
        
        각기 다른 비트의 총갯수를 구한다.
        
        */
		int count = 0;
	    for (int i=0;i<32;i++) {
	    	count = count + ((xor >> i) & 1);
	    }
        
        return count;

    }
}