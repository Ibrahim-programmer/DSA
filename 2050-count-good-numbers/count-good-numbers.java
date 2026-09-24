class Solution {
    public int countGoodNumbers(long n) {
        long MOD = 1_000_000_007;
        return (int)(pow(5,(n/2+n%2)) * pow(4,n/2) % MOD);
    }
    public long pow(long x,long y){
        long ans = 1;
        long MOD = 1_000_000_007;
        while(y > 0){
            if((y&1)==1){
                ans = (x * ans) % MOD;
                y--;
            }
            else{
                x= (x* x) % MOD;
                y/=2;
            }
        }
        return ans ;
    }
}