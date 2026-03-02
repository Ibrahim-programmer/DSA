class Solution {

    public static  void merge(int nums1[],int m, int nums2[],int n){
        if( n == 0 ) return ;
        int i = m-1;
        int index =nums1.length -1;
        int j = n-1;
        while( j>-1 && i>-1){
            if(nums1[i] > nums2[j]){
                nums1[index--]= nums1[i];
                
                nums1[i--] = 0;
            }
            else{
               {
                    nums1[index--] = nums2[j];
                    j--;
                }
            }
        }
        while (j>-1) {
            nums1[index--] = nums2[j];
                    j--;
        }
    }
}