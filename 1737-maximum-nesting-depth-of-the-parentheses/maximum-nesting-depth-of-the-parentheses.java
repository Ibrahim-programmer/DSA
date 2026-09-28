class Solution {
    public int maxDepth(String s) {
        Stack<Integer> st = new Stack<>();
        int len = 0;
        for(char i:s.toCharArray()){
            if(i=='('){
                st.push(1);
            }
            else if(i==')'){
                st.pop();
            }
            len = Math.max(len,st.size());
        }
        return len;
    }
}