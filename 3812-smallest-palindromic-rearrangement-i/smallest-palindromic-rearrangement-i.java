class Solution {
    public String smallestPalindrome(String s) {
     int arr[] = new int[26];
        for(char i:s.toCharArray()){
            arr[i-'a']++;
        }
        int index = 0;
        int n = s.length()-1;
        char res[] = new char[n+1];
        for(int i=0;i<26;i++){
            int val = arr[i];
            char ch = (char)(i + 'a');
            while(val>0){
            if(val== 1){
                res[n/2]=ch;
                val--;
            }else{
                res[index]=ch;
                res[n-index] = ch;
                val-=2;
                index++;
            }
            }
        }
        return new String(res);   
    }
}