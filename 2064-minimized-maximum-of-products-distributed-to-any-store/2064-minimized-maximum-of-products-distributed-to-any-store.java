class Solution {
    public boolean isPossible(int limit,int n,int[] quantities){
        for(int i=0;i<quantities.length;i++){
            int val=quantities[i];
            int temp=val/limit;
            if(val%limit!=0){
                temp++;
            }
            n-=temp;
            if(n<0){
                return false;
            }
        }
        return true;
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