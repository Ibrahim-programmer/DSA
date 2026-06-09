class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> li = new ArrayList<>();
        Map<String,Integer> mp = new HashMap<>();
        for(int i =0;i+9<s.length();i++){
            String temp = s.substring(i,i+10);
            mp.put(temp,mp.getOrDefault(temp,0)+1);
        }
        for(String i:mp.keySet()){
            if(mp.get(i)>1){
                li.add(i);
            }
        }
        return li;
        
    }
}