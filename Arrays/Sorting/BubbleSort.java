package Arrays.Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr = {4,2,6,3,2,5,6,3,3,4,6,8,9,};
        bubbleSort(arr);
    }

    public static  void bubbleSort(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
               if(arr[j] > arr[j+1]){
                   int temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
               }
            }

        }
            System.out.println(Arrays.toString(arr));

    }

}
