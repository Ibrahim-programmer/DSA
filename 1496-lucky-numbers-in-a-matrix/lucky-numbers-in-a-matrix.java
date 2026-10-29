class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> al = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        for(int i = 0 ; i < m ; i++ ){
            int minJ = 0;
            // int min = Integer.MAX_VALUE;
            for(int j = 0; j < n ; j++){
                if(matrix[i][j] < matrix[i][minJ]){
                    minJ = j;
                }
            }
            int maxI = 0;
            for(int k = 0; k < m ; k++){
                if(matrix[k][minJ] > matrix[maxI][minJ]){
                    maxI = k;
                }
            }
            if(matrix[i][minJ] == matrix[maxI][minJ]){
                al.add(matrix[i][minJ]);
            }
        }
        return al;
    }
}