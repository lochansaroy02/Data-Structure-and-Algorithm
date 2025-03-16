package Arrays.Matrix;

public class FindTheTarget {
    public static void main(String[] args) {

    }

    public static  boolean binarySearch(int [][] arr , int k){
        int m = arr.length;
        int  n = arr[0].length;
        int start = 0;
        int end = m*n -1;

        while( start <= end){
            int mid = start + (end - start)/2;
            int el = arr[mid/n][mid%n];

            if(el > k ){
                end = mid-1;
            } else if (el < k) {
                start = mid+1;
            }else{
                return  true;
            }
        }
        return false;
    }
}
