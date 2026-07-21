class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer,Integer> countMap = new HashMap<>();
        int sum = 0;
        int count =0;
        countMap.put(0,1);
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            int rem = ((sum % k) + k) % k;
            if(countMap.containsKey(rem)){
                count += countMap.get(rem);
            }
            
            countMap.put(rem, countMap.getOrDefault(rem,0)+1);
        }
        return count;
    }
}