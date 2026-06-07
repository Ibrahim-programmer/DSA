class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int max_sum =0;
        int n = nums.length;
        for(int i=0;i<n/2;i++){
            int sum = nums[i] + nums[n-i-1];
            max_sum = Math.max(max_sum,sum);
        }
        return max_sum;
    }
}