package Reacursion;

public class Basic {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4};
        System.out.println(sumOfArray(arr, 0, 0));
    }
    public static  void printName ( int n){
        if( n == 0){
            return;
        }
        printName(n-1);
        System.out.println(n);
    }
    // This approach is not suitable so we will optimise it in DP
    public static int factorial( int n){
        if( n < 1){
            return 1;

        }
        return  n * factorial(n-1);
    }

    public static  void reverserString( String s, int index ){
        if(index == s.length()){
            return;
        }

        reverserString(s, index+1);
        System.out.print(s.charAt(index)+"");
    }

    public static  int fibonacci( int n){
        if( n == 0) return  0;
        if( n == 1) return 1;

        return fibonacci(n-1)+ fibonacci(n-2);
    }

    public static  int  sumOfN( int n, int sum){
        if(n==0){
            return sum;
        }
        return  sumOfN(n-1,sum+n);
    }

    public static  int sumOfArray( int [] arr, int sum, int index){
        if(index== arr.length){
            return sum;
        }
        return sumOfArray(arr, sum+ arr[index], index+1);
    }

    public  static  int maxElement( int [] arr, int index , int max){
        if( index== arr.length){
            return max;
        }
        max = Math.max(max, arr[index]);
        return max;
    }



}
