package leetcode;

import java.util.ArrayList;
import java.util.List;

class Solution728 {
    public List<Integer> selfDividingNumbers(int left, int right) {
        
        List<Integer> res = new ArrayList<>();
        
        for(int i=left;i<=right;i++){
            if(checkDivingNumber(i)){
                res.add(i);
            }
        }
        
        return res;
    }
    
    public boolean checkDivingNumber(int n){
        
        int num = n;
        while(num != 0){
            int remains = num%10;
            num=num/10;
            if(remains == 0 || n%remains != 0){
                return false;
            }
        }
        
        return true;
    }
}