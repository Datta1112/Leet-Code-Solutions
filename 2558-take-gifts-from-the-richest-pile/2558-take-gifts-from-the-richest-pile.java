class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i:gifts){
            pq.add(i);
        }
        int count=0;
        while(count<k){
            int ans=(int) Math.sqrt(pq.poll());
            pq.add(ans);
            count++;
        }
        long sum=0;
        for(int n:pq){
            sum+=n;
        }
        return sum;
    }
}