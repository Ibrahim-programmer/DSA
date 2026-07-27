class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        if(n==1) return true;
        int i=0;
        while(i<n){
            int j=i+1;
            if(nums[i]==0){
                return false;
            }
            int max = j;
            while(j<=i+nums[i]){
                if(j+nums[j]>= n-1){
                    return true;
                }
                if(max + nums[max] <= j + nums[j]){
                    max = j;
                }
                j++;
            }
            i = max;       
}
        return false;
    }
}