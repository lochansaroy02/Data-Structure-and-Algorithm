package DynamicProgramming;

import java.sql.Array;
import java.util.Arrays;

public class HouseRobberTwo {

    static  int [] t = new int[101];


    public  static  int solve(int [] arr , int i, int n){
        if(i> n ){
            return 0;
        }

        if(t[i]!=-1){
            return t[i];
        }

        int steal = arr[i]+ solve(arr, i+2, n);
        int skip =  solve(arr, i+1, n);
        return t[i] =  Math.max(steal, skip);

    }
    public static  int HouseRobberTwo(int [] arr){
        int n = arr.length;
        if(n== 1){
            return  arr[0];
        }
        if(n==2){
            return Math.max(arr[0], arr[1]);
        }

        Arrays.fill(t, -1);
        // case 1 from 0 to n-2
        int caseOne = solve(arr, 0, n-2);
        // case 2 from 1 to n-1
        Arrays.fill(t, -1);
        int caseTwo = solve(arr, 1, n-1);
        return  Math.max(caseOne, caseTwo);

    }


    public static int bottomUp ( int [] arr){
        int n= arr.length;
        int [] t = new int[n+1];

        // case 1

        t[0] = 0;
        for (int i = 1; i <=n-1 ; i++) {
            int skip = t[i-1];
            int steal = arr[i-1]+ ((i>=0)? t[i-2] : 0);
            t[i] = Math.max(skip, steal);
        }

        int res1 = t[n-1];
        Arrays.fill(t, 0);
        t[0] = 0;
        t[1] = 1;
        for (int i = 2; i <=n ; i++) {
            int skip = t[i-1];
            int steal = arr[i-1]+ ((i>=0)? t[i-2] : 0);
            t[i] = Math.max(skip, steal);
        }
        int res2 = t[n];

        return Math.max(res1, res2);


    }



    // house robber 1 code
}


