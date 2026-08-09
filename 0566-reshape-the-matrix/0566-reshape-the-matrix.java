class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int arr[][]=new int[r][c];
        int rows=mat.length;
        int cols=mat[0].length;
        int k=0;
        if(rows*cols!=r*c){
            return mat;
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[k/c][k%c]=mat[i][j];
                k++;
            }
        }
        return arr;
    }
}