class Solution {
    public int findMaxLength(int[] nums) {
        int sum =0;
        int len =0;
        Map<Integer,Integer> sumIn = new HashMap<>();
        sumIn.put(0,-1);
        int n = nums.length;
        for(int i=0;i<n;i++){
            sum += nums[i]==0?-1:1;
            if(sumIn.containsKey(sum)){
                len = Math.max(len,i-sumIn.get(sum));
            }
            else{
                sumIn.put(sum,i);
            }
        }
        return len;
    }
}