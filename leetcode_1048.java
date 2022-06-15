class Solution {
    public int longestStrChain(String[] words) {
		Map<String,Integer> dp = new HashMap<>();
		Arrays.sort(words,(a,b)->a.length()-b.length());
		
		int max = 0;
		for(String word : words) {
			int submax = 0;
			for(int i=0;i<word.length();i++) {
				String s = word.substring(0,i)+word.substring(i+1);
				submax = Math.max(submax, dp.getOrDefault(s, 0)+1);
			}
			dp.put(word, submax);
			max = Math.max(max, submax);
		}
        return max;
    }
}