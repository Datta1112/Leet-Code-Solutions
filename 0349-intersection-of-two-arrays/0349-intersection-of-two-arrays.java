class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs=new HashSet<>();
        HashSet<Integer> hs2=new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            hs.add(nums1[i]);
        }
        for(int i=0;i<nums2.length;i++){
            if(hs.contains(nums2[i])){
                hs2.add(nums2[i]);
            }
        }
        int arr[]=new int[hs2.size()];
        int index=0;
        for(int hel:hs2){
            arr[index]=hel;
            index++;
        }
        return arr;
    }
}