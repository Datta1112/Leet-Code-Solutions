class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int l=0;
        int countT=0;
        int countF=0;
        int min=0;
        int ans=0;
        int n=answerKey.length();
        for(int r=0;r<n;r++){
            if(answerKey.charAt(r)=='T'){
                countT++;
            }else{
                countF++;
            }
            while(Math.min(countT,countF)>k){
                if(answerKey.charAt(l)=='T'){
                    countT--;
                }else{
                    countF--;
                }
                l=l+1;
            }
            ans=Math.max(ans,r-l+1);
        }
        return ans;
    }
}