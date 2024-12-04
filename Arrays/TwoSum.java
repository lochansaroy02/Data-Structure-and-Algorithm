package Arrays;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int [] arr = {-1,0};
        System.out.println(Arrays.toString(twoSum2(arr, -1)));
    }
    public static  int [] twoSum(int [] arr , int target){
        int [] ans = new int[2];
        int i =0;
        int j = arr.length-1;

        while(i<=j){
            int sum = arr[i]+arr[j];
            if(sum==target){
                ans[0] = i;
                ans[1] = j;
            }else if(sum> target){
                i++;
            }else{
                j--;
            }
        }
        return ans;
    }

    public static  int [] twoSum2(int [] arr, int target){
        int [] ans = new int[2];
        //array is sorted
        int i = 0;
        int j = arr.length-1;
        while(i<j){
            int sum = arr[i] + arr[j];
            if(sum==target){
                ans[0] = i+1;
                ans[1] = j+1;
                break;

            }else if( sum> target){
                j--;

            }else{
                  i++;
            }
        }
        return ans;
    }
}
