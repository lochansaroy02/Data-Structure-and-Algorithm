package Arrays;

import java.util.Arrays;

public class RotateTheArray {
    public static void main(String[] args) {
        int [] arr = {-1,-100,3,99}; //Output: [3,99,-1,-100]
        rotate(arr,2);
    }
    public  static  void rotateFunction(int [] arr){
        int temp = arr[0];
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<0){
               i++;
            }else{
               arr[i-1] = arr[i];
            }

        }
        arr[arr.length-1] = temp;

    }

    public static  void rotate(int []arr,int k){
        int i = 0;
        while(i<=k){
            rotateFunction(arr);
            i++;
        }

        System.out.println(Arrays.toString(arr));
    }
}
