package leetcode;

import java.util.*;

class Solution210 {
	public int[] findOrder(int numCourses, int[][] prerequisites) {
		Queue<Integer> queue = new LinkedList<>();
		List<ArrayList<Integer>> graph = new ArrayList<>();
		int[] indegree = new int[numCourses];

		for (int i = 0; i < numCourses; i++) {
			graph.add(new ArrayList<Integer>());
		}

		for (int[] pre : prerequisites) {
			int s = pre[1];
			int e = pre[0];
			graph.get(s).add(e);
			indegree[e]++;
		}
		for (int i = 0; i < numCourses; i++) {
			if (indegree[i] == 0) {
				queue.add(i);
			}
		}

		Set<Integer> set = new LinkedHashSet<Integer>();
		while (!queue.isEmpty()) {
			int node = queue.poll();
			set.add(node);
			List<Integer> target = graph.get(node);
			for (int n : target) {
				if (--indegree[n] == 0)
					queue.add(n);
			}
		}
		int[] res = new int[set.size()];
		System.out.println(set);
		int i = 0;
		for (int s : set) {
			res[i] = s;
			i++;
		}
		return res ;
	}
}
