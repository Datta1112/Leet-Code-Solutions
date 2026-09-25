class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> li=new ArrayList<>();
        int n=matrix.length;
        int r=matrix[0].length;
        int ind=0;
        for(int i=0;i<n;i++){
            int min_row=Integer.MAX_VALUE;
            int max_col=0;
            for(int j=0;j<r;j++){
                if(matrix[i][j]<min_row){
                    min_row=matrix[i][j];
                    ind=j;
                }
            }
            for(int k=0;k<n;k++){
                if(matrix[k][ind]>max_col){
                    max_col=matrix[k][ind];
                }
            }
            if(min_row==max_col){
                li.add(min_row);
            }
        }
        return li;                         
    }
}