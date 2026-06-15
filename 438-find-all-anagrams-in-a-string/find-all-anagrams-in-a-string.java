class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        if(s.length() < p.length()) return new ArrayList<>();

        Map<Character,Integer> mp1 = new HashMap<>();
        Map<Character,Integer> mp2 = new HashMap<>();
        List<Integer> ans = new ArrayList<>();

        for(char i: p.toCharArray()){
            mp1.put(i,mp1.getOrDefault(i,0)+1);
        }

        int j=0;
        for(int i=0;i<s.length();i++){
            mp2.put(s.charAt(i),mp2.getOrDefault(s.charAt(i),0)+1);
            if(i-j+1 > p.length()){
               if(mp2.get(s.charAt(j))-1 ==0){
                    mp2.remove(s.charAt(j));
               } 
                else
                    mp2.put(s.charAt(j),mp2.getOrDefault(s.charAt(j),0)-1);
                j++;
            }
                if(i-j+1 == p.length() && mp2.equals(mp1)){
                    ans.add(j);
                }
            
        }
        return ans;
    }
}