class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> hm=new HashMap<>();
        HashMap<Character,Integer> hm2=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            hm2.put(ch,hm2.getOrDefault(ch,0)+1);
        }
        boolean ans=false;
        if(hm.equals(hm2)){
            ans=true;
        }
        return ans;
    }
}