package Arrays.Matrix;

public class ImageOverlap {
    public static void main(String[] args) {
            int [][]a = {{1,1,0}, {0,1,0},{0,1,0}};
            int [][]b = {{0,0,0}, {0,1,1},{0,0,1}};

        System.out.println(imageOverlap(a, b));
    }

    public static  int imageOverlap( int [][] A, int [][]B){
        int n = A.length;
        int ans = 0;
        for (int rowOff = -n+1; rowOff < n; rowOff++) {
            for (int colOff = -n+1; colOff < n; colOff++) {
                int count = countOverlaps( A, B, rowOff, colOff);
                ans = Math.max(ans, count);
            }
        }
        return ans;
    }

    public static  int countOverlaps(int [][]A , int [][] B, int rowOff , int colOFf){
        int n = A.length;
        int count = 0;


        for (int row = 0; row <n ; row++) {
            for (int col = 0; col <n  ; col++) {
                if(row+rowOff < 0 || col+colOFf < 0 || row+rowOff >= n || col+colOFf >= n ){
                    continue;
                }

                count += A[row][col]* B[row+rowOff][ col+colOFf];
            }
        }
        return count;
    }
}
