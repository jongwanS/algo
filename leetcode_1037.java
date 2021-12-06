class Solution {
    public boolean isBoomerang(int[][] p) {
        
    	//삼각형이 일직선여부에 따라 true/false 리턴
        return (p[0][0] - p[1][0]) * (p[0][1] - p[2][1]) != (p[0][0] - p[2][0]) * (p[0][1] - p[1][1]);
    }
}