class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        TreeMap<Integer,List<Character>> tm=new TreeMap<>(Collections.reverseOrder());
        for(char ch:s.toCharArray()){
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        for(char ch:hm.keySet()){
            int freq=hm.get(ch);
            tm.putIfAbsent(freq,new ArrayList<>());
            tm.get(freq).add(ch);
        }
        StringBuilder sb=new StringBuilder();
        for(Map.Entry<Integer,List<Character>> entry:tm.entrySet()){
            int freq=entry.getKey();
            for(char ch:entry.getValue()){
                for(int i=0;i<freq;i++){
                    sb.append(ch);
                }
            }
        }
        return sb.toString();
    }
}