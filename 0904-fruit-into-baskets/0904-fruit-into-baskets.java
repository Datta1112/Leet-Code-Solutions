class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int l=0;
        int n=fruits.length;
        int ans=0;
        int count=0;
        for(int r=0;r<n;r++){
            if(hm.containsKey(fruits[r])){
                hm.put(fruits[r],hm.get(fruits[r])+1);
            }else{
                hm.put(fruits[r],1);
                count++;
            }
            while(count>2){
                hm.put(fruits[l],hm.get(fruits[l])-1);
                if(hm.get(fruits[l])==0){
                    hm.remove(fruits[l]);
                    count--;
                }
                l++;
            }
            ans=Math.max(ans,r-l+1);
        }
        return ans;
    }
}