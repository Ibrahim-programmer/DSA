class Solution {
    public int findLengthOfShortestSubarray(int[] arr) {
        int l = 0, r = arr.length - 1;
        while (r - 1 >= 0 && arr[r] >= arr[r - 1])
            r--;
        if (r == 0)
            return 0;
        int sm = r ;
        while (l + 1 < arr.length) {
            while (r < arr.length && arr[r] < arr[l])
                r++;
            sm = Math.min(sm, r - l - 1);
            if (arr[l] <= arr[l + 1]){
                l++;
            }
            else {
                break;
            }
        }
        return sm;
    }
}