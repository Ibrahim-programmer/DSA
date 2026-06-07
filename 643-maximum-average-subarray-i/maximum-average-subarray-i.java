class Solution {
    public double findMaxAverage(int[] nums, int k) {
       double max_avg = 0;
        int sum =0;
        int i=0;
        for(;i<nums.length;i++){
            if(i<k){
            sum += nums[i];
            max_avg = sum /(double)(i+1);
            }
            else{
            sum -= nums[i-k];
            sum += nums[i];
            max_avg = Math.max(max_avg,sum /(double)k);
            }
        }
        
        return max_avg;
    }
}