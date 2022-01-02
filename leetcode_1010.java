class Solution {
    public int numPairsDivisibleBy60(int[] time) {

        for(int i=0;i<time.length;i++) time[i] = time[i]%60;
        
        Map<Integer, Integer> map = new HashMap<>();
        int cnt = 0;
        for(int t : time){
        	if(t==0 && map.containsKey(0)) cnt+=map.get(0);//0일경우의 예외케이스 60의 배수일 경우,
        	if( map.containsKey(60-t)) cnt+=map.get(60-t);//60-t = t 와 60이 될수있는 경우의수
        	map.put(t, map.getOrDefault(t, 0)+1);
        }
        
        return cnt;
    }
}