class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);
        int n=s.length();
        int val=0;
        for(int i=0;i<n;i++){
            int curr=hm.get(s.charAt(i));
            if(i+1<n && curr<hm.get(s.charAt(i+1))){
                val-=curr;
            }else{
                val+=curr;
            }
        }
        return val;
    }
}