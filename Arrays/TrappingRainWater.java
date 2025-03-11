package Arrays;

import java.util.Arrays;

public class TrappingRainWater {
    public static void main(String[] args) {
            int [] arr = {4,2,0,3,2,5};
        System.out.println(trappingRain(arr));
    }

    public static  int trappingRain(int [] arr){
        int n = arr.length;
        int water = 0;

        int [] leftMax = new int[n];
        int [] rightMax = new int[n];


        getLeftMax(arr,leftMax);
        getRightMax(arr,rightMax);
        for (int i = 0; i < n; i++){
            water += Math.min(leftMax[i], rightMax[i])- arr[i];
        }

        return water;
    }

    public  static   void getLeftMax ( int [] arr, int [] leftMax ){
            leftMax[0] = arr[0];
            for(int i = 1; i< arr.length; i++){
                leftMax[i] = Math.max(leftMax[i-1], arr[i]);
            }

        System.out.println(Arrays.toString(leftMax));
    }

    public  static   void getRightMax ( int [] arr, int [] rightMax ){
            rightMax[arr.length-1] = arr[arr.length-1];
            for(int i = arr.length-2 ; i>= 0; i--){
               rightMax [i] = Math.max(rightMax[i+1], arr[i]);
            }
        System.out.println(Arrays.toString(rightMax));

    }
}
