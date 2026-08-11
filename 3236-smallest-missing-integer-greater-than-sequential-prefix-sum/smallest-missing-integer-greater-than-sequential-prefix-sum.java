class Solution {
    public int missingInteger(int[] nums) {
        int n = nums.length;
        if(n==1) return nums[0]+1;
        int sum = nums[0];
        int i=1;
        for(;i<n;i++){
            if(nums[i]== nums[i-1]+1){
                sum+= nums[i];
            }
            else{
                break;
            }
        }
        // Arrays.sort(nums);
        while (check(nums, sum)) {
            sum++;
        }
        return sum;

    }

    public boolean check(int arr[], int k) {
        for(int i:arr){
            if(i == k) return true;
        }
        return false;
    }

}