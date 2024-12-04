package Arrays.Matrix;

public class CountSquareSubMatrix {
    int m,n;
    public static void main(String[] args) {
        int [] [] arr = {
                {0,1,1,1},
                {1,1,1,1},
                {0,1,1,},
        };
        int ans  = solve(0,0,arr);
        System.out.println(count(arr));

    }

    public static  int count( int [][] arr){
        int result = 0;
        int m = arr.length;
        int n = arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(arr[i][j]==1){
                    result+=solve(i,j, arr);
                }
            }
        }
        return result;
    }


    public static  int solve( int row, int col , int [][]arr){
      if( row>= arr.length|| col >= arr[0].length){
          return 0;
      }

        if(arr[row][col]==0){
            return 0;
        }

        int right = solve(row, col+1, arr);
        int diag = solve(row+1, col+1, arr);
        int below = solve(row+1, col, arr);
        return 1+ Math.min(right, Math.min(diag, below));

    }
}
