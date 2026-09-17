class Solution {
    public boolean isPossible(int limit,int n,int[] quantities){
        int sum=0;
        for(int i=0;i<quantities.length;i++){
            int temp=(int) Math.ceil((double) quantities[i]/limit);
            sum+=temp;
        }
        if(sum<=n){
            return true;
        }else{
            return false;
        }
    }
    public int minimizedMaximum(int n, int[] quantities) {
        int l=1;
        int r=1000000;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(isPossible(mid,n,quantities)){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return l;
    }
}