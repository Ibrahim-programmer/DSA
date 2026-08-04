class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        int num=nums[0];
        int i=0;
        while(i<n){
            if(nums[i]==num){
                i++;
            }
            else{
                ans.add(num);
            }
            num++;
        }
        return ans;
    }
}