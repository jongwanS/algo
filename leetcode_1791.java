class Solution {
    public int findCenter(int[][] edges) {
        List<ArrayList<Integer>> graph = new ArrayList<>();
    	
    	//0을 잇는것은 없으니까 +1, 구성 최대값은 n(노드의 갯수이다)
    	int graphLength = edges.length+2;
    	
    	for(int i=0;i<graphLength;i++) {
    		graph.add(new ArrayList<>());
    	}
    	
    	for(int[] node :edges) {
    		int u = node[0];
    		int v = node[1];
    		//각노드를 서로 연결시켜준다.
    		graph.get(u).add(v);
    		graph.get(v).add(u);
    	}
    	
    	int max = 0;
    	int idx = 0; 
    	for(int i=1;i<graph.size();i++) {
    		if(graph.get(i).size() > max) {
    			max = graph.get(i).size();
    			idx = i;
    		}
    	}
    	
    	return idx;
    }
}