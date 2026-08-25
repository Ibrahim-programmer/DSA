class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len=0;
        int i =0;
        int j =0;
        int n = s.length();
        Map<Character,Integer> freq = new HashMap<>();
        for(;i<n;i++){

            char current = s.charAt(i);
            freq.put(current,freq.getOrDefault(current,0)+1);
            
                while(j<n && freq.get(current)>1){
                    if(freq.get(s.charAt(j))==1){
                        freq.remove(s.charAt(j));
                    }
                    else{
                        freq.put(s.charAt(j),freq.get(s.charAt(j))-1);
                    }
                    j++;
                }
            

            len = Math.max(i-j+1,len);
        }
        return len;
    }
}