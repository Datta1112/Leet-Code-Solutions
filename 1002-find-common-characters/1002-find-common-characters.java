class Solution {
    public List<String> commonChars(String[] words) {
        List<String> li=new ArrayList<>();
        HashMap<Character,Integer> hm=new HashMap<>();
        for(char ch:words[0].toCharArray()){
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        for(int i=1;i<words.length;i++){
            HashMap<Character,Integer> temp=new HashMap<>();
            for(char ch:words[i].toCharArray()){
                temp.put(ch,temp.getOrDefault(ch,0)+1);
            }
            for(char ch:hm.keySet()){
                hm.put(ch,Math.min(hm.get(ch),temp.getOrDefault(ch,0)));
            }
        }
        for(Map.Entry<Character,Integer> entry:hm.entrySet()){
            int freq=entry.getValue();
            char ch=entry.getKey();
            for(int i=0;i<freq;i++){
                li.add(String.valueOf(ch));
            }
        }
        return li;
    }
}