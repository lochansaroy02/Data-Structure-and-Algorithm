package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class UncommonWord {
    public static void main(String[] args) {
//            uncommon("this is an apple");
        String s1 = "apple apple apple";
        String s2 = "banana";
        uncommon(s1,s2);
    }

    public static  void uncommon(String s1, String s2 ){

        String [] words1 = s1.split(" ");
        String [] words2 = s2.split(" ");
        ArrayList<String > list = new ArrayList<>();
        int i = 0;
        int j =0;
        while( i< words1.length && j<words2.length) {
            if (!Objects.equals(words1[i], words2[j])){
                list.add(words1[i]);
                list.add(words2[j]);
            }
            i++;
            j++;
        }

        System.out.println(list);


    }
}
