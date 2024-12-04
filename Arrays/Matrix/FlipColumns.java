package Arrays.Matrix;

public class FlipColumns {
    public static void main(String[] args) {

    }
    public static  int flip( int [][] arr){
        int m = arr.length;
        int n = arr[0].length;


        int maxRow = 0;
        for(int [] currRow : arr){
            int [] invertedRow = new int[n];

            for(int col =0;  col < n; col++){
                invertedRow[col] = currRow[col]==0? 1: 0;
            }
            int count = 0;
            for(int [] row : arr){
                if(row== currRow || row == invertedRow){
                    count++;
                }
            }

            maxRow = Math.max(maxRow, count);
        }

        return maxRow;
    }
}
