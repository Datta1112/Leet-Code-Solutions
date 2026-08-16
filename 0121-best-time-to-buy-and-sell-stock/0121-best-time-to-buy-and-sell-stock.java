class Solution {
    public int maxProfit(int[] prices) {
        int prof=0;
        int low=prices[0];
        for(int i=0;i<prices.length;i++){
            int temp=prices[i]-low;
            prof=Math.max(prof,temp);
            if(prices[i]<low){
                low=prices[i];
            }
        }
        return prof;
    }
}