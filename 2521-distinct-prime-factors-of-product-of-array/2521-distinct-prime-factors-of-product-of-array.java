class Solution {
    public int distinctPrimeFactors(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int num:nums){
            for(int j=2;j*j<=num;j++){
                while(num%j==0){
                    hm.put(j,hm.getOrDefault(j,0)+1);
                    num=num/j;
                    if(num==1){
                        break;
                    }
                }
            }
            if(num>1){
                hm.put(num,hm.getOrDefault(num,0)+1);
            }
        }
        return hm.size();
    }
}