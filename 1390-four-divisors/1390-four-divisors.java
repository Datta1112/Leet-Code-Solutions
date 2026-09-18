class Solution {
    public int sumFourDivisors(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            int count=0;
            int temp=0;
            int a=nums[i];
            for(int j=1;j*j<=a;j++){
                if(a%j==0){
                    count++;
                    temp+=j;
                    if(a/j!=j){
                        count++;
                        temp+=a/j;
                    }
                }
                if(count>4){
                    break;
                }
            }
            if(count==4){
                sum+=temp;
            }
        }
        return sum;
    }
}