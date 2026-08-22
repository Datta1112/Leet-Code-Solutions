class Solution {
    public int atmost(int nums[],int k){
        HashMap<Integer,Integer> hm =new HashMap<>();
        int n=nums.length;
        int l=0;
        int count=0;
        int ans=0;
        for(int r=0;r<n;r++){
            int val=nums[r];
            hm.put(val,hm.getOrDefault(val,0)+1);
            while(hm.size()>k){
                int lval=nums[l];
                hm.put(nums[l],hm.get(lval)-1);
                if(hm.get(lval)==0){
                    hm.remove(lval);
                }
                l++;
            }
            ans+=r-l+1;
        }
        return ans;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        int fin=atmost(nums,k)-atmost(nums,k-1);
        return fin;
    }
}