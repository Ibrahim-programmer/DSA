class Solution {
    public int maxDistinct(String s) {
        int arr[] = new int[26];
        for(char i:s.toCharArray()){
            arr[i-'a']=1;
        }
        int count =0;
        for(int i=0;i<26;i++){
            if(arr[i]==1) count++;
        }
        return count;
    }
}