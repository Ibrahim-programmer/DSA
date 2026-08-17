// class Solution {
//     public int arrangeCoins(int n) {
//         int i=1;
//         while(true){
//             n=n-i;
//             if(n-(i+1)<0)
//             break;
//             i++;

//         }
//         return i;
//     }
// }
class Solution {
    public int arrangeCoins(int n) {
        if(n==1) return n;
        int s = 1;
        int e = n;
        int mid ;
        long cost = 0;
        while(s<=e){
            mid = s + (e-s)/2;
            cost =(long) mid * (mid +1)/2;
            if(cost <= n){
                 s= mid + 1;
            }
            else{
                e= mid -1;
            }
        }
        return e;
    }
}