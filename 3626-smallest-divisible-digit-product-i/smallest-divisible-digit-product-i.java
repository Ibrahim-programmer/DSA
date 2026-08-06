class Solution {
    public int smallestNumber(int n, int t) {
        int temp,pro;
        while(true){
            temp = n;
            pro = 1;
            while(temp % 10 != temp){
                pro *= temp % 10;
                temp /=10;
            }
            pro*=temp;
            System.out.println(pro);
            if(pro % t == 0){
                return n;
            }
            n++;
        }
    }
}