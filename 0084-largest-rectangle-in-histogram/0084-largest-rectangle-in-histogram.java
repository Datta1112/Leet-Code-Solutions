class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st=new Stack<>();
        int prev[]=new int[heights.length];
        int next[]=new int[heights.length];
        for(int i=0;i<heights.length;i++){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
                st.pop();
            }
            if(st.isEmpty()){
                prev[i]=-1;
            }else{
                prev[i]=st.peek();
            }
            st.push(i);
        }
        st.clear();
        for(int i=heights.length-1;i>=0;i--){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
                st.pop();
            }
            if(st.isEmpty()){
                next[i]=heights.length;
            }else{
                next[i]=st.peek();
            }
            st.push(i);
        }
        int ans=0;
        for(int i=0;i<heights.length;i++){
            int temp=next[i]-prev[i]-1;
            int mul=temp*heights[i];
            ans=Math.max(ans,mul);
        }
        return ans;
    }
}