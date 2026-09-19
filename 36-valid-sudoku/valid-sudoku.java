// import java.util.Arrays;

public class Solution {

    

    public  boolean isValidSudoku(char[][] board) {
        for (char i[] : board) {
            if (!checkRow(i)) {
                System.out.println("In rows");
                return false;
            }
        }

        // columns
        char temp[][] = new char[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                temp[i][j] = board[j][i];
            }
        }
        for (char i[] : temp) {
            if (!checkRow(i)) {
                System.out.println("In cols");
                return false;
            }
        }

        // cells
        for(int i=0;i<9;i+=3){
            for(int j =0;j<9;j+=3){
                char cell[][] = new char[3][3];
                for(int k =0;k<3;k++){
                    for(int l=0;l<3;l++){
                        cell[k][l]=board[i+k][j+l];
                    }
                }
                if(!checkCell(cell)){
                    System.out.println(Arrays.toString(cell[0]));
                    System.out.println("In cells");
                    return false;
                }
            }

        }
        return true;
    }

    public  boolean checkRow(char[] row) {
        int arr[] = new int[9];
        for (char i : row) {
            if (i != '.')
                arr[i - '0'-1]++;
        }
        for (int i = 0; i < 9; i++) {
            if (arr[i] > 1) {
                return false;
            }
        }
        return true;
    }

    public  boolean checkCell(char[][] cell) {
        int arr[] = new int[9];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (cell[i][j] != '.') {
                    arr[cell[i][j] - '0'-1]++;
                }
            }
        }
        for (int i = 0; i < 9; i++) {
            if (arr[i] > 1) {
                return false;
            }
        }
        return true;
    }

}
