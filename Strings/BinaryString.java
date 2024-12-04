package Strings;

import java.util.Arrays;

public class BinaryString {
    public static void main(String[] args) {
        System.out.println(solve(2, 2));
    }
    public static  char solve ( int n, int k){
       if(n== 1){
           return  '0';
       }
       int length = ( 1<<n)-1;
       if(k< Math.ceil(length/2.0)){
           return solve(n-1,k);
       }
       else if(k== Math.ceil(length/2.0)){
           return '1';
       }
       else{
           char ch = solve(n-1, length-(k-1));
           return  ch=='1'? '0': '1';

       }


    }



}
