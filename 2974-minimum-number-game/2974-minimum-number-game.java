class Solution {
    public int[] numberGame(int[] nums) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int arr[]=new int[nums.length];
        for(int n:nums){
            pq.add(n);
        }
        for(int i=0;i<arr.length;i+=2){
            int first=pq.poll();
            int second=pq.poll();
            arr[i]=second;
            arr[i+1]=first;
        }
        return arr;
    }
}