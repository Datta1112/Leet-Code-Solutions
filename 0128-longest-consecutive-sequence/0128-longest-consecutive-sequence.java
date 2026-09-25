class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int ans=1;
        if(nums.length==0){
            return 0;
        }
        int count=1;
        for(int i=0;i<nums.length-1;i++){
            int next=nums[i+1];
            if(next==nums[i]+1){
                count++;
            }else if(next==nums[i]){
                continue;
            }else{
                count=1;
            }
            ans=Math.max(count,ans);
        }
        return ans;
    }
}