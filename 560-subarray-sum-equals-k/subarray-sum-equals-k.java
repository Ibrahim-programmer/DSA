class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> mp = new HashMap<>();
        int current = 0;
        int count =0;
        mp.put(0,1);
        for(int i=0;i<nums.length;i++){
            current += nums[i];
            if(mp.keySet().contains(current-k)){
                count += mp.get(current-k);
            }
            mp.put(current,mp.getOrDefault(current,0)+1);
        }
        return count;
    }
}