class Solution {
    public String processStr(String s) {
        StringBuffer sb = new StringBuffer();
        for(int j=0;j<s.length();j++){
            char i = s.charAt(j);
            switch(i){
                case '#' -> sb.append(sb.toString());
                case '%' -> sb.reverse();
                case '*' -> {
                    if(sb.length() != 0)
                    sb.deleteCharAt(sb.length()-1);
                }
                default  ->  sb.append(i);
            }
        }
        return sb.toString();
    }
}