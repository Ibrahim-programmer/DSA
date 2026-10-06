class Solution {
    public List<String> validStrings(int n) {
        ArrayList<String> ans = new ArrayList<>();
        binaryStr("",ans,0,n);
        return ans;
    }
    public void binaryStr(String str,ArrayList<String> ans, int i,int n){
        if(i==n){
            ans.add(str);
            return;
        }
        if(i==0){
            binaryStr(str + "0" , ans, i + 1,n);
        }
        else {
            if(str.charAt(i-1) != '0')
            binaryStr(str + "0" , ans, i + 1,n);
        }
        binaryStr(str + "1" , ans, i + 1,n);
    }
}