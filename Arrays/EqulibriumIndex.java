package Arrays;

import java.util.Arrays;

public class EqulibriumIndex {
    public static void main(String[] args) {
            int [] arr = {0 ,-10, 3, 2, 9 ,10, -3, -2, 9 ,-9};
        System.out.println(solve(arr));
    }
    public static  int  solve(int [] arr){
        int ans = -1;
        int [] leftSum = new int[arr.length];
        int [] rightSum = new int[arr.length];
        leftSum[0] = arr[0];
        rightSum[arr.length-1]  = arr[arr.length-1];
        int i = 1; int j = arr.length-2;
        while( i< arr.length  || j> 0){
            leftSum[i] = leftSum[i-1]+arr[i];
            rightSum[j] = rightSum[j+1]+ arr[j];
            i++;
            j--;
        }
        for (int k = 0; k < rightSum.length; k++) {
            rightSum[k] = rightSum[k] - arr[k];
        }  for (int k = 0; k < leftSum.length; k++) {
            leftSum[k] = leftSum[k] - arr[k];
        }


        System.out.println(Arrays.toString(leftSum));
        System.out.println(Arrays.toString(rightSum));

        for (int k = 0; k < arr.length; k++) {
            if(rightSum[k]== leftSum[k]){
                ans = k;
            }
        }

        return ans;
    }
}
