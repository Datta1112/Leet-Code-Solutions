class Solution {
    public String repeatLimitedString(String s, int repeatLimit) {
        HashMap<Character,Integer> hm=new HashMap<>();
        PriorityQueue<Character> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(char ch:s.toCharArray()){
            if(!hm.containsKey(ch)){
                pq.add(ch);
            }
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        StringBuilder sb=new StringBuilder();
        while(!pq.isEmpty()){
            char ch=pq.peek();
            if(hm.get(ch)>repeatLimit){
                int count=repeatLimit;
                while(count>0){
                    sb.append(ch);
                    count--;
                }
                pq.poll();
                hm.put(ch,hm.get(ch)-repeatLimit);
                if(!pq.isEmpty()){
                    if(hm.get(ch)>0){
                        char peek=pq.peek();
                        sb.append(peek);
                        pq.poll();
                        hm.put(peek,hm.get(peek)-1);
                        pq.add(ch);
                        if(hm.get(peek)>0){
                            pq.add(peek);
                        }
                        
                    }
                }
            }else if(hm.get(ch)<=repeatLimit){
                for(int i=0;i<hm.get(ch);i++){
                    sb.append(ch);
                }
                pq.poll();
            }
        }
        return sb.toString();
    }
}