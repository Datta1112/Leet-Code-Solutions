class Solution {
    public boolean isPossible(int[] nums,int k,int mid){
        int count=1;
        int temp=0;
        for(int r=0;r<nums.length;r++){
            if(nums[r]>mid){
                return false;
            }
            if(temp+nums[r]>mid){
                count++;
                temp=nums[r];
            }else{
                temp+=nums[r];
            }
        }
        if(count<=k){
            return true;
        }
        return false;
    }
    public int splitArray(int[] nums, int k) {
        int l=0;
        int r=(int) Math.pow(10,9);
        while(l<=r){
            int mid=l+(r-l)/2;
            if(isPossible(nums,k,mid)){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return l;
    }
}