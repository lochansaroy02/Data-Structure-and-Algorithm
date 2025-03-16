package Arrays.DifferanceArray;

import java.util.Arrays;

public class RangeAddition {
    public static void main(String[] args) {
            int [] arr= {0,0,0,0,0};
            int [][] query = {{1,3,2},{2,4,3},{0,2,-2}};
            bruteForce(arr, query);
            optimise(arr, query);
    }
    public static  void bruteForce(int [] arr, int [][] queries){
        for(int [] query : queries){
            int start= query[0];
            int end = query[1];
            int val = query[2];

            for (int i = start; i < end; i++) {
                arr[i] += val;
            }
        }
//
        System.out.println(Arrays.toString(arr));
    }


    public static void optimise( int [] arr, int [][] queries){



        for(int [] query : queries  ){
            int x = query[0];
            int y = query[1];
            int val = query[2];

            arr[x] = val;
            if(y+1 < arr.length ){
            arr[y+1] = val;
            }
        }

        System.out.println(Arrays.toString(arr));

        //finding cumulative sum array

        int [] ans = new int[arr.length];
        int cumSum = 0;

        for(int i = 0; i < ans.length; i++){
           cumSum += arr[i];
           ans[i] = cumSum;

        }
        System.out.println(Arrays.toString(ans));
    }
}
