class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int leftSum[] = new int[n];
        int rightSum[] = new int[n];
        for(int i=1;i<n;i++){
            leftSum[i] = leftSum[i-1] + nums[i-1];
            rightSum[n-1-i] = rightSum[n-i] + nums[n-i];
        }
        for(int i=0;i<n;i++){
            leftSum[i] = Math.abs(leftSum[i]-rightSum[i]);
        }
        return leftSum;
    }
}