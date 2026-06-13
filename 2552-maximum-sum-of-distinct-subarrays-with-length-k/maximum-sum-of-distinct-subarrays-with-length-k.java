class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        Set<Integer> st = new HashSet<>();
        long sum = 0;
        long ms = 0;
        int i=0,j=0;
        while(j<nums.length){
            while(st.contains(nums[j])) {
                sum -= nums[i];
                st.remove(nums[i]);
                i++;
            }
            st.add(nums[j]);
            sum += nums[j];
            if(j-i+1 == k){
                ms = Math.max(sum,ms);
                sum -= nums[i];
                st.remove(nums[i]);
                i++;
            }
            j++;
        }
        return ms;
    }
}