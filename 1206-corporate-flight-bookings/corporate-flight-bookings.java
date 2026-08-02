class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] nums=new int[n];
        for(int i[]:bookings){
            nums[i[0]-1]+=i[2];
            if(i[1]!=n) nums[i[1]]-=i[2];
        }
        for(int i=1;i<n;i++){
            nums[i]+=nums[i-1];
        }
        return nums;
    }
}