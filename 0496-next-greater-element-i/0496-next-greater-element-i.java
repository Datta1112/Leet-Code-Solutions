class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int arr[]=new int[nums1.length];
        HashMap<Integer,Integer> hm=new HashMap<>();
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<nums2.length;i++){
            while(!st.isEmpty() && st.peek()<nums2[i]){
                hm.put(st.peek(),nums2[i]);
                st.pop();
            }
            st.push(nums2[i]);
        }
        for(int i=0;i<nums1.length;i++){
            if(!hm.containsKey(nums1[i])){
                arr[i]=-1;
            }else{
                arr[i]=hm.get(nums1[i]);
            }
        }
        return arr;
    }
}