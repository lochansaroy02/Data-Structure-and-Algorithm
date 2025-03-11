package Arrays;

import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
//        System.out.println(Arrays.toString(nextPermutation(123)));
    }

    public  static  void swap( int a, int b){
        int temp = a;
        a = b;
        b = temp;
    }

    public  static  int [] nextPermutation ( int [] arr){
       int n = arr.length;


       int golaIndex = -1;
       int [] ans = new int[arr.length];

       for(int i = n-1; i >= 0; i--){
           if( arr[i-1]< arr[i]){
               golaIndex = i-1;
               break;
           }

           // swap index
           int swapIndex = golaIndex;

           for( int j = n-1; j >= golaIndex+1; j--){
               if( arr[i-1]> arr[golaIndex]){
                   swapIndex = j;
                   break;
               }

           }
           swap(arr[swapIndex], arr[golaIndex]);
           //reverse the array from golaIndex to end

       }
       return ans ;
    }
}
