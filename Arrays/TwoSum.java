package Arrays;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int [] arr = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(arr, 9)));
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
}
