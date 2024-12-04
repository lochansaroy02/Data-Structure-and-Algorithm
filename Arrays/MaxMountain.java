package Arrays;

import java.util.Arrays;

public class MaxMountain {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};

        maxMountain(arr);
    }

    public static void maxMountain(int []arr){
        int n = arr.length;
        int [] LDS = new int[n];
        int [] LIS = new int[n];

        Arrays.fill(LDS, 1);
        Arrays.fill(LIS, 1);

        for (int i = 0; i < n; i++) {
            for (int j = i-1; j >=0; j--) {
                if(arr[i]<arr[j]){

                LIS[i] = Math.max(LIS[i], 1+LIS[j]);
                }
            }
        }

        for (int i = n-1; i >= 0; i--) {
            for (int j = i+1; j <n; j++) {
                if(arr[i]>arr[j]){
                      LIS[i] = Math.max(LIS[i], 1+LIS[j]);

                }
            }
        }
        int removals = n;
        for (int i = 0; i < n; i++) {
            if(LIS[i]>1 && LDS[i]>2 ){
                removals = Math.min(removals, n-LIS[i]-LDS[i]+1);

            }
        }

    }
}
