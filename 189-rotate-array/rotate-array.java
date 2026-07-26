class Solution {

    public void rotateBoundaries(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length - 1;
        k = k % (n + 1);
        rotateBoundaries(nums, 0, n);
        rotateBoundaries(nums, 0, k - 1);
        rotateBoundaries(nums, k, n);
    }
}