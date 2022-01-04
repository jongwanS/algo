class Solution {
    public int bitwiseComplement(int n) {
        
        /*
        초기
        n    00000000000000000000000000000 101
        mask 00000000000000000000000000000 000
        
        1회
        n    00000000000000000000000000000 101
        mask 00000000000000000000000000000 001
           
        2회
        n    00000000000000000000000000000 101
        mask 00000000000000000000000000000 011
           
        3회
        n    00000000000000000000000000000 101
        mask 00000000000000000000000000000 111
        */
        if(n == 0) return 1;
            
        int mask = 0;
        while(n > mask){
            mask = (mask<<1)+1;
        }
        
        return n^mask;
    }
}