package Arrays.Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int [] arr = {2, -3, 4, 1, 1, 7};
        int ans  =  missingPositiveNumber(arr);
        System.out.println(ans);
    }

    //for one indexed
    static void sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i]; // for one indexed
            if ( arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {

                i++;
            }
        }

    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    // Questions
    // Missing Number

    public  static  int missingNumber( int [] arr){
            int i = 0;
            while (i < arr.length) {
                int correct = arr[i]; // for one indexed
                if ( arr[i]< arr.length && arr[i] != arr[correct]) {
                    swap(arr, i, correct);
                } else {

                    i++;
                }
            }
        for (int index = 0; index < arr.length; index++) {
            if(arr[index]!= index){
                return index;
            }
        }
        return  arr.length;
    }

    public  static   int missingPositiveNumber( int [] arr){
            int i = 0;
            while (i < arr.length) {
                int correct = arr[i];
                if ( arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct]) {
                    swap(arr, i, correct);
                } else {
                    i++;
                }
            }

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
               return index+1;
            }
        }

        return  arr.length+1;
    }
}
