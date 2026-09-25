class Solution {
    public boolean wordPattern(String pattern, String s) {
        int n = pattern.length();
        String[] arr = new String[26];
        String []temp = s.split(" ");
        if(n != temp.length) return false;
        Set<String> used = new HashSet<>();
        for(int i=0;i<n;i++){
            char index = pattern.charAt(i);
            if(arr[index -'a'] != null){ 
                if( !(arr[index-'a'].equals(temp[i])) )
                return false;
            }
            else{
                if(used.contains(temp[i]))
                    return false;
            arr[index-'a'] = temp[i];
            used.add(temp[i]);
                
            }
        }
        System.gc();
        return true;
    }
}