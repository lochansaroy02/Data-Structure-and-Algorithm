package Strings;

import java.util.Arrays;
import java.util.HashSet;

public class ReverseWords {
    public static void main(String[] args) {
        String ans =    reverseWord("Always indent your code");
        System.out.println(ans);

    }
    public static  String reverseWord( String s){
        String [] words = s.split(" ");
        StringBuilder ans = new StringBuilder();
        reverse(words);
        for( String str: words){
            ans.append(str);
            ans.append(" ");
        }

        return ans.toString();
    }

    public static  void reverse( String [] arr){
        int i = 0;
        int j = arr.length-1;

        while(i< j){
            String temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
