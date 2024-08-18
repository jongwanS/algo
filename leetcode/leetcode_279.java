package leetcode;

import java.util.*;

class Solution279 {
    int depth = 0;
    
    public int numSquares(int target) {
        
        ArrayList<Integer> arr = new ArrayList<>();
		
		int powN = 0;
		int n = 1;
		while(powN <= target) {
			powN = (int) Math.pow(n, 2);
			arr.add((int) Math.pow(n, 2));
			n++;
		}
		arr.remove(arr.size()-1);
		
		bfs(arr, target);
            
        return depth;
    }
    
	private void bfs(ArrayList<Integer> arr, int target) {
		
		Set<Integer> cache = new HashSet<>();
		
		Queue<Integer> que = new LinkedList<>();
		que.add(target);
		
		while(!que.isEmpty()) {
			depth++;
			int size = que.size();
            //큐에있는 값은 값은 depth의 값들임
			for(int i=0;i<size;i++) {
				int n = que.poll();
				for(int num : arr) {
					if(n-num >= 0 && !cache.contains(n-num)) {
						cache.add(n-num);
						que.add(n-num);
						if(n-num == 0) return;
					}
				}
			}
		}
	}
}