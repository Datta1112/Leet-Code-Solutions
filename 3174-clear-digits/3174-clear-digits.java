class Solution {
    public String clearDigits(String s) {
        Stack<Character> st=new Stack<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                st.pop();
            }else {
                st.push(ch);
            }
        }
        for(char c:st){
            sb.append(c);
        }
        return sb.toString();
    }
}