package MixedProblems;

public class Day5 {
    public static void main(String[] args) {
            getLucky("leetcode", 2);
    }

    public static void getLucky   (String s , int k){
        int ans = 0;
            for (int i = 0; i <k; i++) {

               ans = converter(s);
               ans = digitSum(ans);

        }
         System.out.println(ans);


    }
    public static  int   converter( String s){
        int n = s.length();
        int sum = 0;
            for (int i = 0; i < n; i++) {
                char c = s.charAt(i);
                int number = c-96;
                 sum += digitSum(number);
//                System.out.println(sum);

        }
        return sum;
    }
    public static  int digitSum ( int  n ){
            int sum = 0;

            while(n > 0){
                int rem = n%10;
                sum+=rem;
                n/=10;
            }
            return sum;
    }

}
