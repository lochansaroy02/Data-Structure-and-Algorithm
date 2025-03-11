package Strings;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class StringMatchingInArray {
    public static void main(String[] args) {
            String [] arr = {"blue","green","bu"};
        System.out.println(matching(arr));
    }

    public static ArrayList<String> matching(String [] arr){
        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr.length; j++) {
                String s1 = arr[i];
                String s2 = arr[j];
                if(i!= j ){
                    if(s1.contains(s2)){
                        ans.add(s2);
                    }


                }

            }
        }
        return ans;
    }
}
