class Solution {
    public int longestMountain(int[] arr) {
        int ml = 0;
        int i = 0, j = 0;
        boolean down = false;
        while (i + 1 < arr.length && arr[i] >= arr[i + 1])
            i++;
        while (i < arr.length) {
            if(i+1<arr.length && arr[i]<arr[i+1]){

                j = i;
                while (j + 1 < arr.length && arr[j] < arr[j + 1])
                    j++;
                if(j + 1 < arr.length && arr[j] == arr[j + 1]){
                    i = j+1;
                }
                else{
    
                    if (j!=i && j != arr.length - 1){
                        down = true;
                    }
                    while (down && j + 1 < arr.length && arr[j] > arr[j + 1])
                        j++;
                    System.out.println(arr[j]+""+j);
                    if (down) {
                        ml = Math.max(ml, j - i + 1);
                        System.out.println(ml);
                    }
                    i = j;
                    down = false;
                }
            }
            else{i++;}

        }

        return ml;
    }
}