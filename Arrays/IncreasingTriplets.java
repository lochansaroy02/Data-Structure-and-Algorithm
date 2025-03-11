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
        int num3 = arr[0];
            if(num3<= num1){
                num1 = num3;
            } else if (num3 <= num2) {
                num2= num3;
            }else{
                return true;
            }
        }
        return false;

    }
}
