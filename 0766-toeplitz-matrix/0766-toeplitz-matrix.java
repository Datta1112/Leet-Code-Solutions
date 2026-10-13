class Solution {
    public boolean valid(int[][] matrix,int y,int x){
        int r=matrix.length;
        int c=matrix[0].length;
        int val=matrix[y][x];
        y++;x++;
        boolean ans=true;
        while(y<r && x<c){
            if(matrix[y][x]!=val){
                ans= false;
            }
            y++;
            x++;
        }
        return ans;
    }
    public boolean isToeplitzMatrix(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        boolean fin=true;
        for(int j=0;j<c;j++){
            boolean temp=valid(matrix,0,j);
            if(temp==false){
                fin=false;
            }
        }
        for(int i=1;i<r;i++){
            boolean temp=valid(matrix,i,0);
            if(temp==false){
                fin=false;
            }
        }
        return fin;
    }
}