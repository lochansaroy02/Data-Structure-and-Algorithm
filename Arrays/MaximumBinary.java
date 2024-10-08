package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaximumBinary {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};  // Example array
        List<int[]> permutations = new ArrayList<>();

//        recurPermute(0, arr, );


    }
    public static  void binary(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(Integer.toBinaryString(arr[i])+" ");
        }
        System.out.println();
    }

    public static void recurPermute(int index, int[] nums, List < List < Integer >> ans) {
        if (index == nums.length) {
            List < Integer > ds = new ArrayList < > ();
            for (int num : nums) {
                System.out.println(Arrays.toString(nums));
            }
            ans.add(new ArrayList < > (ds));
            return ;
        }
        for (int i = index; i < nums.length; i++) {
            swap(i, index, nums);
            recurPermute(index + 1, nums, ans);
            swap(i, index, nums);
        }

    }

    private static void swap(int i, int j , int [] arr) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
}
