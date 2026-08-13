class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        int l=0;
        int temp=0;
        int ans=Integer.MIN_VALUE;
        for(int r=0;r<n;r++){
            temp+=nums[r];
            if(r-l+1==k){
                ans=Math.max(temp,ans);   
                temp-=nums[l];
                l++;
            }         
        }
        double fin=(double)ans/k;
        return fin;
    }
}