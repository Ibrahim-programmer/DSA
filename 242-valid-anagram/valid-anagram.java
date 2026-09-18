class Solution {
    public boolean isAnagram(String s, String t) {
        int []s1 = new int[26];
        int []s2 = new int[26];
        for(char i:s.toCharArray()){
            s1[i-'a']++;
        }
        for(char i:t.toCharArray()){
            s2[i-'a']++;
        }
        for(int i=0;i<26;i++){
            if(s1[i]!= s2[i])   return false;
        }
        return true;
    }
}