class Solution {
    public int getMin(int []arr){
        int minJ = 0;
        int n = arr.length;
        for(int j = 0; j < n ; j++){
                if(arr[j] < arr[minJ]){
                    minJ = j;
                }
        }
        return minJ;
    }
    public int getMax(int[][] mat,int minJ){
        int maxI = 0;
        int m = mat.length;
        for(int k = 0; k < m ; k++){
                if(mat[k][minJ] > mat[maxI][minJ]){
                    maxI = k;
                }
            }
        return maxI;
    }
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> al = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i = 0 ; i < m ; i++ ){
            int minJ =  getMin(matrix[i]);
            int maxI = getMax(matrix,minJ);
            if(matrix[i][minJ] == matrix[maxI][minJ]){
                al.add(matrix[i][minJ]);
            }
        }
        return al;
    }
}