class Solution {
    public boolean isShipped(int[] weights,int days,int max){
        int temp=0;
        int n=weights.length;
        int usedays=1;
        for(int i=0;i<n;i++){
            if(weights[i]>max){
                return false;
            }
            if(temp + weights[i]>max){
                days--;
                temp=weights[i];
            }else{
                temp+=weights[i];
            }
        }
        if(days<=0){
                return false;
            }
        return true;
    }
    public int shipWithinDays(int[] weights, int days) {
        int l=1;
        int r=100000000;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(isShipped(weights,days,mid)){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return l;
    }
}