package Strings;

import java.util.Arrays;

public class MaximumSwap {
    public static void main(String[] args) {
            int [] arr = {9,9,3,7};
        System.out.println(maxSwap(9937));
    }

    public static  int maxSwap(int num){
        String s =  Integer.toString(num);
        int n = s.length();
        int [] maxArr = new int[n];
        maxArr[n-1] = n-1;

        for (int i = n-2; i >=0 ; i--) {
           int index = maxArr[i+1];
           char element = s.charAt(index);
           if(s.charAt(i)> element){
               maxArr[i] = i;

           }else{
               maxArr[i] = index;
           }

        }


            for (int i = 0; i < n; i++) {
                int index = maxArr[i];
                char element = s.charAt(index);

                if(s.charAt(i) < element){
                    char [] charArr = s.toCharArray();
                    char temp = charArr[i];
                     charArr[i] = charArr[index];
                     charArr[index] = temp;

                     return Integer.parseInt(new String(charArr));
                }
            
        }

       return num;
    }
}
