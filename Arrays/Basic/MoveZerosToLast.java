package Arrays.Basic;

import java.util.Arrays;

public class MoveZerosToLast {
    public static void main(String[] args) {
            int [] arr = {1 ,0 ,2 ,3 ,0 ,4 ,0 ,1};
            moveZero(arr);
    }

    public static  void moveZero(int [] arr){
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0){
                arr[index] = arr[i];
                index++;
            }
        }

        while(index< arr.length){
            arr[index] = 0;
            index++;
        }

        System.out.println(Arrays.toString(arr));

    }
}
