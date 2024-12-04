package SlidingWindow;

public class ShortestSubarrayWithOR {
    public static void main(String[] args) {

    }
    public static  int subarrayWithOR(int [] arr, int k){
        int ans = 0;
        int i =0;
        int j = 0;
        long or = 0;
        int min  = Integer.MIN_VALUE;
        int n = arr.length;

        while(j< n){


            or |= arr[j];

            while (or > k) {
                or -= arr[i]; //remove the or
                i++;
            }

            if (or == k) {
                min = Math.min(min, j - i + 1);
            }

            j++;


        }
        return  min;


    }
}
