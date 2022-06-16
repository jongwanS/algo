class Solution {
    public String longestPalindrome(String s) {
        
        if(s.equals(new StringBuffer(s).reverse().toString())) return s;
        
		String answer = String.valueOf(s.charAt(0));
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            
            //홀수일경우
            sb.append(s.charAt(i));
            int l = i-1;
            int r = i+1;
            while(l >= 0 && r <= s.length()-1){
                sb.insert(0,s.charAt(l--)).append(s.charAt(r++));
                if(sb.toString().equals(sb.reverse().toString())){
                    if(answer.length() < sb.toString().length()){
                        answer = sb.toString();
                    }
                }else {
                	break;
                }
            }
            sb.setLength(0);
            
            //짝수일경우
            l = i;
            r = i+1;
            while(l >= 0 && r <= s.length()-1){
                sb.insert(0,s.charAt(l--)).append(s.charAt(r++));
                if(sb.toString().equals(sb.reverse().toString())){
                    if(answer.length() < sb.toString().length()){
                        answer = sb.toString();
                    }
                }else {
                	break;
                }
            }
            sb.setLength(0);
        }
        
        return answer;
    }
}
