package Arrays;

import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        int [] arr = {2,2,1,1,1,2,2};
        System.out.println(majorityElement2(arr));

    }

    public static  int majorityElement1(int [] arr){
        int candidate = arr[0];
        int count = 1;

        for (int i = 1; i < arr.length; i++) {
            if(count==0){
                candidate = arr[i];

            }
            if(candidate!= arr[i]){
                count--;

            }

        }
        return candidate;


    }
    public static  int majorityElement2(int [] arr){
        Arrays.sort(arr);
        return arr[arr.length/2];
    }
}
