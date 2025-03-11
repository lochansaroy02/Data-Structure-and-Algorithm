package BasicMaths;

import java.util.ArrayList;
import java.util.Arrays;

public class ClosestPrime {
    public static void main(String[] args) {
            boolean[] arr = isPrime(20);
        System.out.println(Arrays.toString(arr));
    }

    public static  ArrayList<Integer> closestPrime ( int left , int right){
        ArrayList<Integer> ans = new ArrayList<>();
        int diff = Integer.MAX_VALUE;
        // this should have first prime
        int prevPrime = left;
        for(int i = left; i <= right; i++){





        }
        return ans;
    }
    public static  boolean[] isPrime ( int n){
            boolean [] isPrime = new boolean[n+1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;


        for(int i = 2; i*i<= n; i++){
            if(isPrime[i]){
                for (int j = 2; i*j <=n ; j++) {
                    isPrime[i*j] = false;
                }
            }
        }

        return isPrime;
    }
}
