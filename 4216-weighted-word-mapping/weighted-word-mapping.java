class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        String res ="";
        for(String i:words){
            int sum =0;
            for(char j: i.toCharArray()){
                sum += weights[j-97];
            }
            sum %= 26;
            res += Character.toString((char)(122-sum));
        }
        return res;
    }
}