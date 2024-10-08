package Arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

public class GenerateLargestNumber {
    public static void main(String[] args) {
        int [] arr = {3,30,34,5,9};
        generateNumber(arr);
    }
    public static  void generateNumber(int [] arr){
//        StringBuilder first = new StringBuilder();
//        StringBuilder mid = new StringBuilder();
//        StringBuilder last = new StringBuilder();

        String [ ] words = new String[arr.length];


        

        for (int i = 0; i < words.length; i++) {
            words[i]  = Integer.toString(arr[i]);
        }
        int i = 0;
//        for(String word : words){
//            int index = 0;
//            if(word.length()== 1){
//               first.append(word.charAt(0)).append(" ");
//            }
//
//            if(word.charAt(word.length()-1)=='0'){
//                last.append(word);
//            }
//        }

    }

}
