package Arrays;

public class PairAreDivisible {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        divisible(arr,3);
    }

    public static  void  divisible(int [] arr , int k){
        for (int j : arr) {
            for (int value : arr) {
                if ((j + value) % k == 0)
                    System.out.println(j + " " + value);
            }
        }
    }
}
