class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        if(s.length() == 0) return true;
        if(s.length() == 1) return false;
        for (char i : s.toCharArray()) {
            switch (i) {
                case '(':
                case '[':
                case '{':
                    st.push(i);
            }
            

                switch (i) {
                    case ')': {
                        if (st.size()<1 ||st.peek() != '(')
                            return false;
                        else
                            st.pop();
                        break;
                    }
                    case '}': {
                        if (st.size()<1 ||st.peek() != '{')
                            return false;
                        else
                            st.pop();
                        break;
                    }
                    case ']': {
                        if (st.size()<1 || st.peek() != '[')
                            return false;
                        else
                            st.pop();
                        break;
                    }
                }
            
        }
        return st.size() == 0;

    }
}