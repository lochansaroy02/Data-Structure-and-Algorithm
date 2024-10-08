package Arrays;

import java.util.Arrays;

public class ProductExceptItself {
    public static void main(String[] args) {
        int [] arr = {-1,1,0,-3,3};
        product(arr);
    }
    public  static  void product( int [] arr){
        int [] left = new int[arr.length];
        int [] right = new int[arr.length];
        left[0] =1;
        int prod = 1;
        for (int i = 1; i < left.length; i++) {
            left[i] = left[i-1]*arr[i-1];
        }
        System.out.println(Arrays.toString(left));
    }
}
