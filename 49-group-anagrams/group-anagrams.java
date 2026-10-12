class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n = strs.length;
        List<List<String>> ans = new ArrayList<>();
        Map<String,List<String>> match = new HashMap<>();
        for(int i = 0; i < n ; i++){
            String temp = strs[i];
            int arr[] = new int[26];
            for(char j:temp.toCharArray()){
                arr[j - 'a']++;
            }
            StringBuffer key = new StringBuffer();
            for(int j = 0;j < 26; j++){
                while(arr[j] != 0){
                    key.append((char)( j + 'a'));
                    arr[j]--;
                }
            }
            if(!match.keySet().contains(key.toString())){
                List<String> al = new ArrayList<>();
                al.add(temp);
                match.put(key.toString(),al);
            }
            else{
                match.get(key.toString()).add(temp);
            }
        }
        for(String key:match.keySet()){
            ans.add(match.get(key));
        }
        return ans;
    }
}