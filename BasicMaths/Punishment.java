package BasicMaths;

public class Punishment {
    public static void main(String[] args) {
        System.out.println(punishment(39));
    }

    public static int punishment( int  n){
        int ans = 0;

        for (int currNum = 0; currNum <= n; currNum++) {
            int square = currNum* currNum;
            if(check(square, 0, currNum)){
                ans+= square;
            }
        }
        return ans;
    }

    public  static  boolean check( int square, int sum , int num){

        if(num == 0 ){
            return sum == num;
        }
        return check(square/10 ,sum +square %10, num)  ||  check(square/100 ,sum +square %100, num) ||  check(square/1000 ,sum +square %1000, num);
    }
}
