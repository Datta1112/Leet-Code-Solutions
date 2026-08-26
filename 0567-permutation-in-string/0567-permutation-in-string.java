class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character,Integer> hm=new HashMap<>();
        HashMap<Character,Integer> hm2=new HashMap<>();
        int l=0;
        int count=0;
        int n=s2.length();
        int k=s1.length();
        for(int i=0;i<k;i++){
            hm2.put(s1.charAt(i),hm2.getOrDefault(s1.charAt(i),0)+1);
        }
        for(int r=0;r<n;r++){
            char a=s2.charAt(r);
            hm.put(a,hm.getOrDefault(a,0)+1);
            while(r-l+1>k){
                char b=s2.charAt(l);
                hm.put(b,hm.get(b)-1);
                if(hm.get(b)==0){
                    hm.remove(b);
                }
                l++;
            }
            if(hm.equals(hm2)){
                return true;
            }
        }
        return false;
    }
}