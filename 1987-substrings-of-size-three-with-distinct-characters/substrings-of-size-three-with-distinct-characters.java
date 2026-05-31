class Solution {
    public int countGoodSubstrings(String s) {
        int count =0;
        int i=0;
        
        while(i+2<s.length()){
            if(s.charAt(i) != s.charAt(i+1) && s.charAt(i) != s.charAt(i+2) && s.charAt(i+2) != s.charAt(i+1)) count++;
            i++;
        }
        return count;
    }
}