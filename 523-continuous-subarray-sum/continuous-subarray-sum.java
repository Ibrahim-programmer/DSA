class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer,Integer> remMap = new HashMap<>();
        int sum =0;
        int rem=0;
        remMap.put(0,-1);
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            rem = sum % k;
            if(remMap.keySet().contains(rem)){
                if(i-remMap.get(rem)>=2)
                return true;
            }
            else
            remMap.put(rem,i);
        }
        return false;
    }
}