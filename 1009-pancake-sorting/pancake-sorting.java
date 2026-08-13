class Solution {
    public List<Integer> pancakeSort(int[] arr) {
        List<Integer> flips = new ArrayList<>();
        int index = arr.length -1;
        while (index > 0) {

            int k = search(arr, index + 1, index);

            // Already in correct position
            if (k == index) {
                index--;
                continue;
            }

            if (k != 0) {
                rotate(arr, k);
                flips.add(k + 1);
            }
            rotate(arr, index);
            flips.add(index + 1);

            index--;
        }

        return flips;
    }

    public void rotate(int arr[], int k) {
        int start = 0;
        while (start < k) {
            int temp = arr[start];
            arr[start] = arr[k];
            arr[k] = temp;
            start++;
            k--;
        }
    }

    public int search(int arr[], int x, int n) {
        for (int i = 0; i <= n; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
}