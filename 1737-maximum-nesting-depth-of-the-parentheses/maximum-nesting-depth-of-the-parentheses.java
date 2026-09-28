class Solution {
    public int maxDepth(String s) {
        int count = 0;
        int len = 0;
        for(char i:s.toCharArray()){
            if(i=='('){
                count++;
            }
            else if(i==')'){
                count--;
            }
            len = Math.max(len,count);
        }
        return len;
    }
}