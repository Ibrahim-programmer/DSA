class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int product = 1;
        int org = n;
        while(n>0){
            sum += n%10;
            product *= n%10;
            n/=10;
        }
        sum += product;
        return org % sum == 0;
    }
}