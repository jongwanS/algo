class Solution {
    public int maxPower(String s) {
        
        int l = 0;
        int r = s.length()-1;
        int power = 0;
        while(l <= r){
            
            int tl = l;
            int ch = s.charAt(l);
            int cnt = 0;
            while(tl <= r){
                if(ch != s.charAt(tl)) break; 
                cnt++; 
                tl++;    
            }
            power = Math.max(power, cnt);
            l++;
        }
        
        return power;
    }
}