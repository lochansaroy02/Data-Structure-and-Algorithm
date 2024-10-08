package Strings;

import java.util.*;

public class TimeZone {
    public static void main(String[] args) {
//
    }
    public static  int time(List<String> arr){
        int min = Integer.MAX_VALUE;
         int [] ans = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            String s = arr.get(i);
            int minutes = ( Integer.parseInt(s.substring(0,2))*60) + Integer.parseInt(s.substring(3,5));
            ans[i] = minutes;
        }




        Arrays.sort(ans);
        for (int i = 0; i < ans.length-1; i++) {
            int diff = ans[i+1]-ans[i];
            if(diff< min){
                min = diff;

            }

        }

        int edge = ans[0]+ (1440 - ans[ans.length-1]);
        if(min > edge){
            min= edge;
        }
       return min;


    }
}
