package Strings;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;

public class CircularString {
    public static void main(String[] args) {
            String str = "leetcode exercises sound delightful";
         boolean ans =    circularString(str);
        System.out.println(ans);
    }

    public static  boolean circularString(String str){

        String [] arr = str.split(" ");
        if(arr.length==1){
            if(arr[0].charAt(0)== arr[0].charAt(arr[0].length()-1)){
                return true;
            }
        }
        for(int i = 0; i< arr.length-1; i++){
           String currWord = arr[i];
           String nextWord = arr[i+1];
           String firstWord = arr[0];
           String lastWord = arr[arr.length-1];


           char firstChar = currWord.charAt(currWord.length()-1);
           char lastChar = nextWord.charAt(0);
            if(firstWord.charAt(0) == lastWord.charAt(lastWord.length()-1) && firstChar== lastChar){
               return true;
            }


        }
        return false;

    }
}
