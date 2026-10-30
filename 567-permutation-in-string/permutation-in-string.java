class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] arr = new int[26];
        int[] arr2 = new int[26];
        int j = 0;
        for(char i : s1.toCharArray()){
            arr[i - 'a']++;
        }
        int n = s2.length();
        int winLength = s1.length();
        for(int i = 0 ; i < n ; i++){
            arr2[s2.charAt(i) - 'a'] ++;
            if(i - j + 1 == winLength){
                boolean check = true;
                for(int k = 0 ; k < 26 ; k ++ ){
                    if(arr[k] != arr2[k]){
                        check = false;
                    }
                }
                if(check){
                    return true;
                }
                arr2[s2.charAt(j) - 'a']--;
                j++;
            }
            
        }
        return false;
    }
}