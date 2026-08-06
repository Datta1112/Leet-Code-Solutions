class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hm=new HashMap<>();
        for(String s:strs){
            char arr[]=s.toCharArray();
            Arrays.sort(arr);
            String ns=new String(arr);
            hm.putIfAbsent(ns,new ArrayList<>());
            hm.get(ns).add(s);
        }
        return new ArrayList(hm.values());
    }
}