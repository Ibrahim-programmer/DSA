class Solution {
    public int removeDuplicates(int[] nums) {
        int count =0;
        int j =0;
        int ele = nums[0];
        int i=0;
        for(;i<nums.length;i++){
            if(ele == nums[i]){
                count++;
            }
            else{
                count = 1;
                ele = nums[i];
            }
            if(j != i){
                // while(i<nums.length && nums[i]== ele) i++;
                int  temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
            if(count <= 2){
                j++;
            }
        }
        return j;
    }
}