package leetcode;

class Solution1009 {
    public int bitwiseComplement(int n) {
        
        //00000000000000000000000000000 101 :  n
        //00000000000000000000000000000 111
        /*
        초기
        n    00000000000000000000000000000101
        mask 00000000000000000000000000000000
        
        1회
        n    00000000000000000000000000000010
        mask 00000000000000000000000000000001
           
        2회
        n    00000000000000000000000000000001
        mask 00000000000000000000000000000011
           
        3회
        n    00000000000000000000000000000000
        mask 00000000000000000000000000000111
        */
        String str = Integer.toBinaryString(n);
        StringBuilder sb = new StringBuilder();
        for(char ch : str.toCharArray()){
            if(ch == '0')sb.append('1');
            else sb.append('0');
        }
        
        return Integer.parseInt(sb.toString(),2);
    }
}