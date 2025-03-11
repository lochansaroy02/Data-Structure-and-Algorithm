package Arrays.Basic;

public class IsSorted {
    public static void main(String[] args) {
            int [] arr = {1,2,3,5,6};
        System.out.println(isSorted(arr));

    }
    public static  boolean isSorted( int [] arr){
        // TC : O(n)
        int i  = 1;
        while( i < arr.length){
            if( arr[i-1]>arr[i]) {
                return false;
            }
            i++;
        }
        return true;
    }

}
