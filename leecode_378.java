class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int row=matrix.length;
        int col=matrix[0].length;
        int[] arr=new int[row*col];
        int index=0;
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++) {
                arr[index]=matrix[i][j];
                index++;
            }
        }
        Arrays.sort(arr);
        return arr[k-1];
    }
}
