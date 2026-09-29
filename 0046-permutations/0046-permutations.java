class Solution {
    public void backtrack(List<List<Integer>> result,List<Integer> temp,int[] arr){
        if(temp.size()==arr.length){
            result.add(new ArrayList<>(temp));
        }
        for(int ele:arr){
            if(temp.contains(ele)){
                continue;
            }
            temp.add(ele);
            backtrack(result,temp,arr);
            temp.remove(temp.size()-1);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        backtrack(result,temp,nums);
        return result;
    }
}