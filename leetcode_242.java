class Solution {
    public boolean isAnagram(String s, String t) {
        int[] alpha = new int[26];
        int[] talpha = new int[26];

        for(char ch : s.toCharArray()){
            alpha[ch-'a']++;
        }
        for(char ch : t.toCharArray()){
            talpha[ch-'a']++;
        }

        for(int i=0;i<26;i++){
            if(alpha[i] != talpha[i]){
                return false;
            }
        }
        return true;
    }
}