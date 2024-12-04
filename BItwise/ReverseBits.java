package BItwise;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseBits {
    public static void main(String[] args) {
            reverseBit(3);
        System.out.println( reverse("abcd"));

    }

    public  static int reverseBit( int n){
        String s = Integer.toBinaryString(n);

    return 2;
    }
    public  static  String reverse( String s){
        int i = 0;
        char [] arr = s.toCharArray();
        int j = arr.length-1;

        while(i<=j){
            char temp = arr[i];
            arr[i]= arr[j];
            arr[j]= temp;
            i++;
            j--;
        }
        return Arrays.toString(arr);

    }
}
