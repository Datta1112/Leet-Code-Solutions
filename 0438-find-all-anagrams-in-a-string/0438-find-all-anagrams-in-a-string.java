class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> ls=new ArrayList<>();
        HashMap<Character,Integer> hms=new HashMap<>();
        HashMap<Character,Integer> hmp=new HashMap<>();
        int n=s.length();
        int k=p.length();
        for(int i=0;i<k;i++){
            char ch=p.charAt(i);
            hmp.put(ch,hmp.getOrDefault(ch,0)+1);
        }
        int l=0;
        for(int r=0;r<n;r++){
            char chr=s.charAt(r);
            hms.put(chr,hms.getOrDefault(chr,0)+1);
            if(r-l==k){
                char chl=s.charAt(l);
                hms.put(chl,hms.get(chl)-1);
                if(hms.get(chl)==0){
                    hms.remove(chl);
                }
                l++;
            }
            if(r-l+1==k){
                if(hms.equals(hmp)){
                    ls.add(l);
                }
            }
        }
        return ls;
    }
}