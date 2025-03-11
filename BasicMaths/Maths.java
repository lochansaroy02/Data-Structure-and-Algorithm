package BasicMaths;

import java.util.ArrayList;

public class Maths {
    public static void main(String[] args) {
//       ArmstrongNumber(153);

        System.out.println(divisor(16));
    }

    public static  int countDigit ( int n){
        int count = 0;
        int num = n;
        int reverse = 0;
        while ( n > 0){
            // count the digit
            int rem = n %10;
            n = n/10;
            count++;
            // reverse the digit
            reverse = reverse* 10+ rem;

        }
        //check palindrome
        if(reverse == num){
            System.out.println("Digit is Palindrome");
        }
        System.out.println(reverse);

        return count;
    }

    public static  int GCD ( int  a , int b){
        int result = Math.min(a, b);
        while( result> 0){
            if( a % result ==0 && b % result== 0 ){
                break;
            }
            result --;

        }
        return result;
    }

    public static  void ArmstrongNumber( int n){
        int num = n;
        double ans = 0;

        while( n > 0){
            int  digit = n % 10;
            n = n/10;
            double digitCube = Math.pow(digit, 3);
            ans = ans+ digitCube;
        }
        if(ans == num){
            System.out.println("Number is Armstrong");
        }

    }

    public static ArrayList<Integer> divisor( int n ){
        ArrayList< Integer> list = new ArrayList<>();
        double sqrtN = Math.sqrt(n);
        for (int i = 1; i <  sqrtN; i++) {
            if(n%i== 0 ){
                list.add(i);
            }
            if(i!= n/i){
                list.add(i);
            }
        }
        return list;
    }
}
