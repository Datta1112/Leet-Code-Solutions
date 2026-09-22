class Solution {
    public String expand(String s,int l,int h){
        while(l>=0 && h<s.length() && s.charAt(l)==s.charAt(h)){
            l--;
            h++;
        }
        return s.substring(l+1,h);
    }
    public String longestPalindrome(String s) {
        String longest="";
        for(int i=0;i<s.length();i++){
            String odd=expand(s,i,i);
            String even=expand(s,i,i+1);
            if(odd.length()>longest.length()){
                longest=odd;
            }
            if(even.length()>longest.length()){
                longest=even;
            }
        }
        return longest;
    }
}