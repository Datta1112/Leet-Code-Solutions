class Solution {
    public int[] productExceptSelf(int[] nums) {
        int left[]=new int[nums.length];
        int right[]=new int[nums.length];
        int res[]=new int[nums.length];
        left[0]=1;
        right[nums.length-1]=1;
        int prod1=1;
        for(int i=1;i<nums.length;i++){
            prod1*=nums[i-1];
            left[i]=prod1;
        }
        int mul=1;
        for(int i=nums.length-2;i>=0;i--){
            mul*=nums[i+1];
            right[i]=mul;
        }
        for(int l=0;l<nums.length;l++){
            res[l]=left[l]*right[l];
        }
        return res;
    }
}