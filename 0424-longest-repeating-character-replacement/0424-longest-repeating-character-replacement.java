class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> hm=new HashMap<>();
        int l=0;
        int ans=0;
        int count=0;
        int maxfreq=0;
        int n=s.length();
        for(int r=0;r<n;r++){
            char ch=s.charAt(r);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
            maxfreq=Math.max(maxfreq,hm.get(ch));
            while((r-l+1)-maxfreq>k){
                char lch=s.charAt(l);
                hm.put(lch,hm.get(lch)-1);
                l++;
            }
            ans=Math.max(ans,r-l+1);
        }
        return ans;
    }
}