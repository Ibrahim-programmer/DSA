class Solution {
    public void listSubSets(int []arr,int i,List<List<Integer>> ans,List<Integer> temp){
        if(i==arr.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        listSubSets(arr,i+1,ans,temp);
        temp.add(arr[i]);
        listSubSets(arr,i+1,ans,temp);
        temp.remove(temp.size() - 1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        listSubSets(nums,0,ans,new ArrayList());
        return ans;
    }



}