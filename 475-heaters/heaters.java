class Solution {
    public  int findRadius(int[] houses, int[] heaters) {
        int radius = 0;
        Arrays.sort(heaters);
        for (int i = 0; i < houses.length; i++) {
            int temp = search(heaters, houses[i]);
            radius = Math.max(temp, radius);
        }
        return radius;
    }

    public  int search(int arr[], int tar) {
        int s = 0;
        int e = arr.length - 1;
        int mid = 0;
        while (s <= e) {
            mid = s + (e - s) / 2;
            if (arr[mid] == tar)
                return 0;
            else if (arr[mid] > tar)
                e = mid - 1;
            else
                s = mid + 1;
        }
        if (e < 0)
            return arr[s] - tar;
        if (s >= arr.length)
            return tar - arr[e];
        int leftDis = tar - arr[e];
        int rigthDis = arr[s] - tar;
        return Math.min(leftDis, rigthDis);
    }
}
