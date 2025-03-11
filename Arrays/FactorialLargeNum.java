package Arrays;

import java.util.Arrays;

public class FactorialLargeNum {
    public static void main(String[] args) {
        int [] arr = factorial(5);
        System.out.println(Arrays.toString(arr));
    }

    public  static  void multiply ( int [] arr ,  int size, int multiplier ){
        int carry = 0;
        for (int i = 0; i < size; i++) {
            int result = (multiplier* arr[i])+ carry;
            arr[i] = result %10;
            carry = result/10;

        }

        // extract the carry

        while(carry > 0){
            arr[size] = carry%10;
            size++;
            carry/=10;
        }
    }

    public static  int [] factorial(int n){
        int [] arr = new int[10000];
        arr[0] = 1;
        int size = 1;

        for(int multiplier = 2; multiplier <= n; multiplier++){
            multiply(arr, size, multiplier);
        }

        int [] result = new int[arr.length];
        System.arraycopy(arr, 0, result, 0, arr.length - 1 + 1);

        return result;


    }
}
