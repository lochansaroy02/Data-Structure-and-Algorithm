package Arrays.Matrix;

public class MaximumMoves {
    public static void main(String[] args) {


    }

    public static  int move( int [][]arr){
        int m = arr.length;
        int n = arr[0].length;
        int result = 0;


        int[][] t = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                t[i][j] = -1;
            }
        }
        for (int row = 0; row < m; row++) {
            result = Math.max(result, DFS(row, 0, arr,t));
        }
        return result;
    }
    public  static  int DFS(int row, int col, int[][]arr, int [][]t){
        if(t[row][col]!=-1){
             return t[row][col];
        }

        int m = arr.length;
        int n = arr[0].length;
        int move=0;
        int [] directions = {-1,0,1};


        for(int dir: directions){
            int newRow = row+dir;
            int newCol = col+1;

            if(newRow>= 0  && newRow<m && newCol>=0 && newCol < n && arr[newRow][newCol] > arr[row][col] ){
                move = Math.max(move,1+DFS(newRow, newCol, arr,t));

            }
        }

        return t[row][col] =  move;
    }
}
