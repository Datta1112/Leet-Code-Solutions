class Solution {
    public int funatmostk(int[] arr,int k) {
        int l=0;
        int count=0;
        int ans=0;
        int n=arr.length;
        for(int r=0;r<n;r++){
            if(arr[r]%2==1){
                count++;
            }
            while(count>k){
                if(arr[l]%2==1){
                    count--;
                }
                l++;
            }
            ans+=r-l+1;
            
        }
        return ans;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        int fin=funatmostk(nums,k)-funatmostk(nums,k-1);
        return fin;
    }
}