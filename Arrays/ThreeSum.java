package Arrays;

import java.util.Arrays;

public class ThreeSum {
    public static void main(String[] args) {
        int [] arr = {-1,2 ,1, -4};
        System.out.println(threeSumClosest(arr, 1));
    }

    public static void threeSum( int []arr, int target){
        
    }
    public static int  threeSumClosest( int []arr, int target){
        int n = arr.length;
        int ans = Integer.MAX_VALUE;
        Arrays.sort(arr);

        for(int k = 0; k <= n-3; k++){
            int i = k+1;
            int j = n-1;

            while(i < j){
                int sum = arr[i]+ arr[j] + arr[k];


                if(Math.abs((target- sum)) < Math.abs(target- ans)){
                    ans = sum;
                }

                if(sum < target){
                    i++;
                }else {
                    j--;
                }
            }
        }

        return ans;
    }


}
