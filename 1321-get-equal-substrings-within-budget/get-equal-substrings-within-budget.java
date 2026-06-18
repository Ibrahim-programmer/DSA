class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int n = s.length();
        int sum[] =new int[n];
        for(int i=0;i<n;i++){
            sum[i]= Math.abs(s.charAt(i) - t.charAt(i));
        }
        int currentSum = 0;
        int ml =0;
        int j=0;
        for(int i=0;i<n;i++){
            currentSum += sum[i];
            while(currentSum > maxCost){
                currentSum -= sum[j++];
            }
            ml = Math.max(i-j+1,ml);
        }
        return ml;
    }
}