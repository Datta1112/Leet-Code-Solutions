class Solution {
    public int minOperations(int[] nums, int x) {
        int total=0;
        for(int num:nums){
            total+=num;
        }
        int target=total-x;
        if(target==0){
            return nums.length;
        }
        int l=0;
        int sum=0;
        int maxlen=-1;
        for(int r=0;r<nums.length;r++){
            sum+=nums[r];
            while(l<=r && sum>target){
                sum-=nums[l];
                l++;
            }
            if(sum==target){
                maxlen=Math.max(maxlen,r-l+1);
            }
        }
        if(maxlen==-1){
            return maxlen;
        }
        return nums.length-maxlen;
    }
}