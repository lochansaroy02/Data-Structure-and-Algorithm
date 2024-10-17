package Interval;

import java.util.ArrayList;
import java.util.Arrays;

//228
public class SummaryRange {
    public static void main(String[] args) {
            int [] arr = {0,2,4,5,6,7};
            summaryRange(arr);
    }
    public static  void summaryRange(int [] arr){
        Arrays.sort(arr);
        ArrayList<String> ans = new ArrayList<>();
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < arr.length-1; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            if(arr[i]+1== arr[i+1]){
                s.append((char) arr[i]);
            }
            ans.add(s.toString());
        }
        System.out.println(ans);



    }


}

