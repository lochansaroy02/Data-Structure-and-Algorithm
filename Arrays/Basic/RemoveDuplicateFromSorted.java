package Arrays.Basic;//package Arrays.Basic;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class RemoveDuplicateFromSorted {
    public static void main(String[] args) {
           int [] arr = {1,1,2,2,3,3};
           removeDuplicateFromSorted(arr);

    }

    public  static  void removeDuplicateFromSorted( int [] arr){
        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]==arr[j]){
                j++;
                arr[j] = arr[i];
            }
        }
        System.out.println(j+1);
    }

    public static  void swap(int a , int b){

        int temp = a;
        a = b;
        b = temp;
        System.out.println(a+""+b);

    }
    public  static  int removeDuplicate( int [] arr){
        HashSet<Integer> mp = new HashSet<>();
        for (int value : arr) {
            mp.add(value);
        }
        int k = mp.size();
        int j  = 0 ;
        for(int x: mp){
            arr[j++] = x;
        }
        return k;
    }
}
