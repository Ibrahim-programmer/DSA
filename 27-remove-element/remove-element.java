class Solution {
    public int removeElement(int[] nums, int val) {
        int  i= 0;
        for(;i<nums.length;i++){
            if(nums[i] == val){
                int j=i+1;
                while(j<nums.length && nums[j] == val) j++;
                if(j == nums.length) return i;
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                
            }
        }
        return i;
    }
}