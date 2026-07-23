class Solution {
    public int majorityElement(int[] nums) {
        int count =0;
        int n = nums.length;
        int ele = 0;
        int i=0;
        for(;i<n;i++){
            if(count == 0){
                ele = nums[i];
            }
            if(ele != nums[i])  count--;
            else    count++;
        }        
        return ele;
    }
}