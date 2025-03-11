package BItwise;

import java.util.Arrays;

public class NeighbourXOR {
    public static void main(String[] args) {
        int [] arr = {1,0};
        System.out.println(xor(arr));
        System.out.println(xor2(arr));
    }
    public static boolean  xor( int [] derived){
        int n = derived.length;
        int [] org = new int[n];
        generate(derived, org, 0);
        if((org[n-1]^ org[0])== derived[n-1]){
            return true;
        }

        generate(derived,org, 1 );
        if((org[n-1]^ org[0])== derived[n-1]){
            return true;
        }
        return false;
    }
    public static  void generate(int [] arr, int [] org, int start){
        org[0] = start;
        for(int i = 0; i < arr.length-1;i++){
            org[i+1] = org[i]^arr[i];
        }
    }


    // 2nd approach

    public static  boolean xor2 ( int []arr){
        int xor = 0;
        for(int x : arr){
            xor^= x;
        }
        return xor == 0;
    }
}
