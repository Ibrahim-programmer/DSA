class Solution {
    public String minWindow(String s, String t) {
        if(t.length() == 0) return "";
        String ans = "";
        Map<Character,Integer> mp = new HashMap<>();
        for(char i:t.toCharArray()){
            mp.put(i,mp.getOrDefault(i, 0)+1);
        }
        int required = t.length();
        int i=0;
        int minWindow = Integer.MAX_VALUE;
        int start_i = 0;
        for(int j =0;j<s.length();j++){
            char z = s.charAt(j);
            if(mp.keySet().contains(z)){
                if(mp.get(z)>0)
                required--;
                mp.put(z,mp.get(z)-1);
            }
            else{
                mp.put(z,-1);
            }
            while(required == 0){
                if(minWindow >j-i+1){
                    minWindow = j-i+1;
                    start_i = i;
                }
                mp.put(s.charAt(i),mp.get(s.charAt(i))+1);
                if(mp.get(s.charAt(i))>0) required++;
                i++;
            }
        }
        if(minWindow == Integer.MAX_VALUE) return "";
        return s.substring(start_i,start_i+minWindow );

    }
}