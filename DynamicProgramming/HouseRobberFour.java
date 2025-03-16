package DynamicProgramming;

import java.util.Arrays;

public class HouseRobberFour {
    public static void main(String[] args) {

    }
    public  static  int solve(int [] arr, int i, int k, int n, int [][] t){
        if(k==0){
            return  0;
        }

        if(i>= n){
            return Integer.MAX_VALUE;

        }
        if(t[i][k]!=-1){
            return t[i][k];
        }
        int steal = Math.max(arr[i], solve(arr, i+2, k-1, n,t));
        int skip = solve(arr, i+1, k, n,t);

        return t[i][k] =  Math.min(steal, skip);
    }
    public static  int houseRobber(int [] arr, int k){
        int n = arr.length;
        int [][] t = new int[n+1][k+1];
        Arrays.fill(t, -1);
        return  solve(arr, 0, k, n, t);
    }
}
