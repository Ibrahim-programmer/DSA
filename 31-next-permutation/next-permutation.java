class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        if (n == 1)
            return;
        int i = n - 2;
        while (i >= 0) {
            int res = checkImmediateLowest(nums, i);
            if (res != -1) {
                // rotate(nums,i,n-1);
                // rotate(nums,i,i+k-1);
                // rotate(nums,i+k,n-1);
                // rotate(nums,i+k+1,n-1);

                int temp = nums[i];
                nums[i] = nums[res];
                nums[res] = temp;
                rotate(nums, i + 1, n - 1);
                return;
            } else {
                i--;
            }
        }
        if (i == -1) {
            rotate(nums, 0, n - 1);
            return;
        }

    }

    public int checkImmediateLowest(int[] arr, int i) {
        int n = arr.length;
        for (int j = n - 1; j > i; j--) {
            if (arr[j] > arr[i]) {
                return j;
            }
        }
        return -1;
    }

    public void rotate(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}