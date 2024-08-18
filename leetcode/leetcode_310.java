package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution310 {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
    	
    	boolean[] removedLeaf = new boolean[n];
    	
        //각 노드를 연결해주는 배열을 선언해준다.
    	List<ArrayList<Integer>> graph = new ArrayList<>();
    	for(int i=0;i<n;i++) {
    		graph.add(new ArrayList<>());
    	}
    	//각 노드를 연결해주는 그래프를 만들어준다.
    	for(int i=0;i<edges.length;i++) {
    		int v1 = edges[i][0];//연결해주는선
    		int v2 = edges[i][1];//연결해주는선
    		graph.get(v1).add(v2);
    		graph.get(v2).add(v1);
    	}
    	
    	Queue<Integer> leafQue = new LinkedList<>();
    	int height = n;//현재 트리가 일자로 연결되어잇다고 생각
    	while(height > 2){//각트리의 leaft 제거한이후 높이가 1일때까지 찾음
        	//각 엣지를 담을 큐를 선언해준다.
        	for(int i=0;i<graph.size();i++) {
        		if(graph.get(i).size() == 1) leafQue.add(i);
        	}
    		
            while(!leafQue.isEmpty()) {
    		    int leafIdx = leafQue.poll();
    		    int leafVal = graph.get(leafIdx).get(0);
    		    for(int i=0;i<graph.get(leafVal).size();i++) {
                    //리프에 연결된 노드들에서 리프값을 제거해준다.
                    if(graph.get(leafVal).get(i) == leafIdx) {
                        graph.get(leafVal).remove(i); 
                    }
    		    }
                //리프 제거해준다.
                graph.get(leafIdx).clear();
                height--;//height 값을 줄임
                removedLeaf[leafIdx] = true;
    	    }
        }
    	for(int i=0;i<removedLeaf.length;i++) {
    		if(removedLeaf[i]==false) leafQue.add(i);
    	}
    		
    	
    	return new ArrayList<>(leafQue);
    }
}