class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        int n=s.length();
        int l=0;
        int ans=0;
        for(int r=0;r<n;r++){
            char ch=s.charAt(r);
            while(hm.containsKey(ch)){
                hm.remove(s.charAt(l));
                l++;
            }
            hm.put(ch,1);
            ans=Math.max(ans,r-l+1);
        }
        return ans;
    }
}