package MixedProblems;

import java.util.ArrayList;
import java.util.Arrays;

public class XorQueries {
    public static void main(String[] args) {
            int [] arr = {16};
        int [] [] queries = {{0,0}, {0,0}, {0,0},{0,0}};
            int [] ans = solve(arr, queries);
        System.out.println(Arrays.toString(ans));
    }

    public static  int [] solve( int [] arr, int [][] queries){

        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];
            if (start >= 0 && end < arr.length) {
                ans[i] = getXOR(arr, start, end);
            } else {
                // Handle the case where the query is out of bounds
                ans[i] = -1; // Or any other appropriate value to signal an invalid query
            }


        }
        return ans;

    }
    public static  int getXOR( int [] arr, int start , int end){
        int xor = 0;
        for (int i = start; i<=end ; i++) {
            xor= xor^arr[i];
        }
        return  xor;
    }

}
