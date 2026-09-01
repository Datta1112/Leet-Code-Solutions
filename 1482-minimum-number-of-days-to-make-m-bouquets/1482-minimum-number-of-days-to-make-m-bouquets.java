class Solution {
    public boolean isBloom(int blooms[],int m,int k,int day){
        int took=0;
        int n=blooms.length;
        for(int i=0;i<n;i++){
            if(blooms[i]<=day){
                took++;
            }else{
                took=0;
            }
            if(took==k){
                m-=1;
                took=0;
            }
            if(m<=0){
                return true;
            }
        }
        return false;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        if((long)m*k>bloomDay.length){
            return -1;
        }
        int l=1;
        int r=1000000000;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(isBloom(bloomDay,m,k,mid)){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return l;
    }
}