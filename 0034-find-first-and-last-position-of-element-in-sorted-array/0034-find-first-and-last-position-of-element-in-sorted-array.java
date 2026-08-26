class Solution {
    public static int left(int nums[],int target){
        int l=0;
        int r=nums.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]>=target){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        if(l>=nums.length){
            return -1;
        }
        if(nums[l]!=target){
            return -1;
        }
        return l;
    }
    public static int right(int nums[],int target){
        int l=0;
        int r=nums.length-1;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(nums[mid]>target){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        if(r<0){
            return -1;
        }
        if(nums[r]!=target){
            return -1;
        }
        return r;
    }
    public int[] searchRange(int[] nums, int target) {
        int left=left(nums,target);
        int right=right(nums,target);
        int[] arr=new int[2];
        arr[0]=left;
        arr[1]=right;
        return arr;
    }
}