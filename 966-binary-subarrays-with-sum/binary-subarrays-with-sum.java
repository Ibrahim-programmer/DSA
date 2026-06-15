class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return lessThanOrEqualSum(nums , goal) - lessThanOrEqualSum(nums,goal-1);
    }
    public static int lessThanOrEqualSum(int []arr,int k){
        if (k < 0) return 0;    
        int j=0;
        int sum =0;
        int count =0;
        for(int i =0;i<arr.length;i++){
            sum += arr[i];
            while(j<=i && sum > k){
                sum -= arr[j++];
            }
            count += i-j+1;
        }
        return count;
    }
}