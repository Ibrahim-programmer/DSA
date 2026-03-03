class Solution {
    public int[] sortedSquares(int[] nums) {
        int temp[] = new int[nums.length];
        int i=0;
        int index = nums.length -1;
        int j = nums.length -1;
        while(i<=j){
            if(Math.abs(nums[i])>Math.abs(nums[j])){
                temp[index--] = nums[i] * nums[i];i++;
            }
            else{
                temp[index--] = nums[j] * nums[j];
                j--;
            }
        }
        return temp;
        
    }
}