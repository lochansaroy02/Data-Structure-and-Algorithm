package SlidingWindow;


import java.util.HashSet;

public class Variable {
    public static void main(String[] args) {
            int [] arr = {2,3,1,2,4,3};
            int  ans = maxSumSubArray(arr, 7);
            System.out.println(ans);

    }

    // make calculations
    //check the sum given condition


    public static  int maxSumSubArray(int [] arr, int k){
        int i =0;
        int j = 0;
        long sum = 0;
        int min  = Integer.MIN_VALUE;
        int n = arr.length;
        while(j< n){


            sum += arr[j];

            while (sum > k) {
                sum -= arr[i];
                i++;
            }

            if (sum == k) {
                min = Math.min(min, j - i + 1);
            }

            j++;


            }
    return  min;
    }


    public static  int longestSubStringWithoutRepeatingChar( String s){
        int i =0;
        int n = s.length();
        int j = 0;
        HashSet<Character> st = new HashSet<>();
        return i;
    }
}
