class Solution {
    public int maxVowels(String s, int k) {
        int l=0;
        int count=0;
        int ans=0;
        for(int r=0;r<s.length();r++){
            char ch=s.charAt(r);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
            if(r-l+1==k){
                ans=Math.max(ans,count);
                char ch2=s.charAt(l);
                if(ch2=='a'||ch2=='e'||ch2=='i'||ch2=='o'||ch2=='u'){
                    count--;
                }
                l++;
            }
        }
        return ans;
    }
}