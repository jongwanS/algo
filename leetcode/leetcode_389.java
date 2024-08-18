package leetcode;

class Solution389 {
    public char findTheDifference(String s, String t) {
        
        int[] alphaS = new int[26];
        int[] alphaT = new int[26];
        for(char ch : s.toCharArray()){
            alphaS[ch-'a']++;
        }
        for(char ch : t.toCharArray()){
            alphaT[ch-'a']++;
        }
        
        char ch = ' ';
        for(int i=0;i<26;i++){
            if(alphaS[i] != alphaT[i]) return (char)(i+(int)'a');
        }
        
        return ch;
    }
}