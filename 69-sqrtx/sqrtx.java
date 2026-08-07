class Solution {
    public int mySqrt(int x) {
        int s = 1;
        int e = x;
        int ans = 0;
        int mid;
        while(s<=e){
            mid = s + (e-s)/2;
            // mid *= mid;
            if( mid > x/mid ){
                e=mid -1;
            }
            else{
                ans = mid;
                s= mid +1;
            }
        }
        return ans;
    }
}