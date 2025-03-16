package DynamicProgramming;

import java.util.Arrays;

public class HouseRobberOne {
    public static void main(String[] args) {

    }

    // Recursion + Memoization ( Top-Down  approach)
    static  int [] t = new int[101];
    public static  int houseRobber ( int [] arr, int i){
        int n = arr.length;
        Arrays.fill(t, -1);
        return  solve(arr, 0, n);
    }
    public  static  int solve(int [] arr , int i, int n){
        if(i>= n ){
            return 0;
        }

        if(t[i]!=-1){
            return t[i];
        }

        int steal = arr[i]+ solve(arr, i+2, n);
        int skip =  solve(arr, i+1, n);
        return t[i] =  Math.max(steal, skip);

    }

    // Bottom Up
    public  static  int bottomUp( int [] arr){
        int n = arr.length;

        int [] t = new int[n+1];
        t[0] = 0;
        t[1] = arr[0];
        for (int i = 2; i<=n ; i++) {
            t[i] = Math.max(arr[i-1]+ t[i+2], t[i-1]);
        }
        return  t[n];
    }
}
