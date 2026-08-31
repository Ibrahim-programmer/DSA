class Solution {
    public int minimumDeletions(int[] nums) {
        int min = 0;
        int max = 0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[min]>nums[i]){
                min = i;
            }
            if(nums[max]<nums[i]){
                max = i;
            }
        }
        int minInPointers = Math.min(max,min);
        int maxInPointers = Math.max(max,min);
        int right = maxInPointers + 1;
        int left = n- minInPointers;
        int diff = minInPointers + 1 +  n- maxInPointers;
        return Math.min(Math.min(right,left),diff);
    }
}