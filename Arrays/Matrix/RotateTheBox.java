package Arrays.Matrix;

public class RotateTheBox {
    public static void main(String[] args) {

    }
    public static   void transpose ( int [][] arr){
        int m = arr.length;
        int n = arr[0].length;
        int [][] ans = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ans[i][j] = arr[j][i];
            }
        }

        for( int [] row: arr){
            reverse(row);
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();

        }
    }

    public static  void reverse(int [] arr){
        int i = 0;
        int j = arr.length;
        while(i< j){
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            i++;
            j--;
        }
    }
}
