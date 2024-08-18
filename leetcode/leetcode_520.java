package leetcode;

class Solution520 {
    public boolean detectCapitalUse(String word) {
        
        char[] chArr = word.toCharArray();
        int cnt=0;
        for(int i=1;i<chArr.length;i++){
            char ch = chArr[i];
            if( Character.isUpperCase(ch) ){
                cnt++;
            }else{
                cnt--;
            }
        }
        if(cnt > 0){
            char ch = chArr[0];
            if( Character.isLowerCase(ch) ) return false;
        }
        
        if( Math.abs(cnt) != chArr.length-1 ) return false;
        
        
        return true;
    }
}