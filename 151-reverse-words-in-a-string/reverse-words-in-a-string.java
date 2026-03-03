class Solution {
    public String reverseWords(String s) {
        String temp ="";
        int i= s.length()-1;
        while(i > -1){
            if(s.charAt(i) != ' '){
                int j= i;
                while(j>=0 && s.charAt(j)!=' '){
                    j--;
                }
                if(temp.equals("")){
                temp += s.substring(j+1,i+1);
                }
                else{
                    temp += " " + s.substring(j+1,i+1);
                }
                i=j-1;
            }
            else{
                i--;
            }
        }
        return temp;
    }
}