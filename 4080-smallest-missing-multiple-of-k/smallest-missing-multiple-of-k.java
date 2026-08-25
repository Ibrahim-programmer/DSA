class Solution {
    public int missingMultiple(int[] nums, int k) {
        int arr[] = new int[101];
        
        int n = nums.length;
        for(int i:nums){
            if(i % k == 0){
                arr[i]++;
            }
        }
        int i=k;
        for(;i<101;i+=k){
            if(arr[i]==0){
                return i;
            }
        }
        return i ;
    }
}