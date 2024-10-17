package Arrays.Sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int [] arr = {3,4,0,1};
        sort(arr);
    }
    static void sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (arr[i] != arr[correct]) {
                swap(arr, i , correct);
            } else {

                i++;
            }
        }
        System.out.println(i);
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
