package BinarySearch.BSonAns;

public class DistributeProduct {
    public static void main(String[] args) {
        int [] arr = {100000};
        int n =  3;
        System.out.println(solve(arr,n));
    }

    public static  boolean isPossible(int x, int [] arr, int n){
        for(int prod: arr){
            n-= (prod + x-1)/x;
            if(n<0){
                return false;
            }
        }

        return true;
    }
    public  static  int solve(int [] arr, int n){
        int l = 1;
        int r = Integer.MAX_VALUE;
        int result = 0;
        while(l <= r){
            int mid = l+ (r-l)/2;
            if(isPossible(mid, arr, n)){
                result = mid;
                r = mid-1;
            }else{
                l = mid+1;
            }
        }
        return result;

    }
}
