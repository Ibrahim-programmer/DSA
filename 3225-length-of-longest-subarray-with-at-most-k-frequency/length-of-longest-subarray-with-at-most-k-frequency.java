class Solution {
    public int maxSubarrayLength(int[] arr, int k) {
        int i =0;
        int j = 0;
        int n = arr.length;
        int maxLength = 0;
        HashMap<Integer,Integer> mp = new HashMap<>();
        while(j<n){
            mp.put(arr[j], mp.getOrDefault(arr[j],0)+1);
            while(i<n  && mp.get(arr[j])>k){
                mp.put(arr[i],mp.get(arr[i])-1);
                i++;
            }
            maxLength = Math.max(j-i+1,maxLength);
            j++;
        }
        return maxLength;
    }
}