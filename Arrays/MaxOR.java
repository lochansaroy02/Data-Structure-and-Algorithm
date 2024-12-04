package Arrays;

import java.util.ArrayList;

public class MaxOR {
    public static void main(String[] args) {
        int [] arr = {3,1};
        System.out.println( maxOR(arr));
    }
    public static  int maxOR ( int [] arr){
        int maxOR = 0;
        int currOr = 0;
        for (int j : arr) {
            maxOR = maxOR | j;

        }


        return  countSubset(0, currOr, arr, maxOR);

    }

    public  static  int countSubset(int index, int currOR , int [] arr ,int maxOR ){
        //base case

        if(index== arr.length){
            if(currOR== maxOR){
                return 1;
            }
            return 0;
        }
        //take
        int take = countSubset(index+1, currOR| arr[index], arr, maxOR);

        //not take
        int notTake = countSubset(index+1, currOR, arr, maxOR);

        return take+notTake;
    }
}
