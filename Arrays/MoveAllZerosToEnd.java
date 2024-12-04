package Arrays;

import java.util.Arrays;

public class MoveAllZerosToEnd {

    public static void main(String[] args) {
        int [] arr = {1, 2, 0, 3, 4, 0, 5, 0};
        moveZero(arr);
    }
    public static void moveZero( int [] arr){
        int lastNonZeroIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0){
              int temp = arr[lastNonZeroIndex];
              arr[lastNonZeroIndex] = arr[i];
              arr[i] = temp;
            }else {
                continue;
            }
            lastNonZeroIndex++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
