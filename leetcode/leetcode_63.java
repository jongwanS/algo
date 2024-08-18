package leetcode;

public class leetcode_63 {

	public static void main(String[] args) {
		//{{0,0,0},{0,1,0},{0,0,0}};
		int[][] obstacleGrid = {{0,0,0},{1,0,0},{0,0,0}};
		
		int n = uniquePathsWithObstacles(obstacleGrid);
		System.out.println(n);
	}
	
    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        
        int row = obstacleGrid.length;
        int col = obstacleGrid[0].length;
        
        int[][] cache = new int[row][col];
        int res = dfs(0, 0, obstacleGrid, cache);
        
        return res;
    }
    
    public static int dfs(int i, int j, int[][] obstacleGrid, int[][] cache){
        
        if(i > obstacleGrid.length-1 || j > obstacleGrid[0].length-1 
           || obstacleGrid[i][j] == 1
        ){
            return 0;
        }
        if(i==obstacleGrid.length-1 && j==obstacleGrid[0].length-1){
            return 1;
        }
        if(cache[i][j] > 0) {
        	return cache[i][j]; 
        }
        int right = dfs(i, j+1, obstacleGrid,cache);
        int down = dfs(i+1, j, obstacleGrid,cache);
        
        return cache[i][j]=right+down;
    }
}
