class Solution {
    public boolean isPossible(int[] position,int m,int k){
        Arrays.sort(position);
        int last=position[0];
        m-=1;
        for(int i=1;i<position.length;i++){
            int temp=position[i]-last;
            if(temp>=k){
                last=position[i];
                m-=1;
            }
        }
        if(m>0){
            return false;
        }
        return true;
    }
    public int maxDistance(int[] position, int m) {
        int l=1;
        int r=(int) Math.pow(10,9);
        while(l<=r){
            int mid=l+(r-l)/2;
            if(isPossible(position,m,mid)){
                l=mid+1;
            }else{
                r=mid-1;
            }
        }
        return r;
    }
}