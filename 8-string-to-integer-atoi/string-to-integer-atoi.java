class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        int n = s.length();
        int i = 0;
        if(n==0){
            return 0;
        }
        int sign = 1;
        if (s.charAt(i) == '-' || s.charAt(i)=='+') {
            sign = (s.charAt(i) == '-') ?-1:1;
            i++;
        }
        long num = 0;
        while (i < n && Character.isDigit(s.charAt(i))) {
            num = num * 10 + (s.charAt(i) - '0');
            i++;
            
            if (num*sign > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (num*sign < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
        }
        return (int)num*sign;
    }
}