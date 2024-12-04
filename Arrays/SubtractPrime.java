package Arrays;

import java.util.Arrays;

public class SubtractPrime {



    public static void main(String[] args) {

    }
    static  boolean[] isPrime = new boolean[1000];
    public static void sieve(){
        Arrays.fill(isPrime , true);
        isPrime[0]= false;
        isPrime[1] = false;
        for (int i = 1; i <1000 ; i++) {
            if(isPrime[i]){
                for (int j = i*i; j <1000 ; j+=i) {
                    isPrime[i] = false;
                }
            }
        }
    }
    public static boolean subtractPrime(int [] arr){
        int n = arr.length;
        sieve();
        for (int i = n-2; i >=0 ; i--) {
            if(arr[i]< arr[i+1]){
                continue;
            }
            for (int p = 2; p < arr[i]; p++) {
                if(isPrime[p]){
                    continue;
                }

                if(arr[i]- p < arr[i+1]){
                   arr[i]-=p;
                   break;
                }
            }

            if(arr[i]>= arr[i+1]){
                return false;
            }
        }
        return true;
    }
}
