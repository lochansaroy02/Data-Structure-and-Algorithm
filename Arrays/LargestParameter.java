package Arrays;

import java.util.Arrays;

public class LargestParameter {
    public static void main(String[] args) {
        int [] arr = {3,1,2,4};
        System.out.println(largestPerimeter(arr));
    }

    public static  int largestPerimeter(int[] arr) {
        int n = arr.length;

        Arrays.sort(arr);
        for(int i = n-3; i>=0; i--) {

            if(arr[i] + arr[i+1] > arr[i+2]) //a + b > c
                return arr[i] + arr[i+1] + arr[i+2];
        }


        return 0;
    }


}
