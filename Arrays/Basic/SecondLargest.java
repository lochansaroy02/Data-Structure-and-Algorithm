package Arrays.Basic;

public class SecondLargest {
    public static void main(String[] args) {

    }
    public static int  secondLargest( int [] arr){
       int small = Integer.MAX_VALUE;
       int secondSmall = Integer.MAX_VALUE;
       int large = Integer.MIN_VALUE;
       int secondLarge = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            if(curr < secondSmall){
                small = curr;
                secondSmall = curr;
            }
            if(curr > secondLarge){
                secondLarge = curr;
                large = curr;
            }
        }
        return secondLarge;
    }
}
