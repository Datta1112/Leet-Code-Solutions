class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int arr[]=new int[2];
        for(int i=0;i<nums.length;i++){
            int need=target-nums[i];
            if(hm.containsKey(need)){
                arr[0]=hm.get(need);
                arr[1]=i;
            }
            if(!hm.containsKey(need)){
                hm.put(nums[i],i);
            }
        }
        return arr;
    }
}