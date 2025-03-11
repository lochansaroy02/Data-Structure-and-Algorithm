package Arrays;

import java.util.Arrays;

public class PivotIndex {
    public static void main(String[] args) {
        int [] arr = {1,7,3,6,5,6};
        System.out.println( pivotIndex(arr));
    }
    public  static  int pivotIndex( int [] arr){
        int n = arr.length;
        int [] left = new int[n];
        // Compute left sum array
        left[0] = arr[0];
        for (int i = 1; i < n; i++) {
            left[i] = left[i - 1] + arr[i];
        }


        int sum = left[left.length-1];

        for (int i = 0; i < arr.length; i++) {
            if(sum- left[i]- arr[i] == left[i]){
                return i;
            }
        }
        return -1;

    }
}
