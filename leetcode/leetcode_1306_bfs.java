package leetcode;

import java.util.LinkedList;
import java.util.Queue;

class Solution1306_2 {
    public boolean canReach(int[] arr, int start) {
        
        Queue<Integer> que = new LinkedList<>();
    	int arrLength = arr.length;
    	que.add(start);
    	
    	while(!que.isEmpty()) {
    		//현재 인덱스 위치
    		int idx = que.poll();
    		
    		if(idx < 0 || idx >= arrLength) {
    			//배열의 범위를 넘었을경우
    			continue;
    		}
    		if(arr[idx] < 0) {
    			//만약에 내가 이미 들렸던 위치면
    			continue;
    		}
    		if(arr[idx] == 0) {
    			//0을 찾음
    			return true;
    		}
    		//내가 들렸던 곳을 체크해준다. 만약에 안해주면 큐에 계속 쌓일것이긴 떄문이다.
    		arr[idx] = -arr[idx];
    		
    		if(idx+arr[idx] >= 0) {
    			//왼쪽으로 가는 인덱스
    			que.add(idx+arr[idx]);
    		}
    		if(idx-arr[idx] < arrLength) {
    			//오른쪽으로 가는 인덱스
    			que.add(idx-arr[idx]);
    		}
    	}
    	return false;
    }
}