package leetcode;

//내풀이
class Solution67 {
    public String addBinary(String a, String b) {
        
        StringBuilder sb = new StringBuilder();
        int i = a.length()-1;
        int j = b.length()-1;
        

        
        boolean carry = false;
        while(i>=0 && j>=0){
            
            if(!carry){
                if( a.charAt(i) == '1' && b.charAt(j) == '1' ){
                    sb.append('0');
                    carry=true;
                }else if(a.charAt(i) == '0' && b.charAt(j) == '0' ){
                    sb.append('0');
                    carry=false;
                }else{
                    sb.append('1');
                    carry=false;
                }
            }else{
                if( a.charAt(i) == '1' && b.charAt(j) == '1' ){
                    sb.append('1');
                    carry = true;
                }else if(a.charAt(i) == '0' && b.charAt(j) == '0' ){
                    sb.append('1');
                    carry=false;
                }else{
                    sb.append('0');
                    carry=true;
                }
            }
            
            
            i--;
            j--;
        }
        
                    while(i >= 0){
                if(carry){
                    if(a.charAt(i) == '1'){
                        sb.append('0');
                        carry = true;
                    }else{
                        sb.append('1');
                        carry = false;
                    }
                }else{
                    sb.append(a.charAt(i));
                }
                i--;
            }

            while(j >= 0){
                if(carry){
                    if(b.charAt(j) == '1'){
                        sb.append('0');
                        carry = true;
                    }else{
                        sb.append('1');
                        carry = false;
                    }
                }else{
                    sb.append(b.charAt(j));
                }
                j--;
            }   
        if(carry) sb.append('1');
        
        return sb.reverse().toString();
    }
}

//leetcode
class Solution67_2 {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length()-1;
        int j = b.length()-1;
        int carry = 0;
        int sum = 0;
        while(i>=0 || j>=0){
            sum = carry;
            if(i>=0) sum += a.charAt(i--) - '0';
            if(j>=0) sum += b.charAt(j--) - '0';
            //sum값은 0,1,2,3 이될수있음
            sb.append(sum%2);
            carry = sum>>1;
        }
        if(carry == 1) sb.append(carry);
        
        return sb.reverse().toString();
    }
}