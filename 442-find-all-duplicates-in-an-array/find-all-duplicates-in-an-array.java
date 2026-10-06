class Solution {
    public List<Integer> findDuplicates(int[] nums) {

        List<Integer> li = new ArrayList<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            int index = ((nums[i] <0)?-nums[i]:nums[i]) - 1;
            if(nums[index] < 0){
                li.add(index + 1);
            }
            else{
                nums[index] *= -1;
            }
        }
        return li;
    }
}