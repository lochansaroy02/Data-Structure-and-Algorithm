package Arrays.Basic;

import java.util.Arrays;

public class Rotate {
    public static void main(String[] args) {
        int [] arr = {2,3,4,5,6};
        leftRotate(arr);
    }
    public static void leftRotate(int [] arr){
        int temp  = arr[arr.length-1];
        //shift direction will right to left
        for(int i = arr.length-2; i>=0; i--){
            arr[i+1] = arr[i];
        }
        arr[0] = temp;

        System.out.println(Arrays.toString(arr));
    }
    public static void rightRotate(int [] arr){
        int temp  = arr[arr.length-1];
        //shift direction will right to left
        for(int i = arr.length-2; i>=0; i--){
            arr[i+1] = arr[i];
        }
        arr[0] = temp;

        System.out.println(Arrays.toString(arr));
    }

}
