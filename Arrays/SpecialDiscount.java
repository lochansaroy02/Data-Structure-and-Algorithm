package Arrays;

import java.util.Arrays;

public class SpecialDiscount {
    public static void main(String[] args) {
            int [] arr = {10,1,1,6};
        System.out.println(Arrays.toString(specialDiscount(arr)));
    }

    public static  int [] specialDiscount( int [] arr){

        int [] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int j = i+1;
            while(j < arr.length && arr[j] > arr[i]){
                j++;
            }
            if(j < arr.length && arr[j] <= arr[i]){
                ans[i] = arr[i]- arr[j];

            }else{
                ans[i] = arr[i];
            }

        }
        return ans;
    }
}
