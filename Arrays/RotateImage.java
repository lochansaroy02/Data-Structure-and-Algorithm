package Arrays;

import java.util.Arrays;

public class RotateImage {
    public static void main(String[] args) {
        int [][ ] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        transpose(arr);
    }
    public static void transpose( int [][ ]arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
              int temp = arr[i][j];
              arr[i][j] = arr[j][i];
              arr[j][i] = temp;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }


}
