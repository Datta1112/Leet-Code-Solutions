class Solution {
    public boolean isEating(int piles[],int h,int k){
        int n=piles.length;
        long count=0;
        for(int i=0;i<n;i++){
            count+=(piles[i]+k-1)/k;
        }
        if(count<=h){
            return true;
        }
        return false;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int l=1;
        int r=1000000000;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(isEating(piles,h,mid)){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
    return l;
    }
}