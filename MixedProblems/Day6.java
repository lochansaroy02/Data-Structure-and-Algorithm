package MixedProblems;

import java.util.Arrays;

public class Day6 {

    public static void main(String[] args) {
       int [] arr = {2,1,3,5,6};
        solution(arr, 2, 2 );


    }

    //  Final Array state after K operation

    public static  void  solution(int [] arr, int k , int m){
        for (int count = 0; count < k; count++) {
            int minIndex = 0;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < arr[minIndex]) {
                    minIndex = i;
                }
            }
            arr[minIndex] *= m; // Multiply the smallest element by m
        }
        System.out.println(Arrays.toString(arr));

    }

    //count almost equal pairs
    public  static  int countPair(int [] arr){

        return 1;
    }
    public  static  int swapDigit(int n){


        return n;
    }

}
