package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class MaximumCandies {
    public static void main(String[] args) {



    }

    public static void solution(int[] arr, int extraCandies) {
        ArrayList<Boolean> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            arr[i] = arr[i]+extraCandies;
            int max = findMax(arr);
            if(arr[i]==max){
                list.add(true);
            }else{
                list.add(false);
            }
            arr[i] =temp;
        }

    }

    // Helper function to find the maximum value in the array
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
