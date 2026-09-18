class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> arr = new HashSet<>();
        if(nums.length==0) return 0;
        int count = 1,maxCount =1;
        for(int i:nums){
            arr.add(i);
        }
        for(int i:arr){
            if(!arr.contains(i-1)){
                count =1;
                while(arr.contains(i+count))    count++;
                maxCount = Math.max(maxCount,count);
            }
        }
        return maxCount;
    }
}