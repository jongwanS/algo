package leetcode;

class Solution605 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        
        for(int i=0; i<flowerbed.length;){
            
            if( flowerbed[i] == 1 ){
                i+=2;
            }else{
                if(i<flowerbed.length-1 && flowerbed[i+1] == 1) {
                    i++;
                    continue;
                }
                n--;
                flowerbed[i] = 1;
                i+=2;    
            }
        }
        
        return n > 0 ? false : true;
    }
}