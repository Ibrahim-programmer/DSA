class NumMatrix {
    int mat[][];
    public NumMatrix(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        mat= new int[n][m];
        for(int i=0;i<n;i++){
            mat[i][0]=matrix[i][0];
            for(int j =1;j<m;j++){
                mat[i][j]= mat[i][j-1] + matrix[i][j];
            }
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum =0;
        for(int i = row1;i<= row2;i++){
            if(col1 == 0)
            sum+= mat[i][col2];
            else
                sum += mat[i][col2]-mat[i][col1-1];
        }
        return sum;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */