class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        parent(ans,0,0,n,"");
        return ans;
    }
    public  void parent(List<String> ans,int open,int close,int n,String st){
        if(close == n){
            ans.add(st);
            return;
        }
        if(open < n){
            parent(ans,open + 1,close,n, st +"(");
        }
        if(close < open){
            parent(ans,open,close+1,n, st +")");
        }
    }
}