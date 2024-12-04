package BItwise;

import java.util.ArrayList;
import java.util.Arrays;

public class MaximumXOR {
    public static void main(String[] args) {
                int [] arr= {2,3,4,7};
                maxXOR(arr,3);
    }
    public  static  void maxXOR( int []arr, int maxBit){
        int [] ans = new int[arr.length];
       // find the total xor
        int xor = 0;
        for (int j : arr) {
            xor ^= j;

        }
        //to get the flip bit we need mask.
        // mask = 2^masBit - 1
        int mask = ((1<<maxBit)-1);


        for (int i = 0; i < arr.length; i++) {
            int k = xor^mask;
            ans[i] = k;
            xor^= arr[arr.length-i-1];


        }

    }
}
