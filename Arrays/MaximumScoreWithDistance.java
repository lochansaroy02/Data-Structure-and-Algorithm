package Arrays;

import java.util.Stack;

public class MaximumScoreWithDistance {
    public static void main(String[] args) {
        int [] arr= {1,2};
        maximumScore(arr);
    }
    public static  void maximumScore( int [] arr){

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                System.out.println(arr[i]+ arr[j]+i-j);
            }
        }
    }


}
