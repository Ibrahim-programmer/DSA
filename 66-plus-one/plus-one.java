class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        int ans=0;
        // digits[n-1] = (digits[n-1] +1) % 10;
        // byte carry = (digits[n-1] % 10 == 1)?1:0;
        int i = n-1;
        int carry =1 ;
        while(i>=0 && carry == 1 ){
            carry =  ((digits[i]+1) % 10 == 0)?1:0;
            digits[i] = (digits[i] +1) % 10;
            i--;
        }
        
        if(carry == 0){
            return digits;
        }
        else{
            int []res = new int[n+1];
            for(int j =1;j<n;j++){
                res[j] = digits[j-1];
            }
            res[0]=1;
            return res;

        }


        // StringBuffer ans = new StringBuffer();
        // int carry = 1;
        // int i = n - 1;
        // while (i >= 0) {
        //     if (carry == 1) {

        //         if (digits[i] == 9) {
        //             ans.append("0");
        //             carry = 1;
        //             if(i==0){
        //                 ans.append("1");
        //             }
        //         } else {
        //             ans.append(Integer.toString(digits[i] + 1));
        //             carry = 0;
        //         }
        //     }
        //     else{
        //         ans.append(Integer.toString(digits[i]));
        //     }
        //     i--;
        // }
        // ans.reverse();
        // int len = ans.length();
        // int result[] = new int[len];
        // for (int j = 0; j < len; j++) {
        //     result[j] = Character.getNumericValue(ans.charAt(j));
        // }
        // return result;
    }
}