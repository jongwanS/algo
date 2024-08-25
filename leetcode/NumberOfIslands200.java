package leetcode;

public class NumberOfIslands200 {

    private int islands = 0;
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        boolean[][] visited = new boolean[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] == '1'){
                    if(visited[i][j]) continue;
                    findIslands(grid, visited, i, j);
                    islands++;
                }
            }
        }
        return islands;
    }

    public void findIslands(char[][] grid, boolean[][] visited, int m, int n){
        System.out.println(m + ", " + n);
        if(m >= grid.length || n >= grid[0].length || m < 0 || n < 0) return;
        if(visited[m][n]) return;
        if(grid[m][n] == '0') return;
        visited[m][n] = true;

        findIslands(grid, visited, m, n+1);
        findIslands(grid, visited, m, n-1);
        findIslands(grid, visited, m-1, n);
        findIslands(grid, visited, m+1, n);
    }

    public static void main(String[] args) {
        NumberOfIslands200 numberOfIslands = new NumberOfIslands200();
        char[][] grid = {
                {'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','0','0'},
                {'0','0','0','1','1'},
        };
        numberOfIslands.numIslands(grid);
    }
}
