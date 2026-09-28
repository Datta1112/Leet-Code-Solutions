class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st=new Stack<>();
        int arr[]=new int[temperatures.length];
        for(int i=0;i<temperatures.length;i++){
            int n=temperatures[i];
            while(!st.empty() && n>temperatures[st.peek()]){
                int prev=st.pop();
                int dif=i-prev;
                arr[prev]=dif;
            }
            st.push(i);
        }
        return arr;
    }
}