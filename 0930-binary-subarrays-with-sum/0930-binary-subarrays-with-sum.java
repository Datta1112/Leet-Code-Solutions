class Solution {
    public int atmost(int nums[],int k){
        int n=nums.length;
        int l=0;
        int temp=0;
        int ans=0;
        if(k<0){
            return 0;
        }
        for(int r=0;r<n;r++){
            temp+=nums[r];
            while(temp>k){
                temp-=nums[l];
                l++;
            }
            ans+=r-l+1;
        }
        return ans;
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
        int fin=atmost(nums,goal)-atmost(nums,goal-1);
        return fin;
    }
}