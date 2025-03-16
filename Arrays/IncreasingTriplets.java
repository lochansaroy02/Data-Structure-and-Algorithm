package Arrays;

public class IncreasingTriplets {
    public static void main(String[] args) {
        int [] arr = {2,1,5,0,4,6};
        System.out.println(increasingTriplets(arr));
    }

    public static  boolean increasingTriplets(int [] arr){
        int num1 = Integer.MAX_VALUE;
        int num2 = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            num1 = arr[0];
        }
        return false;

    }
}
