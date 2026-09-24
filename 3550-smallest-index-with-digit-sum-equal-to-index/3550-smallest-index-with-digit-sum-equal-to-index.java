class Solution {
    public int smallestIndex(int[] nums) {
        int fin=nums.length;
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            int ans=0;
            while(num>0){
                int temp=num%10;
                num=num/10;
                ans+=temp;
            }
            if(ans==i){
                fin=Math.min(fin,i);
            }
        }if(fin==nums.length){
            return -1;
        }
        return fin;
    }
}