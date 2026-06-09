class Solution {
    public int longestSubstring(String s, int k) {
        int n = s.length();
        if(n==0 || n<k) return 0;
        if(n==1) return n;
        Map<Character,Integer> mp = new HashMap<>();
        for(char i:s.toCharArray()){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        int i =0;
        while(i<n && mp.get(s.charAt(i))>=k) i++;
        if(i>=n-1) return i;
        int s1 = longestSubstring(s.substring(0,i),k);
        while(i<n && mp.get(s.charAt(i))<k) i++;
        int s2=0;
        if(i<n) {
            s2 = longestSubstring(s.substring(i),k);
        }
        return Math.max(s1,s2);
    }
}