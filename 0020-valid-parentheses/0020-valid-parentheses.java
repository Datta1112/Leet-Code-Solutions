class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if("([{".contains(String.valueOf(ch))){
                st.push(ch);
            }else{
                    if(!st.isEmpty()){
                        if((st.peek()=='(' && ch==')') ||
                            (st.peek()=='{' && ch=='}') ||
                            (st.peek()=='[' && ch==']')){
                                    st.pop();
                        }else{
                        st.push(ch);
                        }
                    }else{
                        st.push(ch);
                    }
                }
            
        }
        return st.isEmpty();
    }
}