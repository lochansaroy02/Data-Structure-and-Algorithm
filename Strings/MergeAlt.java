package Strings;

import java.util.Arrays;

public class MergeAlt {
    public static void main(String[] args) {
        merge("abc", "12345");
    }

    public static  String merge(String s1, String s2){
        char [] arr = new char[s1.length()+s2.length()];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i< s1.length() &&  j< s2.length()){
            arr[k] = s1.charAt(i);
            i++;
            k++;
            arr[k] = s2.charAt(j);
            j++;
            k++;
        }

        while (i < s1.length()) {
            arr[k] = s1.charAt(i);
            i++;
            k++;
        }

        // If s2 has remaining characters, add them
        while (j < s2.length()) {
            arr[k] = s2.charAt(j);
            j++;
            k++;
        }


        String ans = new String(arr);
        return ans;
    }
}
